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
public class ExerciciosJava26 {
    
    public static void main(String[] args) {
         
        //======================================================================
        /*Exercício 26 - Faça um algoritmo que leia um número de 1 a 5 e 
        screva por extenso. Caso o usuário digite um número que não esteja 
        neste intervalo, exibir a seguinte mensagem: número inválido;*/
        //======================================================================
        
        Scanner leitorScanner = new Scanner(System.in);
        
        
        
        System.out.print("Digite um número entre 1 e 5: ");
        int numero = leitorScanner.nextInt();
                        
        if(numero == 1) {
            System.out.println("Um");
        } else {
            if (numero == 2) {
                System.out.println("Dois");
            } else {
                if (numero == 3) {
                    System.out.println("Três");
                } else {
                    if(numero == 4) {
                        System.out.println("Quatro");
                    } else {
                        if(numero == 5) {
                            System.out.println("Cinco");
                        } else {
                            System.out.println("Número inválido!");                            
                        }
                    }
                }
            }
        }
    }
}
                                      
                        
  