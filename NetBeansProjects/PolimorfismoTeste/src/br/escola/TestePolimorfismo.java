/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.escola;

/**
 *
 * @author Jeff
 */
public class TestePolimorfismo {
    public static void main(String[] args) {
        Pessoa p,p2;
        p = new Pessoa("Alex Silva","alex@email.com");
        p2 = new Funcionario("Lea Souza","lea@email.com",2000);
        /** OU:
        * Pessoa p = new Pessoa("Alex Silva","alex@email.com");
        * Pessoa p2 = new Funcionario("Lea Souza","lea@email.com",2000);
        */
        p.mostrarInfo();
        p2.mostrarInfo();
    }
    
}
