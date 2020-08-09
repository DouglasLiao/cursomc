package com.example.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Inserir anotação para diretiva
//Importação ctrl+shift+o
@RestController
//Preencher palavras ctrl+space
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)	//obtendo um dado
	public String listar() {
		return "Rest está funcionando!";
	}
}
