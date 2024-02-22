
package Tienda.Tienda.servicelmpl;

import Tienda.Tienda.dao.CategoriaDao;
import Tienda.Tienda.domain.categoria;
import Tienda.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


    @Service
public class CategoriaServicelmpl implements CategoriaService  {
    
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly=true)
    public List<categoria> getCategorias(boolean activos) {
        var lista=categoriaDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
}//fin de la clase
