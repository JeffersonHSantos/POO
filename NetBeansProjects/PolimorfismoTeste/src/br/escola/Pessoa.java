/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.escola;

/**
 *
 * @author Jeff
 */
public class Pessoa {
    private String nome;
    private String email;
    
    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public void mostrarInfo() {
        System.out.println("Nome:"+this.nome);
        System.out.println("E-mail:"+this.email);
    }
    
}
