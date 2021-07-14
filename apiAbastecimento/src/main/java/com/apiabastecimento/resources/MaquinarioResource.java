package com.apiabastecimento.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiabastecimento.domain.Maquinario;

import antlr.collections.List;

@RestController
@RequestMapping

public class MaquinarioResource {

	@GetMapping

	public ResponseEntity<List<Maquinario>> listmarcas() {	
			return ResponseEntity.
					status(HttpStatus.OK).
			body(repository.findAll());
	}

@PostMapping     

	public ResponseEntity<List<Maquinario>> salvarMarcas() {		
	Object m;
	return ResponseEntity.
	status(HttpStatus.OK).
	body(this.repository.save(p));
	}

	@PutMapping
	public void atualizarMarcas() {

	}

@DeleteMapping
	public void excluirMarcas() {

	}
	}

	
	

