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
public class Ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        //Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura");
        int grado = Leer.nextInt();
        int F = 32 + (9 * grado / 5);
        System.out.println("El equivalente en grados Fahrenheit es: " + F);
    }
    
}
