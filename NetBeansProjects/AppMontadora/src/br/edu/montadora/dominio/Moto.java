package br.edu.montadora.dominio;

import java.util.List;

public class Moto extends Veiculo {

    private Integer cilindradas;

    public Moto() {
    }

    public Moto(Integer id) {
        super(id);
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
    
}
