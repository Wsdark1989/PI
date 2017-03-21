/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaponderada;

import java.util.Scanner;

/**
 *
 * @author wellington.silva10
 */
public class MediaPonderada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner leitor = new Scanner (System.in);
        float n1, n2, media;
        float P1, P2;
        // Atribuição ou Inicialização
        P1 = 0.4f;
        P2 = 0.6f;
        System.out.println("!!!Calculo da Média!!!");
        System.out.print("Nota 1 ");
        n1 = leitor.nextFloat();
        System.out.print("Nota 2 ");
        n2 = leitor.nextFloat();
        media = (n1*P1)+(n2*P2);
        //System.out.println("Média: " + media);
        System.out.printf(" Nota 1: %.2f \n Nota 2: %.2f \n Média:  %.2f \n", n1, n2, media);
        System.out.println("FIM");
        
    }
    
}
