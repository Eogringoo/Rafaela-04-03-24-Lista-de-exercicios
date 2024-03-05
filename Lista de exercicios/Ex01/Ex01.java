/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Crie um programa que solicita ao usuário dois números e, em seguida, mostra a soma desses números
        */
        //Declaração de variaveis
        int n1, n2, soma; 
        
        Scanner input = new Scanner(System.in);
        
        //Mostrar a mensagem para o usuario informar os numeros
        System.out.println(" Digite o primeiro numero \n ");
        //ler o valor para o primeiro numero
        n1 = input.nextInt();
               System.out.println(" Digite o segundo numero \n");
               n2 = input.nextInt();
               // Realizar a soma
               soma = n1+n2;
               //Mostrar o resultado
               System.out.println(" A soma de " +n1+ " e " +n2+ " é igual a: \n "+ soma);
               
               
               
      
    }
    
}
