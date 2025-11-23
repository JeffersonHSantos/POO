/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.escola;

/**
 *
 * @author Jeff
 */
public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String email, double salario) {
        super(nome, email);
        this.salario = salario;
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Salário:"+this.salario);
    }
}
