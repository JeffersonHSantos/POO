package br.upf.ads.aula02.model;

import java.io.Serializable;
import java.util.Objects;

public class Conta implements Serializable{
    // atributos = variáveis
    private Integer numero;
    private Float saldo;
    private String titular;

    // métodos construtores = funções de inicialização
    public Conta() {
        saldo = 0f;
    }

    public Conta(Integer numero) {
        setNumero(numero);
        saldo = 0f;
    }
        
    public Conta(Integer numero, String titular) {
        //this.numero = numero;
        setNumero(numero);
        this.titular = titular;
        saldo = 0f;
    }
    
    // operações e métodos = funções
    public void depositar(Float valor){
        saldo = saldo + valor;
    }

    public void sacar(Float valor){
        if (saldo <= valor){
           throw new UnsupportedOperationException("Saldo insuficiente para o saque.");
        }         
        saldo = saldo - valor;
    }

    public void transferir(Float valor, Conta destino){
        if (saldo <= valor){
           throw new UnsupportedOperationException("Saldo insuficiente para transferir.");
        }         
        saldo = saldo - valor;
        destino.saldo += valor;
    }
        
    // métodos de acesso = devido ao encapsulamento
    public Integer getNumero() {
        return numero;
    }

    public final void setNumero(Integer numero) {
        if (numero <= 0){
           throw new UnsupportedOperationException("Número Inválido");
        }
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Float getSaldo() {
        return saldo;
    }

    // substituição de equals e hashCode para tratar identidade única por atributo
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.numero);
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
        final Conta other = (Conta) obj;
        return Objects.equals(this.numero, other.numero);
    }

    // substituição de toString para gerar dados sobre o objeto
    @Override
    public String toString() {
        return  numero + " | " + titular;
    }

}
