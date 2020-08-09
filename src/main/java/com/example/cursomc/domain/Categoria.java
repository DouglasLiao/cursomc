package com.example.cursomc.domain;

import java.io.Serializable;

//Implementar Serializable para que os objetos possam ser convertidos para uma sequencia de bytes (gravar arquviso, trafegar em rede etc_
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	//Criar os atributos básicos
	private Integer id;
	private String nome;
	
	//Criar os construtores da classe
	public Categoria() {
	}

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//Criar os getter e Setters 
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

	//criar os hashcode equals (comparar os objetos por valor, não por memória)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
//
	
	
	
	
}
