package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Cidade;

//Operações de acesso a dados referente a Categoria do tipo Integer
@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer>{

}
