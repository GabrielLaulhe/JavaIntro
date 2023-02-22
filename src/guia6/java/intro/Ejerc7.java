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
public class Ejerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
        //        pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
        //         la función equals() en Java.
        
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = Leer.nextLine();
        if( frase.equals("eureka")){
            System.out.println("VERDADERO");
        }else {
            System.out.println("FALSO");
    }
    
}
}