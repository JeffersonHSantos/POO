/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads.montadora.domain;

/**
 * Empresa tem associação com cidade
 * 
 */
public class Empresa {
    Integer id;
    String nome;
    String cnpj;
    Cidade cidade;
}
