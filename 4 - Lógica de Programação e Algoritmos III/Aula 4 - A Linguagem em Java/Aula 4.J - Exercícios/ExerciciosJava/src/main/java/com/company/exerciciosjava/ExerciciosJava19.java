package com.company.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author Diego Silva
 */
public class ExerciciosJava19 {
    
    public static void main(String[] args) {

        //======================================================================
            /*Exercício 19 - Escreva um algoritmo que leia o nome e o sexo de 56
            pessoas e informe o nome e se ela é homem ou mulher. No final 
            informe total de homens e de mulheres;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        int mulher = 0;
        int homem = 0;
        
        for(int i = 1; i <= 3; i++) {
            System.out.print(i + " Digite o nome da pessoa: ");
            String nome = leitor.next();
           
            System.out.print(i + " Digite o sexo da pessoa (M ou F): ");
            String sexo = leitor.next();
                        
            if("M".equalsIgnoreCase(sexo)){
                System.out.println(i + " Seu nome é " + nome + "e você é "
                        + "homem!");
                homem ++;
            }else {
                System.out.println(i + " Seu nome é " + nome + "e você é "
                        + "mulher!");              
                mulher ++;
            }                      
        }
        
        System.out.println("A quantidade de homens é: " + homem + " e a "
                + "quantidade de mulheres é: " + mulher);        
    }      
}
