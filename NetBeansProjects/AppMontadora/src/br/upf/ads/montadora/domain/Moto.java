package br.upf.ads.montadora.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Moto extends Veiculo implements Serializable {

    private Integer cilindradas;

    // Construtor simples
    public Moto(Integer id, String placa, String modelo, Integer ano, Integer cilindradas) {
        super(id, placa, modelo, ano);
        this.cilindradas = cilindradas;
    }

    // Construtor completo e correto
    public Moto(Integer id, String placa, String modelo, Integer ano,
            Motor motor, Chassi chassi, Empresa fornecedor,
            Integer cilindradas) {

        super(id, placa, modelo, ano);
        this.setMotor(motor);
        this.setChassi(chassi);
        this.setFornecedor(fornecedor);
        this.cilindradas = cilindradas;
    }

    // Getters e setters
    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cilindradas);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Moto other)) {
            return false;
        }
        return Objects.equals(cilindradas, other.cilindradas);
    }

    @Override
    public String toString() {
        return "Moto{"
                + "cilindradas=" + cilindradas
                + '}';
    }
}
