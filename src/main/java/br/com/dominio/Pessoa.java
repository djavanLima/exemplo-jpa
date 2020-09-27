package br.com.dominio;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Pessoa implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column
	private String nome;
	@Column
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
