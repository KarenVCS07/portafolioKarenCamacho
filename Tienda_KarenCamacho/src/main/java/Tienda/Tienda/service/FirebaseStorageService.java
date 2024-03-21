
package Tienda.Tienda.service;

import org.springframework.web.multipart.MultipartFile;


public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //el BuketName es el <id_del_proyecto< + ".appspot.com#
    final String BucketName = "techshop-28e3b2.appspot.com";
    
    //esta es la ruta basica de este proeycto techsop
    final String rutaSuperiorStorage = "techshop";
    
    //ubicacion donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //nombre del archivo Json
    final String archivoJsonFile = "techshop-28e3b-firebase-adminsdk-2ya4y-1881de7d16.json";
    
}
