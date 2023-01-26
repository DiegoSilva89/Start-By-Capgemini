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
public class ExerciciosJava21 {
    
    public static void main(String[] args) {

        //======================================================================
            /*Exercício 21 - Escreva um algoritmo que leia os dados de “N” 
            pessoas (nome, sexo, idade e saúde) e informe se está apta ou não 
            para cumprir o serviço militar obrigatório. Informe os totais;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        int idade, apto, total, totalApto;
        String nome, sexo, saude, opcao;
        
        total = 0;
        totalApto = 0;
               
        do{
            System.out.print("Nome do candidato: ");
            nome = leitor.next();
            
            System.out.print("Idade do candidato: ");
            idade = leitor.nextInt();
            
            System.out.print("Sexo do candidato M/F: ");
            sexo = leitor.next();
            
            System.out.print("Estado de saúde (B)BOM ou (R)RUIM: ");
            saude = leitor.next();
            
            total++;
            
            if (idade <= 18 && "B".equalsIgnoreCase(saude)){
                apto = 1;                
            } else {
                apto = 0;
            }
            
            if (apto == 1) {
                totalApto++;
            }
                       
            System.out.print(" Deseja continuar? (S) Sim ou (N) Não: ");
            opcao = leitor.next();
                        
        }while("S".equalsIgnoreCase(opcao));
        
        System.out.println("Total de pessoas cadastradas: " + total);
        System.out.println("Total de pessoas aptas: " + totalApto);
        
    }
    
}
