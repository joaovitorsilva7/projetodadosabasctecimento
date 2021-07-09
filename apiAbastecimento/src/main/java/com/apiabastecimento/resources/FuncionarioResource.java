package com.apiabastecimento.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiabastecimento.domain.Operador;

import antlr.collections.List;

@RestController
@RequestMapping


public class FuncionarioResource {
	
	
@GetMapping
	public ResponseEntity<List<Funcionario>> listNomes() {	
			return ResponseEntity.
					status(HttpStatus.OK).
			body(repository.findAll());
	}

@PostMapping
	public ResponseEntity<List<Funcionario>> salvarNomes() {		
	Object n;
	return ResponseEntity.
	status(HttpStatus.OK).
	body(this.repository.save(p));
	}

@PutMapping
	public void atualizarNomes() {

	}

@DeleteMapping
	public void excluirNomes() {

	}
	}



