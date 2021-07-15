package com.apidadosabastecimento.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apidadosabastecimento.domain.Operador;
import com.apidadosabastecimento.repository.IOperadorRepository;

@RestController
@RequestMapping("/v1/operadores")
public class OperadorResource {
	
	@Autowired
	private IOperadorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Operador>> listPessoas() {	
       	return ResponseEntity.
			   status(HttpStatus.OK).
			   body( repository.findAll() );
	}
	
	@PostMapping()
	public void salvarPessoa(@RequestBody Operador p) {
		repository.save(p);
	}

}
