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
public class ExerciciosJava15 {
    
    public static void main(String[] args) {

        //======================================================================
            /*Exercício 15 - Faça um algoritmo que receba um número e diga se 
            este número está no intervalo entre 100 e 200;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número : ");
        int n = leitor.nextInt();
                 
        if (n >= 100 && n <= 200) {
            System.out.println("O número " + n + " está no intervalo entre 100 e 200");
        } else {
            System.out.println("O número " + n + " NÃO está no intervalo entre 100 e 200");
        }    
    }
}
