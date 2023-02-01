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
public class ExerciciosJava23 {
    
     public static void main(String[] args) {
         
        //======================================================================
        /*Exercício 23 - Faça um algoritmo que receba um número e mostre uma 
        mensagem caso este número sege maior que 80, menor que 25 ou igual a 
        40;*/
        //======================================================================
        
            
        Scanner leitor = new Scanner(System.in);
        
                   
            System.out.print("Digite um número inteiro: ");
            int numero = leitor.nextInt();
            
            if(numero < 25) {
                System.out.println("O número digitado é menor que 25.");
            } else {
                if(numero > 80) {
                    System.out.println("O número digitado é maior que 80.");
                } else {
                    if(numero == 40) {
                        System.out.println("O número digitado é igual 40.");
                    } else {
                        System.out.println("O número digitado está entre 25 "
                                + "e 80");
                    }
                }
            }     
    }
}
