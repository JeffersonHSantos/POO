package br.upf.ads.montadora.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Carro extends Veiculo implements Serializable {

    private Integer passageiros;
    private Integer portas;

    // Construtor simples
    public Carro(Integer id, String placa, String modelo, Integer ano,
            Integer passageiros, Integer portas) {

        super(id, placa, modelo, ano);
        this.passageiros = passageiros;
        this.portas = portas;
    }

    // Construtor completo e correto
    public Carro(Integer id, String placa, String modelo, Integer ano,
            Integer passageiros, Integer portas,
            Motor motor, Chassi chassi, Empresa fabricante) {

        super(id, placa, modelo, ano);
        this.setMotor(motor);
        this.setChassi(chassi);
        this.setFabricante(fabricante);
        this.passageiros = passageiros;
        this.portas = portas;
    }

    // Getters e setters
    public Integer getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Integer passageiros) {
        this.passageiros = passageiros;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public Integer getNumPassageiros() {
        return passageiros;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passageiros, portas);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Carro other)) {
            return false;
        }
        return Objects.equals(passageiros, other.passageiros)
                && Objects.equals(portas, other.portas);
    }

    @Override
    public String toString() {
        return "Carro{"
                + "passageiros=" + passageiros
                + ", portas=" + portas
                + '}';
    }
}
