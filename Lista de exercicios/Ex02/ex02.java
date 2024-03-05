/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1,n2,divisao;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println(" Digite o primeiro numero: \n");
        
        n1 = input.nextInt();
        
        System.out.println(" Digite o segundo numero: \n");
        
        n2 = input.nextInt();
        
        divisao = n1%n2;
        
        System.out.println("A divisão dos valores informados é: \n"+divisao);
        
        
    }
    
}
