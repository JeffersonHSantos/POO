/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;

import model.VeiculoDeCarga;
import model.VeiculoDePassageiro;

/**
 *
 * @author Jeff
 */
public class Montadora {
    public static void main(String[] args) {

        
        VeiculoDePassageiro carro = new VeiculoDePassageiro("ABC-1234", "Volkswagen", "T-Cross");
        carro.setAnoModelo(2023);
        carro.setAnoFabricacao(2022);
        carro.setChassi("9BWZZZ377VT004251");
        carro.setRenavam("12345678910");
        carro.setProcedencia("Nacional");
        carro.setCapacidadeMaximaCargaKg(400);
        carro.setAltura(1.56);
        carro.setLargura(1.76);
        carro.setProfundidade(4.19);
        carro.setCorExterna("Cinza");
        carro.setCorInterna("Preto");
        carro.setTipoCombustivel("Gasolina");
        carro.setMotor("1.0 TSI");
        carro.setQuilometragem(15000);
        carro.setConsumoMedio(13.5);
        carro.setNumeroPortas(4);
        carro.setNumeroPassageiros(5);
        carro.setOpcionais("Airbag, ABS, Multimídia");

        // Veículo de Carga
        VeiculoDeCarga van = new VeiculoDeCarga("XYZ-9876", "Mercedes-Benz", "Sprinter 415");
        van.setAnoModelo(2021);
        van.setAnoFabricacao(2020);
        van.setChassi("8ACZZZ177DT005873");
        van.setRenavam("98765432100");
        van.setProcedencia("Importado");
        van.setCapacidadeMaximaCargaKg(1200);
        van.setAltura(2.60);
        van.setLargura(1.99);
        van.setProfundidade(6.90);
        van.setCorExterna("Branco");
        van.setCorInterna("Cinza");
        van.setTipoCombustivel("Diesel");
        van.setMotor("2.2 CDI");
        van.setQuilometragem(85000);
        van.setConsumoMedio(10.2);
        van.setNumeroPortas(3);
        van.setNumeroPassageiros(3);
        van.setOpcionais("Direção hidráulica, ar-condicionado");

        System.out.println(carro);
        System.out.println(van);
    }
}

