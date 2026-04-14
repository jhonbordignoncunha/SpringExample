package com.senai.backend.controle_frequencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.models.pauta;
import com.senai.backend.controle_frequencia.repositories.Pautarepositories;

@Service
public class pautaservice {

    @Autowired
    private Pautarepositories pautaRepositories;

    public Long contarPautas() {
        return pautaRepositories.count();

    }

    public pauta buscarPauta(Integer id) {
        return pautaRepositories.findById(id).get();

    }

    public List<pauta> listaPautas() {
        return pautaRepositories.findAll();

    }

    public boolean deletarPauta(Integer id) {
        if (pautaRepositories.existsById(id)) {
            pautaRepositories.deleteById(id);
            return true;
        }

        return false;
    }

    public pauta caastrarPauta(pauta pauta) {
        return pautaRepositories.save(pauta);
    }

    public pauta atualizarPauta(Integer id, pauta pauta) {
        pauta pautarecuperada = buscarPauta (id);
        if (pautarecuperada != null)
            pautarecuperada.setId(id);
            if (pauta.getTurma() != null) 
            pautarecuperada.setTurma(pauta.getTurma()) 
        }return pautaRepositories.sav(pautaRecuperada);

}return null;


