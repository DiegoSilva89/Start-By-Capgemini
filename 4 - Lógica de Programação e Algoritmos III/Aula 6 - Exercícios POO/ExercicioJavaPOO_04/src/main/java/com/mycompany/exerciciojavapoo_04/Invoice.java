/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciojavapoo_04;

/**
 *
 * @author Diego Silva
 */
public class Invoice {

    //1º passo - definir os atributos
    private int codigoItem;
    private String descricao;
    private int quantidade;
    private float precoUnitario;

    //2º passo - definir o método construtor, alt + insert no teclado e depois selecionar os métodos construtores
    public Invoice(int codigoItem, String descricao, int quantidade, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);

    }

    public double getInvoiceAmount() {
        return quantidade * precoUnitario;
    }

    //3º passo - definir os getters and setters
    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        //validando quantidade e valor unitario para caso a quantidade seja menor que zero
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario < 0) {
            this.precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }

}
