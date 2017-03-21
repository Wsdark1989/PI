/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author wellington.silva10
 */
public class Exe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner leitor = new Scanner (System.in);
        int n1, n2, soma;
        // Atribuição ou Inicialização
        System.out.println("!!!Calculo!!!");
        System.out.print("Primeiro Valor: ");
        n1 = leitor.nextInt();
        System.out.print("Segundo Valor: ");
        n2 = leitor.nextInt();
        soma = (n1+n2);
        System.out.println("Soma dos Valores: " + soma);
        System.out.println("FIM");      
    }
    
}
