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
public class ExerciciosJava32 {
    
    public static void main(String[] args) {

        //======================================================================
        /*Exercício 32 - Escreva um algoritmo que leia três valores inteiros e 
        verifique se eles podem ser os lados de um triângulo. Se forem, informar
        qual o tipo de triângulo que eles formam: equilátero, isóscele ou 
        escaleno. Propriedade: o comprimento de cada lado de um triângulo é 
        menor do que a soma dos comprimentos dos outros dois lados.
        
        a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados
        iguais;
        b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados 
        iguais.
        c. Triângulo equilátero é também isóscele;
        d. Triângulo Escaleno: aquele que tem os comprimentos de seus três 
        lados diferentes;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o primeiro lado: ");
        int A = leitor.nextInt();
        
        System.out.print("Digite o segundo lado: ");
        int B = leitor.nextInt();
        
        System.out.print("Digite o terceiro lado: ");
        int C = leitor.nextInt();
        
        if(A > B + C || B > A + C || C > A + B || A == 0 || B == 0 || C == 0) {
            System.out.print("Não é triângulo!");
        } else {
            if(A == B && B == C) {
                System.out.print("Triângulo equilátero!");
            } else {
                if(A == B || B == C || A == C) {
                    System.out.print("Triângulo isóceles!");
                } else{
                    System.out.print("Triângulo escaleno!");
                }                  
            }
        }
             
     }
    
}
