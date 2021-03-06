
package sistemasupermercado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistemasupermercado.conexao.ConnectionFactory;
import sistemasupermercado.dominio.Produto;
import sistemasupermercado.interfaces.dao.ProdutoDAO;

public class ProdutoDAOImpl implements ProdutoDAO {
    private final Connection conexao;

    public ProdutoDAOImpl() {
        this.conexao = new ConnectionFactory().getConnection();
    }
    
    @Override
    public boolean inserir(Produto obj) throws SQLException {
        if (obj.getIdProduto()== null) return inserirSemId(obj);
        return inserirComId(obj);
    }
    
    public boolean inserirSemId(Produto obj) throws SQLException {
        String sql = "insert into produtos (descricao, descricao_reduzida, venda_fracionada, id_categoria, "
                + "codigo_de_barras, estocavel) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setString(1, obj.getDescricao());
        pstm.setString(2, obj.getDescricaoReduzida());
        pstm.setBoolean(3, obj.isVendaFracionada());
        pstm.setInt(4, obj.getCategoria().getIdCategoria());
        pstm.setString(5, obj.getCodigoDeBarras());
        pstm.setBoolean(6, obj.isEstocavel());
        int result = pstm.executeUpdate();
        pstm.close();
        return result == 1;
    }
    
    public boolean inserirComId(Produto obj) throws SQLException {
        String sql = "insert into produtos (id_produto, descricao, descricao_reduzida, venda_fracionada, id_categoria, "
                + "codigo_de_barras, estocavel) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, obj.getIdProduto());
        pstm.setString(2, obj.getDescricao());
        pstm.setString(3, obj.getDescricaoReduzida());
        pstm.setBoolean(4, obj.isVendaFracionada());
        pstm.setInt(5, obj.getCategoria().getIdCategoria());
        pstm.setString(6, obj.getCodigoDeBarras());
        pstm.setBoolean(7, obj.isEstocavel());
        int result = pstm.executeUpdate();
        pstm.close();
        return result == 1;
    }

    @Override
    public boolean alterar(Produto obj) throws SQLException {
        String sql = "update produtos set descricao = ?, descricao_reduzida = ?, venda_fracionada = ?, "
                + "id_categoria = ?, codigo_de_barras = ?, estocavel = ? where id_produto = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setString(1, obj.getDescricao());
        pstm.setString(2, obj.getDescricaoReduzida());
        pstm.setBoolean(3, obj.isVendaFracionada());
        pstm.setInt(4, obj.getCategoria().getIdCategoria());
        pstm.setString(5, obj.getCodigoDeBarras());
        pstm.setBoolean(6, obj.isEstocavel());
        pstm.setInt(7, obj.getIdProduto());
        int result = pstm.executeUpdate();
        pstm.close();
        return result == 1;
    }

    @Override
    public boolean excluir(Produto obj) throws SQLException {
        String sql = "delete from produtos where id_produto = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, obj.getIdProduto());
        int result = pstm.executeUpdate();
        pstm.close();
        return result == 1;
    }

    @Override
    public Produto pesquisar(Produto obj) throws SQLException {
        Produto produto = null;
        String sql = "select * from produtos where id_produto = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, obj.getIdProduto());
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            produto = new Produto();
            produto.setIdProduto(rs.getInt("id_produto"));
            produto.setCategoria(rs.getInt("id_categoria"));
            produto.setCodigoDeBarras(rs.getString("codigo_de_barras"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setDescricaoReduzida(rs.getString("descricao_reduzida"));
            produto.setVendaFracionada(rs.getBoolean("venda_fracionada"));
            produto.setEstocavel(rs.getBoolean("estocavel"));
        }
        pstm.close();
        return produto;
    }

    @Override
    public List<Produto> listar(String pesquisaPor, String texto) throws SQLException {
        String filtro = "";
        switch(pesquisaPor) {
            case ("ID"):
                filtro = "where id_produto like '%" + texto + "%'";
                break;
            case ("Código de barras"):
                filtro = "where codigo_de_barras like '%" + texto + "%'";
                break;
            case ("Descrição"):
                filtro = "where descricao like '%" + texto + "%'";
                break;
            case ("Descrição reduzida"):
                filtro = "where descricao_reduzida like '%" + texto + "%'";
                break;
            case ("Categoria"):
                filtro = "left join categorias_produtos on produtos.id_categoria = categorias_produtos.id_categoria "
                        + "where categorias_produtos.descricao like '%" + texto + "%'";
        }
        return listar(filtro);
    }
    
    private List<Produto> listar(String filtro) throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "select * from produtos " + filtro;
        PreparedStatement pstm = conexao.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            Produto produto = new Produto();
            produto.setIdProduto(rs.getInt("id_produto"));
            produto.setCategoria(rs.getInt("id_categoria"));
            produto.setCodigoDeBarras(rs.getString("codigo_de_barras"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setDescricaoReduzida(rs.getString("descricao_reduzida"));
            produto.setVendaFracionada(rs.getBoolean("venda_fracionada"));
            produto.setEstocavel(rs.getBoolean("estocavel"));
            
            produtos.add(produto);
        }
        pstm.close();
        return produtos;
    }

    @Override
    public void fecharConexao() throws SQLException {
        this.conexao.close();
    }
    
}
