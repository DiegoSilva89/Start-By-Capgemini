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
public class ExerciciosJava07 {
    
    public static void main(String[] args) {
        
        //======================================================================
            /*Exercício 07 - Leia uma temperatura em graus Celsius e apresentá-la
            convertida em graus Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5, 
            sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe a temperatura em ºC: ");
        double C = leitor.nextDouble();
        
        double F = (9 * C + 160) / 5;
        
        System.out.println("A temperatura em Fahrenheit é: " + F + "F");
                       
    }
    
}
