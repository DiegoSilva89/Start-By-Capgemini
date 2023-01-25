/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author Diego Silva
 */
public class ExerciciosJava11 {
    
    public static void main(String[] args) {
        
        //======================================================================
            /*Exercício 11 - Faça um algoritmo que receba o preço de custo de um
            produto e mostre o valor de venda. Sabe-se que o preço de custo 
            receberá um acréscimo de acordo com um percentual informado pelo 
            usuário;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Qual preço de custo do produto? ");
        double valorCusto = leitor.nextDouble();
        
        System.out.print("Qual o percentual de lucro? ");
        double percentual = leitor.nextDouble();
        
        double valorVenda = valorCusto * (1 + percentual / 100);
        
        System.out.printf("O valor de venda do produto será de: R$%.2f", valorVenda);
                               
    }
    
}
