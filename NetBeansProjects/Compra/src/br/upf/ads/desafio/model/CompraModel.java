/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads.desafio.model;

/**
 *
 * @author 210017
 */
public class CompraModel {
    //Cada compra deve ter as seguintes informações: código, nome do produto, quantidade e preço.//
    public Integer codigo;
    public String nomeProduto;
    public Integer quantidade;
    public Float preco;

    public CompraModel() {
    }

    public CompraModel(Integer codigo, String nomeProduto, Integer quantidade, Float preco) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public CompraModel(Integer codigo) {
        this.codigo = codigo;
    }

    
    

    public Float totalCompra() {
        return this.quantidade * this.preco;
    }
    
    public double totalIcms() {
        return this.totalCompra() * 0.17;
    }    
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

}

