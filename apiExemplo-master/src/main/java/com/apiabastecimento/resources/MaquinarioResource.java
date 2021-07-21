package com.apiabastecimento.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.apiabastecimento.repositories.IMaquinarioRepository;



@RestController
@RequestMapping


public class MaquinarioResource<Maquinario> {
	
	@Autowired	
	private IMaquinarioRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<Maquinario>>listOperadores(){
		return ResponseEntity.
        status(HttpStatus.OK).
        body(repository.findAll());
		
		
	
			
		
	}
	
	

}
