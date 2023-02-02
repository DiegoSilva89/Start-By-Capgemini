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
public class ExerciciosJava30 {
    
    public static void main(String[] args) {
        
        //======================================================================
        /*Exercício 30 - Escreva um algoritmo que leia três valores inteiros 
        distintos e os escreva em ordem crescente;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        int aux = 0;
        
        System.out.print("Digite um número inteiro: ");
        int n1 = leitor.nextInt();
        
        System.out.print("Digite um segundo número: ");
        int n2 = leitor.nextInt();
        
        System.out.print("Digite um terceiro número: ");
        int n3 = leitor.nextInt();
               
        if(n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        
        if(n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        
        if(n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }         
        
        System.out.println("Em ordem crescente: " + n1 + ", " + n2 + ", " + n3);
        
    }
    
}
