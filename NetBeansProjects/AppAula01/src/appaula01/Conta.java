package appaula01;

public class Conta {
    // atributos = variáveis
    Integer numero;
    Float   saldo;
    String  titular;
    
    // métodos = funções
    void depositar(Float valor){
        saldo = saldo + valor;
    }
}
