/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        Scanner input = new Scanner (System.in);
        System.out.println(" Digite o primeiro nome ");
         nome = input.nextLine();
         System.out.println("Saudações caro(a)\n" + nome);
    }
    
}
