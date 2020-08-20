package com.example.cursomc.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.services.CategoriaService;

//Inserir anotação para diretiva
//Importação ctrl+shift+o
@RestController
//Preencher palavras ctrl+space
@RequestMapping(value="/categorias") //
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service; //Acessando a camada de serviço
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)	//obtendo um dado
	public ResponseEntity<Categoria> find(@PathVariable Integer id) { //Tipo "?" é qualquer tipo
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Categoria obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/id").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	//Usar o código 201 http pois ele foi criado
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Categoria obj, @PathVariable Integer id){
		obj.setId(id);																			//Garantir que a categoria seja atualizada
		obj=service.update(obj);
		return ResponseEntity.noContent().build();
	}
}
