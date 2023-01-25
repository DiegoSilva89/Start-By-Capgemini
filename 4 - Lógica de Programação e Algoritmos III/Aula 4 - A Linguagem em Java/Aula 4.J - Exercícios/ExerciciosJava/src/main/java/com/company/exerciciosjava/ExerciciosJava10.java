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
public class ExerciciosJava10 {
    
    public static void main(String[] args) {
        
        //======================================================================
            /*A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)
            prestações sem juros. Faça um algoritmo que receba um valor de uma 
            compra e mostre o valor das prestações;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Qual o valor a vista do produto? ");
        double valorTotal = leitor.nextDouble();
        
        double parcelas = valorTotal / 5;
        
        System.out.printf("O valor das parcelas será de: %.2f", parcelas);
                               
    }
    
}
