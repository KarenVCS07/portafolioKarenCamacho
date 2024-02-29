
package com.semana4.dao;

import com.semana4.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaDao extends JpaRepository<Categoria,Long>{
    
}
