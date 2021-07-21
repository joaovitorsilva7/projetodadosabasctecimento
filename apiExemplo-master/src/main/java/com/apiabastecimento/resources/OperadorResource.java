package com.apiabastecimento.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiabastecimento.domains.Funcionario;
import com.apiabastecimento.repositories.IFuncionarioaRepository;

@RestController
@RequestMapping("/v1/operadores")
public class OperadorResource {
	
	@Autowired
	private IFuncionarioaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> listOperadores() {	
       	return ResponseEntity.
			   status(HttpStatus.OK).
			   body( repository.findAll() );
	}
	
	@PostMapping()
	public void salvarPessoa(@RequestBody Funcionario p) {
		repository.save(p);
	}

}
