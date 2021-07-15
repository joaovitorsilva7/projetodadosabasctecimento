package com.apidadosabastecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidadosabastecimento.domain.Maquinario;

public interface IMaquinarioRepository extends JpaRepository<Maquinario, Long>{

}
