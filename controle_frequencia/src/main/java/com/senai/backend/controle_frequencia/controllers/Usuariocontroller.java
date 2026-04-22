package com.senai.backend.controle_frequencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.senai.backend.controle_frequencia.models.usuario;
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
    public usuario buscarUsuario(@PathVariable Integer id) {
        return usuarioService.buscarUsuario(id);
    }

    @GetMapping("/listar-usuarios")
    public List<usuario> listarUsuarios() {
        return usuarioService.ListarUsuario();
    }

    @DeleteMapping("delatar-usuario/{id}")
    public String deletarUsuario(@PathVariable Integer id) {
        if (usuarioService.deletarUsuario(id)) {
            return "Usuario deletado com sucesso";
        }
        return "falha ao deletar usuario ";
    }

    @PostMapping("/salvar-usuario")
    public usuario cadastrarUsuario(@RequestBody usuario usuario) {
        return usuarioService.cadastrarusuario(usuario);

    }

    @PutMapping("/atualizar-usuario/{id}")
    public String atualizarUsuario(@PathVariable Integer id, @RequestBody usuario usuario) {
        if (usuarioService.atualizarusuario(id, usuario) != null) {
            return "usuario atualizado com sucesso";

        }
        return "falha ao atualizar o  usuario";
    }

}
