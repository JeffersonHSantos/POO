/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads.montadora.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author 210017
 */
public class Moto extends Veiculo implements Serializable {
    private Integer cilindradas;

    public Moto() {
    }

    public Moto(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(Integer cilindradas, Integer id, String placa, String modelo, Integer ano, Motor motor, Chassi chassi, Empresa fabricante, Empresa fornecedor, List<Empresa> transportadores) {
        super(id, placa, modelo, ano, motor, chassi, fabricante, fornecedor, transportadores);
        this.cilindradas = cilindradas;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // reutiliza o da superclasse
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // reutiliza o da superclasse
    }

    @Override
    public String toString() {
        return "Moto{" + "cilindradas=" + cilindradas + '}';
    }
    
    

}
