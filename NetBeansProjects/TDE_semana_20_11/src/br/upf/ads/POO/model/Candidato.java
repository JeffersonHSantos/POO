/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads.POO.model;

import java.util.Objects;

/**
 *
 * @author Jeff
 */
public class Candidato {
    
    private Integer numero;
    private String  nome;
    private String  partido;
    private String  cargo; 
    private String  estado;
    private String  cidade;
    

    public Candidato() {
    }

    public Candidato(Integer numero) {
        this.numero = numero;
    }

    public Candidato(Integer numero, String nome, String partido, String cargo, String estado, String cidade) {
        this.numero = numero;
        this.nome = nome;
        this.partido = partido;
        this.cargo = cargo;
        this.estado = estado;
        this.cidade = cidade;
    }
    
    

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Candidato other = (Candidato) obj;
        return Objects.equals(this.numero, other.numero);
    }

    @Override
    public String toString() {
        return "Candidato{" + "numero=" + numero + ", nome=" + nome + ", partido=" + partido + ", cargo=" + cargo + ", estado=" + estado + ", cidade=" + cidade + '}';
    }

    

    
    
    
    
}
