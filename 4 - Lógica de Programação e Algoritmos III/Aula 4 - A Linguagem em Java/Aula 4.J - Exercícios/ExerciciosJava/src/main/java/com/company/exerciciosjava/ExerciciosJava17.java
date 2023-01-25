/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ExerciciosJava17 {
    
    public static void main(String[] args) {

        //======================================================================
            /*Exercício 17 - Leia 80 números e ao final informar quantos 
            número(s) está(ão) no intervalo entre 10(inclusive) e 150(inclusive);*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        int intervalo = 0;
        
        for(int i = 1; i <= 80; i++) {
            System.out.print(i + " Digite um número inteiro: ");
            int n = leitor.nextInt();
            
            if(n >= 10 && n <= 150){
                intervalo += 1;
            }           
        }
        
        System.out.println("A quantidade de números digitados que estão no intervalo de 10 e 150 é: " + intervalo);
    }
}
