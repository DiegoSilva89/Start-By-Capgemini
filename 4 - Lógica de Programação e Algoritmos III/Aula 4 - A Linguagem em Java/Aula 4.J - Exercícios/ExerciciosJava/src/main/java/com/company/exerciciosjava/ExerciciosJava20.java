package com.company.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author Diego Silva
 */
public class ExerciciosJava20 {
    
    public static void main(String[] args) {

        //======================================================================
            /*Exercício 20 - A concessionária de veículos “CARANGO VELHO” está 
            vendendo os seus veículos com desconto. Faça um algoritmo que 
            calcule e exiba o valor do desconto e o valor a ser pago pelo 
            cliente de vários carros. O desconto deverá ser calculado de acordo 
            com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
            sistema deverá perguntar se deseja continuar calculando desconto 
            até que a resposta seja: “(N) Não”. Informar total de carros com 
            ano até 2000 e total geral;*/
        //======================================================================
        
        Scanner leitor = new Scanner(System.in);
        
        int ano, totalCarros, totalAtel2000, totalAcima2000;
        double valor, valorFinal, desconto, totalPagar;
        String continuar;
        
        continuar = "S";
        totalAtel2000 = 0;
        totalAcima2000 = 0;
        totalCarros = 0;
        totalPagar = 0;
        
        do{
            System.out.print("Digite o valor do carro: ");
            valor = leitor.nextDouble();
            
            System.out.print("Digite o ano do carro: ");
            ano = leitor.nextInt();
            
            if(ano <= 2000){
                desconto = 0.12;
                totalAtel2000 ++;
                totalCarros ++;
            } else {
                desconto = 0.07;
                totalAcima2000 ++;
                totalCarros ++;
            }
            
            desconto = desconto * valor;
            valorFinal = valor - desconto;
            totalPagar += valorFinal;
            
            System.out.printf("O valor com desconto é: R$%.2f",
                    valorFinal);
            System.out.println(" Deseja continuar calculando? (S) Sim ou "
                    + "(N) Não: ");
            continuar = leitor.next();
                        
        }while("S".equalsIgnoreCase(continuar));    
        
        if(totalCarros == 1 && ano <= 2000) {
            System.out.println("Foi comprado " + totalCarros + " fabricado até "
                    + "o ano 2000");
        } else 
            if(totalCarros == 1 && ano > 2000) {
                System.out.println("Foi comprado " + totalCarros + 
                    " fabricados após o ano 2000");                        
            } else {
                System.out.println("Foram comprados " + totalCarros + 
                    " carros, sendo " + totalAtel2000 + " carros "
                    + "fabricados até o ano 2000 e " 
                    + totalAcima2000 + " carros fabricados após o ano 2000");
        }
        
        System.out.printf("O valor final a ser pago é: R$%.2f", 
                totalPagar);              
    }
    
}
