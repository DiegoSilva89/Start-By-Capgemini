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
public class ExerciciosJava06 {
    
     public static void main(String[] args) {
        
        //======================================================================
            /*Leia dois valores para as variáveis A e B, e efetuar as trocas dos
            valores de forma que a variávelApasse a possuir ovalor da variável B
            e a variável B passe a possuir o valor da variável A.Apresentar os
            valores trocados;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int A = leitor.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int B = leitor.nextInt();
        
        System.out.println("Os valores digitados foram: A = " + A + " e B = " + B );
           
        int C = A;
        A = B;
        B = C;
        
        System.out.println("Trocando os valores temos A = " + A + " e B = " + B );
        
    }
    
}
