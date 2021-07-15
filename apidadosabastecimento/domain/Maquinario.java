package com.apidadosabastecimento.domain;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Maquinario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String marca;
	
	private String modelo;
	
	private double capacidadetrabalho;
	
	
	@ManyToOne()
	@JoinColumn(name = "operador_id")
		
	private Operador operador;


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

