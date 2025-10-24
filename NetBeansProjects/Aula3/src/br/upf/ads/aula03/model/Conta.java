package br.upf.ads.aula03.model;

public class Conta {
    // atributos = variáveis
    private Integer numero;
    private Float saldo;
    private String  titular;

    public Conta() {
        saldo = 0f;
    }

    public Conta(Integer numero, String titular) {
        setNumero(numero);
        this.numero = numero;
        this.titular = titular;
        saldo = 0f;
    }
    
    
   
    // métodos = funções
    public void depositar(Float valor){
        saldo = saldo + valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        if (numero <= 0) {
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

    
}
