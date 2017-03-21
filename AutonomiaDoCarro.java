/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopione;

import java.util.Scanner;

/**
 *
 * @author Ws
 */
public class AutonomiaDoCarro {
     // 
    
    public static void main (String[] args){
        // Declaraçao de Variáveis
        Scanner leitor = new Scanner (System.in);
        double km, litros, resultado;
        
        // Atribuição ou Inicialização
        System.out.println("!!!Quanto meu carro gasta?!!!");
        System.out.println("KM");
        km = leitor.nextDouble();
        System.out.println("Litros");
        litros = leitor.nextDouble();
        resultado = (km/litros);
        System.out.println("Consumo de Combustivel: " + resultado);
        System.out.println("FIM");
    }
}
