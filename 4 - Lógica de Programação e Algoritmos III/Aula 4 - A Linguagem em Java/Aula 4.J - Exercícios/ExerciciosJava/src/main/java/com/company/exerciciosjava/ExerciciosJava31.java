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
public class ExerciciosJava31 {
    
    public static void main(String[] args) {

        //======================================================================
        /*Exercício 31 - Dados três valores A, B e C, em que A e B são números 
        reais e C é um caractere, pede-se para imprimir o resultado da operação 
        de A por B se C for um símbolo de operador aritmético; caso contrário 
        deve ser impressa uma mensagem de operador não definido. Tratar erro de
        divisão por zero;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        int resultado;
        
        System.out.print("Digite o primeiro número: ");
        int A = leitor.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int B = leitor.nextInt();
        
        System.out.print("Digite o operador: ");
        String C = leitor.next();
        
        switch(C) {
            case "+":
                resultado = A + B;
                System.out.println(resultado);
                break;
            case "-":
                resultado = A - B;
                System.out.println(resultado);
                break;
            case "*":
                resultado = A * B;
                System.out.println(resultado);
                break;
            case "/":                
                if(B > 0){
                    resultado = A / B;
                    System.out.println((float)resultado);                    
                } else {
                     System.out.println("Não é possível dividir por zero");
                }               
                break;
            default:
                System.out.println("Você não digitou um operador válido");
         
        }   
             
     }
    
}
