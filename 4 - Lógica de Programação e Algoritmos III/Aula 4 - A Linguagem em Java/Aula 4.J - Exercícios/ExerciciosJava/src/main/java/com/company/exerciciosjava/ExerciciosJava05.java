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
public class ExerciciosJava05 {
    
    public static void main(String[] args) {
        
        //======================================================================
            /*Escreva um algoritmo que leia o nome de um aluno e as notas das 
            três provas que ele obteve no semestre. No finalinformar o nome do 
            aluno e a sua média (aritmética);*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String aluno = leitor.next();
        
        System.out.print("Digite a primeira nota do aluno: ");
        double n1 = leitor.nextDouble();
        
        System.out.print("Digite a segunda nota do aluno: ");
        double n2 = leitor.nextDouble();
        
        System.out.print("Digite a terceira nota do aluno: ");
        double n3 = leitor.nextDouble();
        
        double media = (n1 + n2 + n3) / 3;
                
        System.out.printf("A média do aluno " + aluno + " é: %.2f", media);
        
    }
    
}
