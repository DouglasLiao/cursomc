package com.example.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	//Essa dependencia é automaticamente instanciada pelo Spring
	@Autowired
	//Dependência do objeto da CategoriaRepository
	private CategoriaRepository repo; //Acessando a camada de repositório
	
	//Operação de buscar uma categoria por código
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		}
}
