/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads210017.model;

/**
 *
 * @author 210017
 */
public class ReservaHotel extends Reserva{
    private Integer numeroQuarto;
    private String classe;
    private float classeConforto;
    private float classeLuxo;

    public ReservaHotel() {
    }
    
    

    public ReservaHotel(Integer numeroQuarto, String classe) {
        this.numeroQuarto = numeroQuarto;
        this.classe = classe;
    }

    public ReservaHotel(Integer numeroQuarto, String classe, Integer codigo, Integer numeroDiarias, Float valorDiaria) {
        super(codigo, numeroDiarias, valorDiaria);
        this.numeroQuarto = numeroQuarto;
        this.classe = classe;
    }
    
    

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getClasse() {
        return classe;
    }

    public float classeConforto(String classe) {
        this.classeConforto = 50f;
        return classeConforto;
    }
    
    public float classeLuxo(String classe) {
        this.classeLuxo = 100f;
        return classeLuxo;
    }
    
    
    public void obterTotal(Integer numeroDiarias, Float valorDiaria, Float classeConforto, Float classeLuxo) {
        
        float totalDiariaSimples = valorDiaria * numeroDiarias;
        float totalDiariaConforto = (valorDiaria + classeConforto) * numeroDiarias;
        float totalDiariaLuxo = (valorDiaria + classeLuxo) * numeroDiarias;
        
    }
    
}
