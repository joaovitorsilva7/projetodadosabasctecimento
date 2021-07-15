package com.apidadosabastecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apidadosabastecimento.domain.Operador;

@Repository
public interface IOperadorRepository extends JpaRepository<Operador, Long>{
    //Retorno atributoPesquisado(parametro de pesquisa)
	
	Operador getByNome(String nome);
	 
	Operador getByUuid(String uuid);

	Operador findByUuid(String uuid);
	
	void deleteByUuid(String uuit);
		
}