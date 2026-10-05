package com.mycompany.pvirus;
import java.nio.file.*;
import java.io.IOException;
public class moverArchivos {
    public static void main(String[] args) {
        try{
            Path archivo = Paths.get("C:\\Users\\Usuario\\Desktop\\Proyecto\\destino.txt");
            Path nuevoDestino = Paths.get("C:\\Users\\Usuario\\Desktop\\Proyecto2\\nuevoDestino.txt");
            Files.move(archivo, nuevoDestino);
            System.out.println("Archivo movido a: "+nuevoDestino);
        }
        catch(IOException ex1){
            System.out.println("Error ex1: "+ex1.getMessage());
            ex1.printStackTrace();
        }
    }
}