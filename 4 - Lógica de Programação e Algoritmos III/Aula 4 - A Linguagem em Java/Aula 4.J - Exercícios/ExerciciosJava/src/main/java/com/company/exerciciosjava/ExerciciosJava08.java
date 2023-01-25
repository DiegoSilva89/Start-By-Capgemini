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
public class ExerciciosJava08 {
    
    public static void main(String[] args) {
        
        //======================================================================
            /*Exercício 08 - Elabore um algoritmo que efetue a apresentação do valor da 
            conversão em real (R$) de um valor lido em dólar (US$). O algoritmo 
            deverá solicitar o valor da cotação do dólar e também a quantidade de 
            dólares disponíveis com ousuário;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual a cotação do dólar? ");
        double cotDolar = leitor.nextDouble();
        
        System.out.println("Quantos dólares você tem? ");
        double qtdDolar = leitor.nextDouble();
        
        double reais = cotDolar * qtdDolar;
        
        System.out.printf("A quantidade de dólares em reais é: R$%.2f", reais);
                       
    }
    
}
