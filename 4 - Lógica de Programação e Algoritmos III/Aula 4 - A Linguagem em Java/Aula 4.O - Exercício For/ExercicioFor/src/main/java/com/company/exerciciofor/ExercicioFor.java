package com.company.exerciciofor;

/**
 * @author Diego Silva
 */

import java.util.Scanner;

public class ExercicioFor {

    public static void main(String[] args) {
        
        String nomeProduto;
        float precoCusto, precoVenda, totalCusto, totalVenda;
        
        Scanner leitor = new Scanner(System.in);
        
        totalCusto = 0.0f;
        totalVenda = 0.0f;
        
        int i = 0;
        for (; i < 3; i++) {
            
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.next();
            
            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if (precoCusto == precoVenda) {
                System.out.println("Hoube um empate entre o preço de custo "
                        + "e de venda");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Prejuízo");
                } else {
                    System.out.println("Lucro");
                }
            }
            
            System.out.println(nomeProduto + ", preço de custo = " 
                    + precoCusto + ", preço de venda = " + precoVenda);
            
        }
        
        System.out.println("A média do preço de custo é de: " + 
                (totalCusto / i));
        System.out.println("A média do preço de venda é de: " + 
                (totalVenda / i));
        
    }
}
