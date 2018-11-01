package com.figueiredo.cursomc.services.exceptions;

public class DataIntegrityExceprion extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DataIntegrityExceprion(String msg) {
		super(msg);
	}
	
	public DataIntegrityExceprion(String msg, Throwable cause) {
		super(msg, cause);
	}
	

}
