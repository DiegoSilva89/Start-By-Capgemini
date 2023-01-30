/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

import java.util.Date;

/**
 *
 * @author Diego Silva
 */
public class Heranca {

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("Diego");
        v.setSalario(1000.0f);
        v.setCpf("12345678584");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salário do vendedor é: " + v.calcularSalario());
        
        v.calcularSalario();
        
        Motorista m = new Motorista();
        
        
    }
}
