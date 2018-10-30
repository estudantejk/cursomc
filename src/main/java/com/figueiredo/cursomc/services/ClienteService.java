package com.figueiredo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.figueiredo.cursomc.domain.Cliente;
import com.figueiredo.cursomc.repositories.ClienteRepository;
import com.figueiredo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		
		Optional<com.figueiredo.cursomc.domain.Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id" + id + ", Tipo " + Cliente.class.getName())
				);
	}

}
