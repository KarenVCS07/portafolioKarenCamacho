
package Tienda.Tienda.service;


import Tienda.Tienda.domain.categoria;
import java.util.List;

public interface CategoriaService {
    
    
    // Se obtiene un listado de categorias en un List
    public List<categoria> getCategorias(boolean activos);
 
    
}
