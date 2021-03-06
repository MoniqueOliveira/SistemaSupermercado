
package sistemasupermercado.interfaces.dao;

import java.sql.SQLException;
import java.util.List;
import sistemasupermercado.dominio.Estoque;

public interface EstoqueDAO {
    
    public void fecharConexao() throws SQLException;
    
    public boolean inserir(Estoque obj) throws SQLException;
    
    public boolean alterar(Estoque obj) throws SQLException;
    
    public Estoque pesquisar(Estoque obj) throws SQLException;
    
    public List<Estoque> listar(String pesquisarPor, String texto, int idUnidade) throws SQLException;
}
