/**
 * 
 */
package com.treinamento.applicacao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamento.applicacao.domain.Categoria;
import com.treinamento.applicacao.repositories.CategoriaRepository;

/**
 * @author diego.kazadi
 *
 */
@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Categoria obj = repo.findOne(id);
		return obj;
	}

}
