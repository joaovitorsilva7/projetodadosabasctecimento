package com.apiabastecimento.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bombacombustivel {
	
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Id;	
	
	@NotNull
	private String Marca;
	
	@NotNull(message = "A localização deve ser preenchida")
	private String Localizacao;
	
	
	@NotNull
	private double Status;	
	@NotNull(message = "O horímetro da máquina deve ser preenchido")
		
		
	@JsonFormat(capacidadetrabalho = "Capacidade de trabalho:")
	private String capacidadetrabalho;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("uuid Funcionário")
	@Column(name = "ext_uuid", 
	        updatable = false, 
	        columnDefinition = "varchar(36) not null")
	
	
    private String uuid;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		
	
	
	private String marca;
	private String modelo;
	private String localizacao;
	private double status;
		

		
	
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
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public double getStatus() {
		return status;
	}
	public void setStatus(double status) {
		this.status = status;
	}
	
	
	
}
