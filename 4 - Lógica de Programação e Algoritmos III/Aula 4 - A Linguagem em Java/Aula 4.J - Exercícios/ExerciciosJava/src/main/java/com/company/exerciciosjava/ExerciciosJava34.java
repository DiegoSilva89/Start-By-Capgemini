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
public class ExerciciosJava34 {
    
    public static void main(String[] args) {

        //======================================================================
        /*Exercício 34 - Elabore um algoritmo que, dada a idade de um nadador.
        Classifique-o em uma das seguintes categorias.
        
        a. Infantil A = 5 - 7 anos;
        b. Infantil B = 8 - 10 anos;
        c. Juvenil A = 11 - 13 anos;
        d. Juvenil B = 14 - 17 anos;
        e Sênior = 18 - 25 anos.
        
        Apresentar mensagem "idade fora da faixa etária" quando for outro ano 
        não contemplado*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Qual a idade do nadador ");
        int idade = leitor.nextInt();
        
        if(idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else {
            if(idade >= 8 && idade <= 10) {
                System.out.println("Infantil B");
            } else {
                if(idade >= 11 && idade <= 13) {
                    System.out.println("Juvenil A");
                } else {
                    if(idade >= 14 && idade <= 17) {
                        System.out.println("Juvenil B");
                    } else {
                        if(idade >= 18 && idade <= 25){
                            System.out.println("Sênior");
                        } else {
                            System.out.println("Idade fora da faixa etária");
                        }
                    }
                }
            }
        }
    }
}
