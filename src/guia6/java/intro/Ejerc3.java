/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.java.intro;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
         //en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
         Scanner Leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase");
        String frase = Leer.nextLine();
        System.out.println("La frase ingresada es: " + frase.toUpperCase());
        System.out.println("La frase ingresada es: " + frase.toLowerCase());
    }
    
}
