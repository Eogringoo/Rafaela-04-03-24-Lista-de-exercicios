/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex05;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float d,m;
        Scanner input = new Scanner (System.in);
        System.out.println("Informe a quantidade de dolares desejada: \n");
        d = input.nextInt();
        m = (float) ((float) d*4.95);
        System.out.println(" O valor da conversão é: \n" +m);
        
    }
    
}
