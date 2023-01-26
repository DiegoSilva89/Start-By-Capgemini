package com.company.classes;

/**
 *
 * @author Diego Silva
 */
public class Pessoa {
    
    //atributos da classe
    private float peso; //private é um modificador de acesso como o public
    private float altura;    
    
    /*Diferente do public, o private não permite que as variáveis ou métodos 
    sejam modificados por outras classes*/
    
    //método - são as ações que a entidade pode fazer no sistema.
    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }
    
    //Métodos acessores que dão acessos a classe Pessoa
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getAltura() {
        return altura;
    }
    
}
