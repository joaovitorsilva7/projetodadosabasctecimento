package com.apidadosabastecimento.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apidadosabastecimento.domain.Operador;
import com.apidadosabastecimento.repository.IOperadorRepository;

@RestController
@RequestMapping
public class MaquinarioResource {
	
	@Autowired
	private IOperadorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Operador>> listAllPessoas() {			 
		return ResponseEntity.
			   status(HttpStatus.OK).
			   body( repository.findAll() );
	}
	
	@GetMapping(value = "/{uuid}")
	public ResponseEntity<Operador> buscarPorUuid(@PathVariable String uuid) {	
       	return ResponseEntity.
			   status(HttpStatus.OK).
			   body( repository.getByUuid(uuid) );
	}
	
	@PostMapping()
	public ResponseEntity<Operador> salvarPessoa(@RequestBody Operador p) {

		return ResponseEntity.
				status(HttpStatus.OK).
				body( this.repository.save(p) );
	}
	
	@DeleteMapping(value = "/{uuid}")
	public ResponseEntity<Void> excluirPessoa(@PathVariable String uuid) {
		Operador p = repository.findByUuid(uuid);
		
		if ( p != null ) {
			repository.deleteById(p.getId());
		} 
		
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping()
	public void atualizarNome() {}
}