/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciojavapoo_04;

/**
 *
 * @author Diego Silva
 */
public class ExercicioJavaPOO_04 {

    public static void main(String[] args) {
        
        Invoice inv = new Invoice(1, "Mousepad", 10, 50.0f);        
        System.out.println("Valor total = R$" + inv.getInvoiceAmount());
        
    }
}
