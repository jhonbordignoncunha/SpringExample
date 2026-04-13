package com.senai.backend.controle_frequencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.senai.backend.controle_frequencia.models.Usuario;
import com.senai.backend.controle_frequencia.Repositories.Usuariorepositories;

@Service
public class usuarioservice {

    @Autowired
    private Usuariorepositories usuariorepositories;

    public Long contarUsuarios() {
        return usuariorepositories.count();
    }

    public Usuario buscarUsuario(Integer id) {
        return usuariorepositories.findById(id).get();
    }

    public List<Usuario> ListarUsuario() {
        return usuariorepositories.findAll();

    }

    public boolean deletarUsuario (Integer id){
                if(usuariorepositories.existsById(id)){
                    usuariorepositories.deleteById(id);
                 return true;

                }
            return false;


}
public Usuario cadastrarusuario(Usuario usuario){
     return usuariorepositories.save(usuario);



}
    public Usuario atualizarusuario (Integer id, Usuario usuario)

        Usuario usuariorecuperado =  buscarUsuario(id);
        if(usuariorecuperado != null)
            usuariorecuperado.setId(id);


        if (usuario.getNome() != null)
            usuariorecuperado.setNome(usuario.getNome());

        
        if(usuario.getDataNascimento() != null){
            usuariorecuperado.setDataNascimento 
            (usuario.getDataNascimento());


        }
        return usuariorepositories.save(usuariorecuperado);
        return null;
}
