package com.apiabastecimento.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Funcionario {
	
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
		
		
	@JsonFormat(func = "Função do colaborador")
	private String Funcao;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("uuid Funcionário")
	@Column(name = "ext_uuid", 
	        updatable = false, 
	        columnDefinition = "varchar(36) not null")
	
	
    private String uuid;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
    private Long id;	
		
	private String nome;
	
	private String sobrenome;
	
	
	private double matricula;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getMatricula() {
		return matricula;
	}

	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}
	
	
}
