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
public class Ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        //doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
        
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular su doble, triple y raiz");
        int num = Leer.nextInt();
        System.out.println("El doble del numero ingresado es: " + num*2);
        System.out.println("El triple del numero ingresado es: " + num*3);
        System.out.println("La raiz del numero ingresado es: " +Math.sqrt(num));
    }
    
}
