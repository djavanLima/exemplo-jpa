package br.com.dominio;

import java.io.Serializable;

public class Pessoa implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String email;
	
	public Pessoa()
	{
		
	}
	public Pessoa(Integer id, String nome, String email) 
	{
		
		this.id=id;
		this.nome=nome;
		this.email=email;
		
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}

	
	
	
	
	
	
}
