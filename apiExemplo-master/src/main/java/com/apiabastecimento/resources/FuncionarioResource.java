package com.apiabastecimento.resources;

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

import com.apiabastecimento.domains.Operador;
import com.apiabastecimento.domains.Funcionario;
import com.apiabastecimento.services.OperadorService;
import com.apiabastecimento.services.FuncionarioService;

@RestController
@RequestMapping("/v2/Operadores")
public class FuncionarioResource {

	@Autowired
	private FuncionarioService svc;
	
	@Autowired
	private OperadorService eSvc;

	@GetMapping
	public ResponseEntity<List<Funcionario>> listAllPessoas() {			 
		return ResponseEntity.
				status(HttpStatus.OK).
				body( svc.listarPessoas() );
	}

	@GetMapping(value = "/{uuid}")
	public ResponseEntity<Operador> buscarPorUuid(@PathVariable String uuid) {	
		return ResponseEntity.
				status(HttpStatus.OK).
				body( svc.listarPessoaPorUuid(uuid) );
	}

	@PostMapping()
	public ResponseEntity<Funcionario> salvarPessoa(@RequestBody Funcionario p) {

		return ResponseEntity.
				status(HttpStatus.OK).
				body( this.svc.salvarPessoa(p) );
		
	}

	@DeleteMapping(value = "/{uuid}")
	public ResponseEntity<Void> excluirPessoa(@PathVariable String uuid) {
		if (svc.excluirPessoa(uuid)) {
			return ResponseEntity.status(HttpStatus.OK).build();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

	@PutMapping()
	public void atualizarNome() {}

	@DeleteMapping(value = "/{uuid}/enderecos/{id}")
	public ResponseEntity<?> excluirEndereco(@PathVariable("uuid") String uuid, 
			                                 @PathVariable("id") Long id) {
		if (svc.excluirEndereco(uuid, id)) {
			return ResponseEntity.status(HttpStatus.OK).build();			
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}				
	}
	
	@PostMapping(value = "/{uuid}/enderecos")
	public ResponseEntity<?> salvarNovoEndereco(@PathVariable String uuid, 
	                                            @RequestBody Operador endereco){
	   Operador p = svc.listarPessoaPorUuid(uuid);
	 
	   if (p != null){ 
	      endereco.setOperador( p );
	      eSvc.salvarNome(endereco);     
	   }
	   
	   return ResponseEntity.noContent().build();

	}
}