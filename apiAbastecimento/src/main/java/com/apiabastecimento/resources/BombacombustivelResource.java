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

public class BombacombustivelResource {
	
@GetMapping
	public ResponseEntity<List<Nivel>> listquantidadecombustivel() {	
			return ResponseEntity.
					status(HttpStatus.OK).
			body(repository.findAll());
	}

@PostMapping        

	public ResponseEntity<List<Bombacombustivel>> salvarNivelcombustivel() {		
	Object nc;
	return ResponseEntity.
	status(HttpStatus.OK).
	body(this.repository.save(p));
	}

@PutMapping
	public void atualizarquantidadecombustivel() {

	}

@DeleteMapping
	public void excluirNivelcombustivel() {

	}
	}

	
	
	


