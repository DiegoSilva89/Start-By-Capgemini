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
public class ExerciciosJava16 {
    
    public static void main(String[] args) {

        //======================================================================
            /*Exercício 16 - Escreva um algoritmo que leia o nome e as três 
            notas obtidas por um aluno durante o semestre. Calcular a sua média 
            (aritmética), informar o nome e sua menção aprovado (media >= 7), 
            Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do(a) aluno(a): ");
        String nome = leitor.next();
         
        System.out.print("Digite a primeira nota do(a) aluno(a): ");
        double nota1 = leitor.nextDouble();
        
        System.out.print("Digite a segunda nota do(a) aluno(a): ");
        double nota2 = leitor.nextDouble();
        
        System.out.print("Digite a terceira nota do(a) aluno(a): ");
        double nota3 = leitor.nextDouble();
        
        double media = ((double)nota1 + nota2 + nota3) / 3;
                 
        if (media >= 7) {
            System.out.printf("O(a) aluno(a) " + nome + " obteve média %.2f e está APROVADO(A)!", media);
        } else 
            if (media <= 5)  {
                System.out.printf("O(a) aluno(a) " + nome + " obteve média %.2f e está REPROVADO(A)!", media);
            } else {
                System.out.printf("O(a) aluno(a) " + nome + " obteve média %.2f e está de RECUPERAÇÃO!", media);
        } 
    }
    
}
