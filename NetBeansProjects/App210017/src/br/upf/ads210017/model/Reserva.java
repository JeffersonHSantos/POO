/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads210017.model;

/**
 *
 * @author 210017
 */
abstract public class Reserva {
    private Integer codigo;
    private Integer numeroDiarias;
    private Float valorDiaria;

    public Reserva() {
    }

    public Reserva(Integer codigo, Integer numeroDiarias, Float valorDiaria) {
        this.codigo = codigo;
        this.numeroDiarias = numeroDiarias;
        this.valorDiaria = valorDiaria;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getNumeroDiarias() {
        return numeroDiarias;
    }

    public void setNumeroDiarias(Integer numeroDiarias) {
        if (numeroDiarias <= 0){
           throw new UnsupportedOperationException("Número Inválido");
        }
        this.numeroDiarias = numeroDiarias;
    }

    public Float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Float valorDiaria) {
        if (valorDiaria <= 0){
           throw new UnsupportedOperationException("Número Inválido");
        }
        this.valorDiaria = valorDiaria;
    }
    
    public void obterTotal(Integer numeroDiarias, Float valorDiaria) {
        float totalDiaria = valorDiaria * numeroDiarias;
    }
    
    
    
}
