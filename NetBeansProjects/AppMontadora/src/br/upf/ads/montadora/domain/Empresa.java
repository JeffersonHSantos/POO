/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ads.montadora.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * Empresa tem associação com cidade
 * 
 */
public class Empresa implements Serializable {
    private Integer id;
    private String nome;
    private String cnpj;
    private Cidade cidade;

    public Empresa() {
    }

    public Empresa(Integer id, String nome, String cnpj, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cidade = cidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + ", cidade=" + cidade + '}';
    }
    
    
    
}
