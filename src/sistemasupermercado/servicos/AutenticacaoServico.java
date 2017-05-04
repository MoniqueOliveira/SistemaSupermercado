/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasupermercado.servicos;

import java.util.List;
import sistemasupermercado.dominio.Usuario;
import sistemasupermercado.exceptions.PesquisaNulaException;

public class AutenticacaoServico {
    
    public Usuario autenticar(Usuario usuario){
	UsuarioServico usuarioServico = new UsuarioServico();
        Usuario usuarioPesquisa = usuarioServico.pesquisar(usuario);

        if (usuarioPesquisa == null) {
            throw new PesquisaNulaException("Usuário inexiste!");
        } else if (!usuarioServico.validarSenha(usuario.getSenha(), usuarioPesquisa.getSenha()))    
            throw new PesquisaNulaException("Senha inválida!");
        return usuarioPesquisa;
    }
}
