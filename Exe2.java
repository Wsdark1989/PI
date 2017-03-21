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
public class Exe2 {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Declaração de Variáveis
    Scanner leitor = new Scanner (System.in);
    double b1, e2, resultado;
    // Atribuição ou Inicialização
        System.out.println("!!! Calculo da Potencia !!!");
        System.out.println("");
        System.out.print("Valor Base: ");
        b1 = leitor.nextDouble();
        System.out.print("Valor do Expoente: ");
        e2 = leitor.nextDouble();
        resultado = Math.pow(b1, e2);
        System.out.println("Soma dos Valores: " + resultado);
        System.out.println("FIM");
                
    }
    
        }
