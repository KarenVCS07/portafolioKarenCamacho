
package com.semana4.service;

import com.semana4.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    public List<Categoria>getCategorias(boolean activos);
}
