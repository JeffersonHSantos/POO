/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jeff
 */
public class VeiculoDeCarga extends Veiculo {

    private double volumeCarga; // volume total de carga em m³
    private boolean temCarroceriaFechada; // exemplo de característica adicional

    public VeiculoDeCarga(String placa, String marca, String modelo) {
        super("Carga", placa, marca, modelo);
    }

    public double getVolumeCarga() {
        return volumeCarga;
    }

    public void setVolumeCarga(double volumeCarga) {
        this.volumeCarga = volumeCarga;
    }

    public boolean isTemCarroceriaFechada() {
        return temCarroceriaFechada;
    }

    public void setTemCarroceriaFechada(boolean temCarroceriaFechada) {
        this.temCarroceriaFechada = temCarroceriaFechada;
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format("Volume de Carga: %.2f m³%nCarroceria Fechada: %s%n",
                             volumeCarga, temCarroceriaFechada ? "Sim" : "Não");
    }
}
