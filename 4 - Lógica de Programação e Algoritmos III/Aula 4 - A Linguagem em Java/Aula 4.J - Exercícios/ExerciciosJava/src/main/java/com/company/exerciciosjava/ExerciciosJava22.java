/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ExerciciosJava22 {
    
    public static void main(String[] args) {
        
        //======================================================================
        /*Exercício 22 - Faça um algoritmo que receba o preço de custo e o 
        preço de venda de 40 produtos. Mostre como resultado se houve lucro, 
        prejuízo ou empate para cada produto. Informe o valor de custo de cada 
        produto, o valor de venda de cada produto, amédia de preço de custo e 
        do preço de venda;*/
        //======================================================================
        
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
