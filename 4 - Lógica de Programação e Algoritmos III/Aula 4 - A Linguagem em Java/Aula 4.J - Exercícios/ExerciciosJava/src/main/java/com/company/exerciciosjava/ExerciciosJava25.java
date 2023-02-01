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
public class ExerciciosJava25 {
    
    public static void main(String[] args) {
         
        //======================================================================
        /*Exercício 25 - Faça um algoritmo que leia dois números e identifique 
        se são iguais ou diferentes. Caso eles sejam iguais imprima uma 
        mensagem dizendo que eles são iguais. Caso sejam diferentes, informe 
        qual número é o maior, e uma mensagem que são diferentes;*/
        //======================================================================
        
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            
            System.out.print("Digite um número: ");
            int numero1 = leitorScanner.nextInt();
            
             System.out.print("Digite um segundo número: ");
            int numero2 = leitorScanner.nextInt();
            
            if(numero1 == numero2) {
                System.out.println("Os números digitados são iguais");
            } else {
                if ((numero1 != numero2) && (numero1 > numero2)) {
                    System.out.println("Os números digitados são diferentes e o"
                            + " primeiro número digitado é maior que o "
                            + "segundo");
                } else {
                    System.out.println("Os números digitados são diferentes e"
                            + " o segundo número digitado é maior que o "
                            + "primeiro");                         
                    }                   
                }
            
            System.out.println("Deseja continuar? ");
            desejaContinuar = leitorScanner.next().charAt(0);
            
            }    
    }
    
}
