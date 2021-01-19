package com.example.cursomc.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.domain.Pedido;
import com.example.cursomc.dto.CategoriaDTO;
import com.example.cursomc.services.PedidoService;

//Inserir anotação para diretiva
//Importação ctrl+shift+o
@RestController
//Preencher palavras ctrl+space
@RequestMapping(value="/pedidos") //
public class PedidoResource {
	
	@Autowired
	private PedidoService service; //Acessando a camada de serviço
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)	//obtendo um dado
	public ResponseEntity<Pedido> find(@PathVariable Integer id) { 
		
		Pedido obj = service.find(id);
	
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Pedido obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
