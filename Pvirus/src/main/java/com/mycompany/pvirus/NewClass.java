package com.mycompany.pvirus;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args){
        try{
            //Creamos el scanner
            Scanner sc=new Scanner(System.in);
            System.out.println("Ingrese una cadena");
            String texto=sc.nextLine();
            //Indicamos la ruta del archivo.txt
            Path ruta = Path.of("D:\\Proyectos\\prueba.txt");
            //Se realiza la escritura del archivo
            Files.writeString(ruta, texto);
            String contenido=Files.readString(ruta);
            System.out.println("La lectura es igual a: "+contenido);
            
        }catch(IOException e){
            System.out.println("Error"+e.getMessage());
            e.printStackTrace();
        }
        
    }
}
