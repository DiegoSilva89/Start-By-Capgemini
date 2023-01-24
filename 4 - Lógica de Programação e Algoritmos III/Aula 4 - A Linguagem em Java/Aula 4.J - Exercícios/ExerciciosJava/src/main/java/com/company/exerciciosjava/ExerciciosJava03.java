/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.exerciciosjava;

import java.util.Scanner;

/** *
 * @author Diego Silva
 */
public class ExerciciosJava03 {
    
      public static void main(String[] args) {
        
        //======================================================================
            /*Exercício 03 - Escreva um algoritmo para determinar o consumo 
            médio de um automóvel sendo fornecida a distância total percorrida 
            pelo automóvel e o total de combustível gasto;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a distância total percorrida: ");
        double distanciaPercorrida = leitor.nextDouble();
        
        System.out.println("Digite o total de combustivel gasto: ");
        double combustivelGasto = leitor.nextDouble();
        
        double media = distanciaPercorrida / combustivelGasto;
                
        System.out.printf("O consumo médio do automóvel foi de: %.2fkm/l%n", media);
        
    }
}
