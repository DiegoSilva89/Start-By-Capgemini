/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

import java.util.Date;

/**
 *
 * @author diego
 */
public class Funcionario {
    
    private String nome;
    private String CPF;
    private Date dataNasimento;
    private float salario;
           
    }

    //Getter and setters, métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataNasimento() {
        return dataNasimento;
    }

    public void setDataNasimento(Date dataNasimento) {
        this.dataNasimento = dataNasimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
