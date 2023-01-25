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
public class ExerciciosJava12 {
    
    public static void main(String[] args) {
        
        //======================================================================
            /*Exercício 12 - O custo de um carro novo ao consumidor é a soma do 
            custo de fábrica mais o percentual do distribuidor e dos impostos 
            aplicados (primeiro os impostos são aplicados sobre o custo de 
            fábrica, e depois o percentual do distribuidor sobre o resultado). 
            Supondo que o percentual do distribuidor seja de 28% e os impostos 
            45%, escreva um algoritmo que leia o custo de fábrica de um carro e 
            informe o custo ao consumidor do mesmo;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Qual custo de fábrica do carro novo? ");
        double valorCusto = leitor.nextDouble();
               
        double valorVenda = valorCusto * (1 + 0.45) * (1 + 0.28);
        
        System.out.printf("O valor de venda do produto será de: R$%.2f", valorVenda);
                               
    }
    
}
