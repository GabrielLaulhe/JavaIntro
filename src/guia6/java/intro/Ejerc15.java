/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.java.intro;

/**
 *
 * @author Asus
 */
public class Ejerc15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[100];
        
        for (int i = 0; i < 100; i++) {
            vector[i]=i+1;
        }
        
        for (int j = 99; j >=0 ; j--) {
            System.out.print(vector[j] + " ");
        }
    }
    
}
