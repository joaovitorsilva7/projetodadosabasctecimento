package com.apiabastecimento.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.context.annotation.Lazy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Operador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String matricula;
	
	private String cidade;
	
	@JsonProperty("cidade_uf")
	private String cidadeUF;
	
    @Lazy
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name = "funcionario_id")
	private Operador operador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidadeUF() {
		return cidadeUF;
	}

	public void setCidadeUF(String cidadeUF) {
		this.cidadeUF = cidadeUF;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador p) {
		this.operador = p;
	}

	public Operador getPessoa() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

	
	
	

	