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
public class ExerciciosJava28 {
    
    public static void main(String[] args) {
        
        //======================================================================
        /*Exercício 28 - Escreva um algoritmo para uma empresa que decide dar 
        um reajuste a seus 584 funcionários de acordo com os seguintes 
        critérios:
        
        a. 50% para aqueles que ganham menos do que três salários mínimos;
        b. 20% para aqueles que ganham entre três até dez salários mínimos;
        c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        d. 10% para os demais funcionários.
        
        Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
        Calcule o seu novo salário reajustado. Escrever o nome do funcionário, 
        o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar 
        sua folha de pagamento;*/
        //======================================================================
        
        String nome;
        float salario, salarioMinimo, novoSalario, folha, novaFolha, difFolha;
        
        Scanner leitor = new Scanner(System.in);
        
        salarioMinimo = 1212.0f;
        novoSalario = 0;
        folha = 0;
        novaFolha = 0;
        difFolha = 0;        
        
        //mudar a quantidade de acordo com o desejado
        int i = 0;
        for (; i < 4; i++) {
            
            System.out.println("Digite o nome do funcionário: ");
            nome = leitor.next();
            
            System.out.println("Digite o salário do funcionário: ");
            salario = leitor.nextFloat();
            
            folha += salario; 
            
            if(salario <= (salarioMinimo * 3)) {
                novoSalario = salario * 1.5f;                
            } else {
                if(salario <= (salarioMinimo * 10)) {
                    novoSalario = salario * 1.2f;                   
                } else {
                    if(salario <= (salarioMinimo * 20)) {
                        novoSalario = salario * 1.15f;                                              
                    } else {
                        novoSalario = salario * 1.10f;                        
                    }
                                                                                        
                }
            }
            
            novaFolha += novoSalario;
            
            System.out.printf("O(a) colaborador(a) " + nome + " terá um novo salário "
                    + "de R$%.2f%n", novoSalario);
            
            difFolha = novaFolha - folha;
            
        }         
        
        System.out.printf("A empresa terá um aumento em sua folha de "
                + "pagamento de R$%.2f%n", difFolha);
                
    }
    
}
