/**
 * 
 */
package com.treinamento.applicacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treinamento.applicacao.domain.Categoria;

/**
 * @author diego.kazadi
 *
 */
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
