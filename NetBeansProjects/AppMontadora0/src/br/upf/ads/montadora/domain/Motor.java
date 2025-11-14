/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads.montadora.domain;

import java.io.Serializable;

/**
 *
 * @author 210017
 */
public class Motor implements Serializable {
    private Integer numero;
    private String modelo;
    private Integer cilindros;

    public Motor() {
    }

    public Motor(Integer numero, String modelo, Integer cilindros) {
        this.numero = numero;
        this.modelo = modelo;
        this.cilindros = cilindros;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }
    
    
    
    
    
    
}
