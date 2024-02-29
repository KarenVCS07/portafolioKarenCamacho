
package com.semana4.service.impl;

import com.semana4.dao.CategoriaDao;
import com.semana4.domain.Categoria;
import com.semana4.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired   //crea un objeto mientras se ejecuta la app
    private CategoriaDao categoriaDao;
    
    public List<Categoria> getCategorias(boolean activos){
        var lista=categoriaDao.findAll();
        
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }//fin del if
        return lista;
    }
    
}//fin de la clase
