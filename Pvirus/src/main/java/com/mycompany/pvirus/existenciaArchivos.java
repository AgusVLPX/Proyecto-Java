package com.mycompany.pvirus;
import java.nio.file.*;
public class existenciaArchivos {
    public static void main(String[] args) {
        Path ruta = Paths.get("C:\\Users\\Usuario\\Desktop\\Proyecto\\hola.txt");
        if(Files.exists(ruta)){
            System.out.println("El archivo existe.");
        }else{
            System.out.println("El archivo no existe.");
        }
    }
}
