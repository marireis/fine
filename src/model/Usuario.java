package model;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private  String nome;
	private  String senha;
	
	public Usuario() {
		
	}
	
	public Usuario(Integer id, String nome, String senha) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
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
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String toString() {
	    return id + " " + nome ;
	}
}
