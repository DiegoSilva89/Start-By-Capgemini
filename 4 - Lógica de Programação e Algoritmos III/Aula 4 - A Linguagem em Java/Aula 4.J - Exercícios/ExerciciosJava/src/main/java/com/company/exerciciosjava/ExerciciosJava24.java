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
public class ExerciciosJava24 {
    
     public static void main(String[] args) {
         
        //======================================================================
        /*Exercício 24 - Faça um algoritmo que receba “N” números e mostre 
        positivo, negativo ou zero para cada número;*/
        //======================================================================
        
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            
            System.out.println("Digite um número: ");
            int numero = leitorScanner.nextInt();
            
            if(numero == 0) {
                System.out.println("O número é zero");
            } else {
                if (numero > 0) {
                    System.out.println("O número é maior que zero");
                } else {
                    System.out.println("O número é menor que zero");
                }
            }
            
            System.out.println("Deseja continuar? ");
            desejaContinuar = leitorScanner.next().charAt(0);
        }
        
    }
    
}
