
package sistemasupermercado.servicos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import sistemasupermercado.dao.VendaDAOImpl;
import sistemasupermercado.dominio.Estoque;
import sistemasupermercado.dominio.ItemVenda;
import sistemasupermercado.dominio.Venda;
import sistemasupermercado.exceptions.PesquisaNulaException;
import sistemasupermercado.exceptions.RetornoDeAlteracaoDeDadosInesperadoException;
import sistemasupermercado.interfaces.dao.VendaDAO;

public class VendaServico {
    VendaDAO vendaDAO;
    
    public Venda inserir(Venda venda) {
        vendaDAO = new VendaDAOImpl();
        
        venda.setFinalizada(false);
        venda.setData(Calendar.getInstance());
        venda.getData().setTimeInMillis(System.currentTimeMillis());
        try {
            verificarResultado(vendaDAO.inserir(venda));
            venda.setIdVenda(vendaDAO.obterUltimoID());
            vendaDAO.fecharConexao();
            return venda;
        } catch(SQLException ex) {
            throw new RuntimeException("SQLException (Erro ao inserir a venda):\n" + ex.getMessage());
        }
    }
    
    public Venda pesquisar(Venda venda) {
        vendaDAO = new VendaDAOImpl();
        try {
            venda = vendaDAO.pesquisar(venda);
            vendaDAO.fecharConexao();
            verificarPesquisa(venda);
            venda.setSessao(new SessaoServico().pesquisar(venda.getSessao()));
            venda.setItens(new ItemVendaServico().listar(venda));
            return venda;
        } catch(SQLException ex) {
            throw new RuntimeException("SQLException (Erro ao pesquisar a venda):\n" + ex.getMessage());
        }
    }
    
    public List<Venda> listarVendasSessao(int idSessao) {
        vendaDAO = new VendaDAOImpl();
        try {
            List<Venda> vendas = vendaDAO.listarVendasSessao(idSessao);
            
            vendaDAO.fecharConexao();
            return vendas;
        } catch(SQLException ex) {
            throw new RuntimeException("SQLException (Erro ao listar as vendas):\n" + ex.getMessage());
        }
    }
    
    public List<Venda> listarVendasUnidade(int idUnidade) {
        vendaDAO = new VendaDAOImpl();
        try {
            List<Venda> vendas = vendaDAO.listarVendasDoDia(idUnidade);
            vendaDAO.fecharConexao();
            for (Venda venda : vendas) {
                venda.setSessao(new SessaoServico().pesquisar(venda.getSessao()));
            }
            return vendas;
        } catch(SQLException ex) {
            throw new RuntimeException("SQLException (Erro ao listar as vendas):\n" + ex.getMessage());
        }
    }
    
    
    
    public void finalizarVenda(Venda venda) {
        atualizarEstoque(venda.getItens());
        vendaDAO = new VendaDAOImpl();
        venda.setFinalizada(true);
        try {
            verificarResultado(vendaDAO.alterar(venda));
            vendaDAO.fecharConexao();
        } catch(SQLException ex) {
            throw new RuntimeException("SQLException (Erro ao finalizar a venda):\n" + ex.getMessage());
        }
    }
    
    private void atualizarEstoque(List<ItemVenda> itens) {
        Estoque estoque = new Estoque();
        EstoqueServico estoqueServico = new EstoqueServico();
        
        for (ItemVenda itemVenda : itens) {
            if (!itemVenda.isCancelado()) {
                estoque.setProduto(itemVenda.getProduto());
                estoque.setUnidade(itemVenda.getVenda().getSessao().getUsuario().getUnidade());


                Estoque estoqueAuxiliar = estoqueServico.pesquisar(estoque);
                estoque.setQuantidade(estoqueAuxiliar.getQuantidade().subtract(itemVenda.getQuantidade()));
                
                // Verifica se o produto acabou - caso tenha acabado não há necessidade de calcular o valor em estoque
                if (estoque.getQuantidade().compareTo(BigDecimal.ZERO) == 0){
                    estoque.setValorTotal(BigDecimal.ZERO);
                } else {
                    BigDecimal valorUnitarioMedio = estoqueAuxiliar.getValorTotal().divide(estoqueAuxiliar.getQuantidade(), RoundingMode.HALF_UP);
                    BigDecimal valorTotalRetirado = itemVenda.getQuantidade().multiply(valorUnitarioMedio);
                    estoque.setValorTotal(estoqueAuxiliar.getValorTotal().subtract(valorTotalRetirado));
                }

                estoqueServico.alterar(estoque);
            }
        }
    }
    
    private void verificarResultado(boolean result) {
        if (!result)
            throw new RetornoDeAlteracaoDeDadosInesperadoException();
    }

    public void cancelar(Venda venda) {
        vendaDAO = new VendaDAOImpl();
        ItemVendaServico itemVendaServico = new ItemVendaServico();
        itemVendaServico.excluirItens(venda.getIdVenda());
        try {
            verificarResultado(vendaDAO.excluir(venda));
            vendaDAO.fecharConexao();
        } catch(SQLException ex) {
            throw new RuntimeException("SQLException (Erro ao cancelar a venda):\n" + ex.getMessage());
        }
    }

    private void verificarPesquisa(Venda venda) {
        if (venda == null){
            throw new PesquisaNulaException("A pesquisa da venda não retornou resultados!");
        }
    }
}
