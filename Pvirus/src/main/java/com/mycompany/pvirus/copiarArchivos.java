package com.mycompany.pvirus;
import java.nio.file.*;
import java.io.IOException;
public class copiarArchivos {
    public static void main(String[] args) {
        try{
            Path origen = Paths.get("C:\\Users\\Usuario\\Desktop\\Proyecto\\archivo.txt");
            Path destino = Paths.get("C:\\Users\\Usuario\\Desktop\\Proyecto\\destino.txt");
            Files.copy(origen, destino);
            System.out.println("Archivo copiado a: "+destino);
        }
        catch(IOException ex){
            System.out.println("Error: "+ex.getMessage());
            ex.printStackTrace();
        }
        
    }
}
