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
public class Ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//        dos.El programa deberá después mostrar el resultado de la suma
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar dos numeros para su suma");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        
        System.out.println("La suma de los numeros ingresados es " + suma);
    }
    
}
