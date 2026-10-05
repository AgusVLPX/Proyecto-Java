package com.mycompany.pvirus;
import java.nio.file.*;
import java.io.IOException;
public class otraFormaBorrarArchivo {
    public static void main(String[] args) {
        Path ruta = Paths.get("C:\\Users\\Usuario\\Desktop\\Proyecto2\\archivo.txt");
        try{
            if(Files.deleteIfExists(ruta)){
                System.out.println("Archivo borrado con exito.");
            }else{
                System.out.println("El archivo no existe.");
            }
        }
        catch(IOException ex){
            System.out.println("Error: "+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
