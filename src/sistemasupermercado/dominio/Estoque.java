
package sistemasupermercado.dominio;

import java.math.BigDecimal;

public class Estoque {
    private Unidade unidade;
    private Produto produto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
    
    public void setUnidade(int idUnidade) {
        this.unidade = new Unidade();
        this.unidade.setIdUnidade(idUnidade);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public void setProduto(int codigo) {
        this.produto = new Produto();
        this.produto.setIdProduto(codigo);
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
