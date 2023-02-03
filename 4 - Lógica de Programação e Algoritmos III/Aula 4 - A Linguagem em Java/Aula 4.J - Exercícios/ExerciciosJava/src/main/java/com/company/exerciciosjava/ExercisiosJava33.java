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
public class ExerciciosJava33 {
    
    public static void main(String[] args) {

        //======================================================================
        /*Exercício 33 - A escola “APRENDER” faz o pagamento de seus professores
        por hora/aula. Faça um algoritmo que calcule e exiba o salário de um 
        professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
        
        a. Professor Nível 1 R$12,00 por hora/aula;
        b. Professor Nível 2 R$17,00 por hora/aula;
        c. Professor Nível 3 R$25,00 por hora/aula.*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        float salario;
        int horas, nivel;        
        
        do {
            System.out.print("Qual o nível do professor? (1, 2 ou 3) ");
            nivel = leitor.nextInt();
        } while(nivel > 3 || nivel < 1);
                              
        System.out.print("Quantas horas o professor trabalhou? ");
        horas = leitor.nextInt();
                
        if(nivel == 1) {
            salario = (float)horas * 12;
            System.out.printf("O salário do professor é de R$%.2f", 
                    salario);
        } else {
            if(nivel == 2) {
                salario = (float)horas * 17;
                System.out.printf("O salário do professor é de R$%.2f", 
                    salario);
            } else {
                salario = (float)horas * 25;
                System.out.printf("O salário do professor é de R$%.2f", 
                        salario);
                 
            }
        }             
    }    
}
