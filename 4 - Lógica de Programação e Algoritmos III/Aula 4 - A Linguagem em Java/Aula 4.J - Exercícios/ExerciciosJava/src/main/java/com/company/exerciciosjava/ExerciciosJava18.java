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
public class ExerciciosJava18 {
    
    public static void main(String[] args) {

        //======================================================================
            /*Exercício 18 - Faça um algoritmo que receba a idade de 75 pessoas 
            e mostre mensagem informando “maior de idade” e “menor de idade” 
            para cada pessoa. Considere a idade a partir de 18 anos como maior 
            de idade;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 1; i <= 75; i++) {
            System.out.print(i + " Digite a idade da pessoa: ");
            int idade = leitor.nextInt();
            
            if(idade >= 18){
                System.out.println("Maior de idade");
            }else {
                System.out.println("Menor de idade");
            } 
        }        
    }    
}
