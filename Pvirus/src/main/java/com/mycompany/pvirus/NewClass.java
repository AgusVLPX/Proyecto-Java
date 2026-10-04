package com.mycompany.pvirus;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Ingrese una cadena");
            String texto=sc.nextLine();
            Path ruta = Path.of("D:\\Proyectos\\prueba.txt");
            Files.writeString(ruta, texto);
            String contenido=Files.readString(ruta);
            System.out.println("La lectura es igual a: "+contenido);
        }catch(IOException e){
            System.out.println("Error"+e.getMessage());
            System.out.println("Error"+e.toString());
            e.printStackTrace();
        }
        
    }
}
