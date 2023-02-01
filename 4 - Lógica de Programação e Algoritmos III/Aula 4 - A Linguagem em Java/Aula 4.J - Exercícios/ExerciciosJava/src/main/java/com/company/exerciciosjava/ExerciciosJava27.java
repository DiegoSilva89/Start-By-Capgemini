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
public class ExerciciosJava27 {
    
    public static void main(String[] args) {

        //======================================================================
        /*Exercício 27 - A concessionária de veículos “CARANGO” está 
        vendendo os seus veículos com desconto. Faça um algoritmo que calcule e
        exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto 
        deverá ser calculado sobre o valor do veículo de acordo com o 
        combustível (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do 
        veículo zero encerra entrada de dados. Informe total de desconto e 
        total pago pelos clientes;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        int combustivel;
        double valor, valorFinal, desconto, totalDesconto, totalPagar;
                
        totalDesconto = 0;
        totalPagar = 0;
        valorFinal = 0;
        valor = 1;
                       
        while(valor >= 1) {

            System.out.print("Digite o valor do carro: ");
            valor = leitor.nextDouble();

            if(valor > 0){
                System.out.println("Qual o combustível do carro? ");
                System.out.println("1 - Álcool; ");
                System.out.println("2 - Gasolina;");
                System.out.println("3 - Diesel.");
                combustivel = leitor.nextInt();

                if(combustivel == 1){
                    desconto = 0.25;
                } else {
                    if(combustivel == 2) {
                        desconto = 0.21;
                    } else {
                        desconto = 0.14;
                }
            } 

            desconto = desconto * valor;
            valorFinal = valor - desconto;
            totalDesconto += desconto;
            totalPagar += valorFinal;
                
            } else {
                System.out.println("Muito obrigado!");
            }            
        }          
            
        System.out.printf("O valor do desconto é de: R$%.2f, e o valor "
                + "final a ser pago é R$%.2f",totalDesconto, 
                totalPagar);
                     
    }
    
}
