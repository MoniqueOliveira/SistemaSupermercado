
package sistemasupermercado.interfaces.dao;

import java.sql.SQLException;
import java.util.List;
import sistemasupermercado.dominio.Sessao;

public interface SessaoDAO {

    public void fecharConexao() throws SQLException;
    
    public boolean inserir(Sessao obj) throws SQLException;

    public boolean alterar(Sessao obj) throws SQLException;

    public List<Sessao> listar(String filtro) throws SQLException;
    
    public Sessao pesquisarSessaoAberta(Sessao obj) throws SQLException;

    public Sessao pesquisar(Sessao obj) throws SQLException;
    
    public int obterUltimoID() throws SQLException;
    
}
