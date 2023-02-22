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
public class Ejerc12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.

//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.

//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().
        
        Scanner leer = new Scanner(System.in);
        
        
        int correcta, incorrecta;
        correcta = 0;
        incorrecta =0;
        String frase;     
        do {
            System.out.println("Ingrese la frase");
            frase = leer.next();
            
            if (frase.length()==5 && frase.startsWith("X") && frase.endsWith("O")) {
                correcta++;
            }else{
                incorrecta++;
            }
        } while (!frase.equals("&&&&&"));
        
        System.out.println("La cantidad de correctas es " + correcta + " y de incorrectas "+ (incorrecta-1));
        
        
        
    }
    
}
