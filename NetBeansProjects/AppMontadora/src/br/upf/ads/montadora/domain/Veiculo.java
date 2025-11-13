/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads.montadora.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Veículo é a Superclasse
 * recebe Motor por agregação(podem viver separados)
 * recebe Chassi por composição(não pode viver separados)
 * 
 */
public class Veiculo implements Serializable {
    private Integer id;
    private String placa;
    private String modelo;
    private Integer ano;
    private Motor motor;
    private Chassi chassi;
    private Empresa fabricante;
    private Empresa fornecedor;
    private List<Empresa> transportadores;

    public Veiculo() {
    }

    public Veiculo(Integer id, String placa, String modelo, Integer ano, Motor motor, Chassi chassi, Empresa fabricante, Empresa fornecedor, List<Empresa> transportadores) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.chassi = chassi;
        this.fabricante = fabricante;
        this.fornecedor = fornecedor;
        this.transportadores = transportadores;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chassi getChassi() {
        return chassi;
    }

    public void setChassi(Chassi chassi) {
        this.chassi = chassi;
    }

    public Empresa getFabricante() {
        return fabricante;
    }

    public void setFabricante(Empresa fabricante) {
        this.fabricante = fabricante;
    }

    public Empresa getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Empresa fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<Empresa> getTransportadores() {
        return transportadores;
    }

    public void setTransportadores(List<Empresa> transportadores) {
        this.transportadores = transportadores;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Veiculo other = (Veiculo) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", ano=" + ano + ", motor=" + motor + ", chassi=" + chassi + ", fabricante=" + fabricante + ", fornecedor=" + fornecedor + ", transportadores=" + transportadores + '}';
    }
    
    
    
    
    
}
