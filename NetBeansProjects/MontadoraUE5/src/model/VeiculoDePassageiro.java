/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jeff
 */
public class VeiculoDePassageiro extends Veiculo {

    private boolean arCondicionado;
    private boolean direcaoHidraulica;
    private boolean cambioAutomatico;

    public VeiculoDePassageiro(String placa, String marca, String modelo) {
        super("Passageiro", placa, marca, modelo);
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format("Ar Condicionado: %s%nDireção Hidráulica: %s%nCâmbio Automático: %s%n",
                             arCondicionado ? "Sim" : "Não",
                             direcaoHidraulica ? "Sim" : "Não",
                             cambioAutomatico ? "Sim" : "Não");
    }
}
