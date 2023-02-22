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
public class Ejerc16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamanio del vector");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random()*10);   
        }
        System.out.println("Ingrese un numero entre 0 y 9 para buscar en el vector");
        int buscar=leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (buscar==vector[i]) {
                System.out.println(buscar + "esta en la posicion" + i);
            }
        }
        
    }
    
}
