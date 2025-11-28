/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads210017.model;

/**
 *
 * @author 210017
 */
public class ReservaEvento extends Reserva {
    private Integer numeroIngressos;
    private Float valorIngresso;
    private Float obterTotalIngressos;

    public ReservaEvento() {
    }

    public ReservaEvento(Integer numeroIngressos, Float valorIngresso) {
        this.numeroIngressos = numeroIngressos;
        this.valorIngresso = valorIngresso;
    }

    public Integer getNumeroIngressos() {
        return numeroIngressos;
    }

    public void setNumeroIngressos(Integer numeroIngressos) {
        this.numeroIngressos = numeroIngressos;
    }

    public Float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(Float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public Float obterTotalIngressos(Float totalDiariaSimples, Float totalDiariaConforto, Float totalDiariaLuxo ) {
        return obterTotalIngressos;
      
    }
    
    
}
