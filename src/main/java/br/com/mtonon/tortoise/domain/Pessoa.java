package br.com.mtonon.tortoise.domain;

import java.time.LocalDate;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
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
