/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads.montadora.domain;

import java.io.Serializable;
import java.util.Objects;


/**
 * Chassi está em composição de veículo(não vivem separados)
 * 
 */

public class Chassi implements Serializable{
    private Integer numero;
    private String modelo;
    private Veiculo veiculo;
    
   

    public Chassi() {
    }

    public Chassi(Integer numero, String modelo, Veiculo veiculo) {
        this.numero = numero;
        this.modelo = modelo;
        this.veiculo = veiculo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chassi other = (Chassi) obj;
        return Objects.equals(this.numero, other.numero);
    }

    @Override
    public String toString() {
        return "Chassi{" + "numero=" + numero + ", modelo=" + modelo + ", veiculo=" + veiculo + '}';
    }
    
    
    
}

