package com.apiabastecimento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiabastecimento.domains.Operador;
import com.apiabastecimento.repositories.IOperadorRepository;

@Service
public class OperadorService {

	@Autowired
	private IOperadorRepository repository;
	
	public boolean salvarNome(Operador p) {
		if( this.repository.save(p) != null) {
			return true;
		}
		return false;
	}
}
