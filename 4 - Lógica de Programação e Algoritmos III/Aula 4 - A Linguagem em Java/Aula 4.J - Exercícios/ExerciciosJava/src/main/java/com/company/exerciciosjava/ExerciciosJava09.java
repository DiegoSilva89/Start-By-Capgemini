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
public class ExerciciosJava09 {
    
    public static void main(String[] args) {
        
        //======================================================================
            /*Exercício 09 - Faça um algoritmo que receba um valor que foi depositado e exiba o
            valor com rendimento após um mês.Considere fixo o juro da poupança 
            em 0,07% a. m;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o valor depositado na Poupança? ");
        double deposito = leitor.nextDouble();
        
        double valorMes = deposito * 1.007;
        
        System.out.printf("Após 1 mês na poupança, o valor será: %.2f", valorMes);
                               
    }
    
}
