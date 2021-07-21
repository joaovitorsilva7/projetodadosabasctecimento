package com.apiabastecimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiabastecimento.domains.Funcionario;
import com.apiabastecimento.domains.Operador;

@Repository
public interface IFuncionarioaRepository extends JpaRepository<Funcionario, Long>{
    //Retorno atributoPesquisado(parametro de pesquisa)
	Funcionario getByNome(String nome);
	 
	Funcionario getByUuid(String uuid);

	Operador findByUuid(String uuid);
		
}