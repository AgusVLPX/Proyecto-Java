package com.mycompany.pvirus;

import java.io.IOException;
import java.nio.file.*;

public class crearDirectorio {
    public static void main(String[] args) {
        
        try{
            //Creamos la ruta "logica" de nuestro directorio
            Path ruta = Paths.get("D:\\Proyectos\\prueba.txt");
            Path carpetaPadre = ruta.getParent();
            if(carpetaPadre != null && !Files.exists(carpetaPadre)){
                Files.createDirectories(carpetaPadre);
                System.out.println("Carpeta creada: "+carpetaPadre);
            }else{
                System.out.println("La carpeta ya existe.");
            }
            //Creamos el archivo.txt en el directorio creado anteriormente
            if(!Files.exists(ruta)){
                Files.createFile(ruta);
                System.out.println("Archivo creado en: "+ruta);
            } else{
                System.out.println("El archivo ya existia.");
            }
            //Probamos funciones
            System.out.println("Nombre del archivo: " + ruta.getFileName());
            System.out.println("Carpeta padre: " + ruta.getParent());
            System.out.println("¿Es una ruta absoluta?: " + ruta.isAbsolute());
        }
        catch(IOException ex){
            System.out.println("Error"+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
