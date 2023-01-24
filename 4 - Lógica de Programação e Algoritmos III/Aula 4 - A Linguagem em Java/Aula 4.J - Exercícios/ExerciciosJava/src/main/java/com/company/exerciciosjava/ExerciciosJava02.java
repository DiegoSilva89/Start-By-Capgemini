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
public class ExerciciosJava02 {
    
    public static void main(String[] args) {
        
        //======================================================================
            /*Exercício 02 - Faça um algoritmo que receba dois números e ao 
            final mostre a soma, subtração, multiplicação e a divisão dos dois 
            números lidos;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        
        int soma = A + B;
        int subtracao = A - B;
        int multiplicacao = A * B;
        double divisao = (double)A / B;
        
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);        
        
    }
    
}
