package com.apiabastecimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IMaquinarioRepository<Maquinario> extends JpaRepository<Maquinario, Long> {
	

}

