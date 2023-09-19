package br.com.mtonon.tortoise.domain;

import java.time.LocalDate;

public class Pessoa {
	
	private Integer id;
	private String nome;
	private Integer idade;
	private LocalDate dtNascimento;

	public Pessoa(Integer id, String nome, Integer idade, LocalDate dtNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.dtNascimento = dtNascimento;
	}

	public Pessoa(Integer id, String nome, Integer idade) {
		super();

	}

	public String toString(){
		return "Id: " + this.id 
		+ ", Nome: " + this.nome;
	}

	public Pessoa(){
		super();
	}

	public LocalDate getDtNascimento(){
		return this.dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
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
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	

}
