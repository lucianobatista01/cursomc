package br.com.lucianobatista.cursomc.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucianobatista.cursomc.domain.Categoria;
import br.com.lucianobatista.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
				Optional<Categoria> obj = repo.findById(id);
				return obj.orElse(null);
	}

}
