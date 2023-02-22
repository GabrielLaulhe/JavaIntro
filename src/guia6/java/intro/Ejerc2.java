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
public class Ejerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
        //pantalla.
        
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = Leer.nextLine();
        System.out.println("El nombre ingresado es " + nombre);
    }
    
}
