package com.mycompany.pvirus;
import java.nio.file.*;
import java.io.IOException;
public class leerArchivos {
    public static void main(String[] args) {
        try{
            Path ruta = Paths.get("C:\\Users\\Usuario\\Desktop\\Proyecto\\lectura.txt");
            String contenido = Files.readString(ruta);
            System.out.println("El contenido es: "+contenido);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
