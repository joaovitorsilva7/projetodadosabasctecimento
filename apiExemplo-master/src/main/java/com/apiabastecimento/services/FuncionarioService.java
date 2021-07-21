package com.apiabastecimento.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiabastecimento.domains.Operador;
import com.apiabastecimento.domains.Funcionario;
import com.apiabastecimento.repositories.IOperadorRepository;
import com.apiabastecimento.repositories.IFuncionarioaRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private IFuncionarioaRepository repPessoa;
	
	@Autowired
	private IOperadorRepository repNome;

	public List<Funcionario> listarPessoas(){
		return repPessoa.findAll();
	}
	
	public Operador listarPessoaPorUuid(String uuid) {
		return repPessoa.findByUuid(uuid);
	}
	
	public Funcionario salvarPessoa(Funcionario p) {	
		p.setUuid( UUIDServices.genUUID() );
		return repPessoa.save(p);
	}
	
	public boolean excluirPessoa(String uuid) {
		Operador p = repPessoa.findByUuid(uuid);

		if ( p != null ) {
			repPessoa.deleteById(p.getId());
			return true;
		}
		return false;
	}
	
	public boolean excluirEndereco(String uuid, Long idEnd) {
		Operador p = repPessoa.findByUuid(uuid);
        final Operador e;
		
		if ( p != null ) {
			e = repNome.getById(idEnd);
			
			if (e != null && e.getPessoa().getId() == p.getId()) {
				repNome.deleteById(e.getId());
				return true;
			}			
		} 
		return false;
		
	}

	public IOperadorRepository getRepNome() {
		return repNome;
	}

	public void setRepNome(IOperadorRepository repNome) {
		this.repNome = repNome;
	}
}
