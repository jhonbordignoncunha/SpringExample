package com.senai.backend.controle_frequencia.controllers;

import com.senai.backend.controle_frequencia.models.pauta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.senai.backend.controle_frequencia.services.pautaservice;

@RestController
@RequestMapping("/pauta")
public class Pautacontroller {

    @Autowired
    private pautaservice pautaService;

    @GetMapping
    public Long contarpautas() {
        return pautaService.contarPautas();
    }

    @GetMapping("/buscar-pauta/{id}")
    public pauta buscarPauta(@PathVariable Integer id) {
        return pautaService.buscarPauta(id);
    }

    @GetMapping("/listar-pautas")
    public List<pauta> listarpauta() {
        return pautaService.listaPautas();
    }

    @DeleteMapping("/deletarpauta/{id}")
    public String deletarPauta(@PathVariable Integer id){
        if (pautaService.deletarPauta(id)) {
            return "pauta excluida com sucesso";
        }
        return "falha na exclusão da pauta";
    }
    @PostMapping ("/salvar-pauta ")
    public pauta cadastrarpauta (@RequestBody pauta pauta) {
        return pautaService.caastrarPauta(pauta);

    }

    @PutMapping("/atualizar-pauta/{id}")
     public String atualizarpauta(
        @PathVariable Integer id,
        @RequestBody pauta pauta){
if (pautaService.atualizarPauta(id, pauta) != null){
    return ("pauta atualizada com sucesso");
     }
     return "falha na atualizaçã da pauta";
    }
}

