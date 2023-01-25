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
public class ExerciciosJava14 {
    
    public static void main(String[] args) {

        //======================================================================
            /*Exercício 14 - Escreva um algoritmo que leia dois valores inteiro 
            distintos e informe qual é o maior;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número A: ");
        int A = leitor.nextInt();
                 
        System.out.print("Digite um número B: ");
        int B = leitor.nextInt();
        
        if (A > B) {
            System.out.println("O número A é maior que o número B");
        } else {
            System.out.println("O número B é maior que o número A");
        }
    }    
}
