package com.senai.backend.controle_frequencia.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.controle_frequencia.models.pauta;
import com.senai.backend.controle_frequencia.models.Usuario;


@Repository

public interface Pautarepositories extends JpaRepository <pauta, Integer>  {


    
 
    
}