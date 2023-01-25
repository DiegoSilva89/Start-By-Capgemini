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
public class ExerciciosJava13 {

    public static void main(String[] args) {

        //======================================================================
            /*Exercício 13 - Faça um algoritmo que receba um número e mostre uma
            mensagem caso este número seja maior que 10;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);

        int N = 0;

        do {
            System.out.print("Digite um número? ");
            N = leitor.nextInt();
        } while (N <= 10);

        if (N > 10) {
            System.out.printf("O número digitado é maior que 10!");
        }
    }
}
