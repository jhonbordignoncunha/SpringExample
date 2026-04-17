package com.senai.backend.controle_frequencia.controllers;

import com.senai.backend.controle_frequencia.ControleFrequenciaApplication;
import com.senai.backend.controle_frequencia.models.pauta;

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

    private final ControleFrequenciaApplication controleFrequenciaApplication;
    @Autowired
    private pautaservice pautaService;

    Pautacontroller(ControleFrequenciaApplication controleFrequenciaApplication) {
        this.controleFrequenciaApplication = controleFrequenciaApplication;
    }

    @GetMapping
    public Long contarpautas() {
        return pautaService.contarPautas();
    }

    @GetMapping
    public pauta buscar() {
        return pautaService.buscarpauta(id);
    }

    @GetMapping("/listar-pautas")
    public List<pauta> listarpauta() {
        return pautaService.listaPautas();
    }

    @DeleteMapping("/deletarpauta/{id}")
    public String deletarPauta(PathVariable Integer id){
        if (pautaservice.deletarpauta(id)) {
            return "pauta excluida com sucesso";
        }
        return "falha na exclusão da pauta";
    }
    @PostMapping ("/salvar-pauta ")
    public pauta cadastrarpauta (@RequestBody pauta pauta); {
        return pautaservice.cadastrarpauta();

    }

    @PutMapping
     public String atualizarpauta("/atualizar-pauta/{id}"){
        @PathVariable integer id,
        @RequestBody pauta Pauta
if (pautaService.atualizarPauta(id, pauta != null))
    return ("pauta atualizada com sucesso");
     }
     return "falha na atualizaçã da pauta";
}

