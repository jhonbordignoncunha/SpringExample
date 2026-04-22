package com.senai.backend.controle_frequencia.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.controle_frequencia.models.pauta;


@Repository
public interface Pautarepositories extends JpaRepository <pauta, Integer>  {


    
 
    
}