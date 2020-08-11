package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Categoria;

//Operações de acesso a dados referente a Categoria do tipo Integer
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{

}
