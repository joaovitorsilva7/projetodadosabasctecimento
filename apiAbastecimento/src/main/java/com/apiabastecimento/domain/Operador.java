package com.apiabastecimento.domain;

import javax.persistence.Entity;

@Entity
public class Operador {
	
	private String nome;
	private String cpf;
	private double matricula;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getMatricula() {
		return matricula;
	}
	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}
	

}
