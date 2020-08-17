package com.example.cursomc.domain.enums;

/*
 * São tipos de campos que consistem em um conjunto fixo de constantes (static final), 
 * sendo como uma lista de valores pré-definidos. Na linguagem de programação Java, 
 * pode ser definido um tipo de enumeração usando a palavra chave enum.
 */
public enum TipoCliente {
	
	//Salva no banco no tipo string ou grava um número inteiro
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido : " + cod);
	}
}
