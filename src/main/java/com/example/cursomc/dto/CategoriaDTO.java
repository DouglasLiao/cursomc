//Objeto de Transferência de dados
//Um objeto que ele vai ter somente os dados que você precisa para alguma operação

package com.example.cursomc.dto;

import java.io.Serializable;

import com.example.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	
	public CategoriaDTO() {
	}

	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
