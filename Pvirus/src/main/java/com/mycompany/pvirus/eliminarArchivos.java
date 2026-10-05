package com.mycompany.pvirus;
import java.nio.file.*;
import java.util.*;
import java.io.*;
import java.io.IOException;
public class eliminarArchivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese el nombre del archivo: ");
            String nombreArchivo = sc.nextLine();
            
            Path ruta = Paths.get("C:\\Users\\Usuario\\Desktop\\Proyecto", nombreArchivo);
            if(Files.notExists(ruta)){
                System.out.println("EL archivo no existe, ingrese otro.");
            }else{
                try{
                    Files.delete(ruta);
                    System.out.println("El archivo se elimino correctamente.");
                    break;
                }
                catch(IOException ex){
                    System.out.println("Error: "+ex.getMessage());
                    ex.printStackTrace();
                    break;
                }
            }
        }
        
    }
}
