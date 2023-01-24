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
public class ExerciciosJava04 {
    
    public static void main(String[] args) {
        
        //======================================================================
            /*Exercício 04 - Escreva um algoritmo que leia o nome de um 
            vendedor, o seu salário fixo e o total de vendas efetuadas por ele 
            no mês (em dinheiro). Sabendo que este vendedor ganha 15% de 
            comissão sobre suas vendas efetuadas, informar o seu nome, o salário
            fixo e salário no final do mês;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o nome do vendedor: ");
        String vendedor = leitor.next();
        
        System.out.print("Digite o salário fixo do vendedor " + vendedor + ": ");
        double salarioFixo = leitor.nextDouble();
        
        System.out.print("Digite o valor total de vendas do " + vendedor + " em R$: ");
        double totalVendas = leitor.nextDouble();
        
        double salarioFinal = salarioFixo + totalVendas * 15 / 100;
                
        System.out.printf("O salário fixo mais 15 porcento do total de vendas do " + vendedor + " é: R$%.2f", salarioFinal);
        
    }
    
}
