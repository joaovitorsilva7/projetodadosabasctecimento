package com.apiabastecimento.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Maquinario {
	
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Id;	
	
	@NotNull
	private String Nome;
	
	@NotNull(message = "Capacidade de trabalho da máquina deve ser inserido")
	private double Capacidadedetrabalho;
	
	
	@NotNull
	private String Modelo;	
	@NotNull(message = "O o modelo de máquina a ser abastecida deve ser preenchida")
		
		
	@JsonFormat(codp = "Patrimônio da máquina")
	private double codigopatrimoniamaq;
	
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("uuid Maquinário")
	@Column(name = "ext_uuid", 
	        updatable = false, 
	        columnDefinition = "varchar(36) not null")
	
	
    private String uuid;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
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
