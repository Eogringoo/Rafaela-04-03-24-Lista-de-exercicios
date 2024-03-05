/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*/ Crie um algoritmo que solicite o nome,
o endereço, e o telefone do usuário e depois mostre os dados digitados.
/*/ 
        String nome, end, tel; 
        
        Scanner input = new Scanner (System.in);
        
        System.out.println(" Informe o nome: ");
        nome = input.nextLine();
        System.out.println(" Informe o endereço: ");
        end = input.nextLine();
        System.out.println(" Informe o telefone: ");
        tel = input.nextLine();
        System.out.println(" Nome: \n" +nome );
        System.out.println(" Endereço: \n" +end );
        System.out.println(" Telefone: \n" +tel );
      
    }

    private static void cls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
