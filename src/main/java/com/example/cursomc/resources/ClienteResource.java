package com.example.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cursomc.domain.Cliente;
import com.example.cursomc.services.ClienteService;

//Inserir anotação para diretiva
//Importação ctrl+shift+o
@RestController
//Preencher palavras ctrl+space
@RequestMapping(value="/clientes") //
public class ClienteResource {
	
	@Autowired
	private ClienteService service; //Acessando a camada de serviço
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)	//obtendo um dado
	public ResponseEntity<?> find(@PathVariable Integer id) { //Tipo "?" é qualquer tipo
		
		Cliente obj = service.find(id);
	
		return ResponseEntity.ok().body(obj);
	}
}
