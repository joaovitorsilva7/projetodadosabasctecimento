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
public class Operador {
	
	
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Id;	
	
	@NotNull
	private String Nome;	
	@NotNull(message = "Sobrenome deve ser preenchido")
	private String Sobrenome;
	
	
	@NotNull
	private double Matricula;	
	@NotNull(message = "O número de cadastro deve ser preenchido")
		
		
	@JsonFormat(IDoperador = "Código do operador")
	private String Idoperador;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("uuid Funcionário")
	@Column(name = "ext_uuid", 
	        updatable = false, 
	        columnDefinition = "varchar(36) not null")
	
	
    private String uuid;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
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
