package br.upf.ads.montadora.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Veiculo implements Serializable {

    private Integer id;
    private String placa;
    private String modelo;
    private Integer ano;
    private Motor motor;

    private Empresa fabricante;
    private Empresa fornecedor;
    private List<Empresa> transportadores;
    private Chassi chassi;

    // Construtor principal
    public Veiculo(Integer id, String placa, String modelo, Integer ano) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;

        // Evita NPE
        this.transportadores = new ArrayList<>();
    }

    // Construtor completo
    public Veiculo(Integer id, String placa, String modelo, Integer ano,
                   Motor motor, Chassi chassi,
                   Empresa fabricante, Empresa fornecedor,
                   List<Empresa> transportadores) {

        this(id, placa, modelo, ano); // chama o primeiro construtor
        this.motor = motor;
        this.chassi = chassi;
        this.fabricante = fabricante;
        this.fornecedor = fornecedor;

        // evita null, se vier null cria uma lista vazia
        this.transportadores = (transportadores != null) ? transportadores : new ArrayList<>();
    }

    // Getters e Setters
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
        this.transportadores = (transportadores != null) ? transportadores : new ArrayList<>();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Veiculo other = (Veiculo) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Veiculo { " +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", motor=" + motor +
                ", chassi=" + chassi +
                ", fabricante=" + fabricante +
                ", fornecedor=" + fornecedor +
                ", transportadores=" + transportadores +
                " }";
    }
}
