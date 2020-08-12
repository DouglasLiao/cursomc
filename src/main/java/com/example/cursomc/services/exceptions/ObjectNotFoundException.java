package com.example.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	//recebe a mensagem e outra execeção
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
