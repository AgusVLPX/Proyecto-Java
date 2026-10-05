package com.mycompany.pvirus;
import java.util.*;
import java.io.IOException;
import java.nio.file.*;
public class escribirArchivos {
    public static void main(String[] args) {
        try{
            //Se crea el scanner para ingresar texto
            Scanner sc=new Scanner(System.in);
            System.out.println("Escribe un texto: ");
            String texto = sc.nextLine();
            //Se ingresa por consola el nombre del archivo con la extension .txt
            System.out.println("Ingrese el nombre del archivo");
            String archivo = sc.nextLine();
            //Se identifica la ruta donde se crea y escribe el archivo 
            Path ruta = Paths.get("C:\\Users\\Usuario\\Desktop\\Proyecto\\", archivo);
            Files.createFile(ruta);
            Files.writeString(ruta, texto);
            System.out.println("Se escribió correctamente");
        }
        catch(IOException ex){
            System.out.println("Error: "+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
