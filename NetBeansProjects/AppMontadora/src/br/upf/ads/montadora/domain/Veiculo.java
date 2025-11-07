/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads.montadora.domain;

/**
 * Veículo é a Superclasse
 * recebe Motor por agregação(podem viver separados)
 * recebe Chassi por composição(não pode viver separados)
 * 
 */
public class Veiculo {
    
 // tipo - atributo
    Integer id;
    String placa;
    String modelo;
    Integer ano;
    Motor motor;
    Chassi chassi;
    Empresa fabricante;
    Empresa fornecedor;
    List<Empresa> transportadores;
    
}
