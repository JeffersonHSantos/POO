package br.edu.montadora.dominio;

import java.util.List;

public class Carro extends Veiculo {

    private Integer passageiros;
    private Integer portas;

    public Carro() {
    }

    public Carro(Integer id) {
        super(id);
    }

    public Carro(Integer passageiros, Integer portas, Integer id, String placa, String modelo, Integer ano, Motor motor, Chassi chassi, Empresa fabricante, Empresa fornecedor, List<Empresa> transportadores) {
        super(id, placa, modelo, ano, motor, chassi, fabricante, fornecedor, transportadores);
        this.passageiros = passageiros;
        this.portas = portas;
    }



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

    
    
}
