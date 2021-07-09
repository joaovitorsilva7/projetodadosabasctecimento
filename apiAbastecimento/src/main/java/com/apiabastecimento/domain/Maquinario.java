package com.apiabastecimento.domain;

import javax.persistence.Entity;

@Entity
public class Maquinario {
	
	
	private String nome;
	private String marca;
	private String modelo;
	private double capacidadetrabalho;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getCapacidadetrabalho() {
		return capacidadetrabalho;
	}
	public void setCapacidadetrabalho(double capacidadetrabalho) {
		this.capacidadetrabalho = capacidadetrabalho;
	}
	
	
	
	
	

}
