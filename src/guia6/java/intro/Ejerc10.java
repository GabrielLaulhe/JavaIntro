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
public class Ejerc10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        //números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero maximo");
        int num = leer.nextInt();
        
        
        int suma;
        suma = 0;
                
        do {
            System.out.println("Ingrese otro numero");
            int num1 = leer.nextInt();
            
            suma = suma + num1 ;
        } while (suma<= num);
        
            System.out.println("La suma de los numeros ingresados supera el valor maximo");
         
                    
            
        }
    }
    

