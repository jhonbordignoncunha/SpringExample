package com.senai.backend.controle_frequencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.senai.backend.controle_frequencia.models.Usuario;
import com.senai.backend.controle_frequencia.services.usuarioservice;
import jakarta.annotation.Generated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/usuario")
public class Usuariocontroller {

    @Autowired
    private usuarioservice usuarioService;

    @GetMapping("/contar-usuario")
    public Long contarUsuario() {
        return usuarioService.contarUsuarios();
    }

    @GetMapping("/buscar-usuario/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id) {
        return usuarioService.buscarUsuario(id);
    }

    @GetMapping("/listar-usuarios")
    public List<Usuario> listarUsuarios() {
        return usuarioService.ListarUsuario();
    }

    public String deletarUsuario() {
        if (usuarioService.deletarUsuario(id)) {
            return "Usuario deletado com sucesso";
        }
        return "falha ao deletar usuario ";
    }

    @PostMapping("/salvar-usuario")
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.cadastrarusuario(usuario);

    }
    
    @PutMapping("/atualizar-usuario/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }
    public String atualizarUsuario(){
if (usuarioService.atualizarusuario(id, usuario) != null){
    return "usuario atualizado com sucesso";

}
return "falha ao atualizar o  usuario";
    }

}
