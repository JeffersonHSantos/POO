/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jeff
 */
public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private String fabricante;
    private String cor;

    // Construtor
    public Veiculo(String placa, String modelo, int ano, String fabricante, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.fabricante = fabricante;
        this.cor = cor;
    }

    // Getters e Setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    // Exibir dados
    public void exibirVeiculo() {
        System.out.println("\n--- Dados do Veículo ---");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cor: " + cor);
    }
}

/*
 A classe Veiculo representa um veículo que será cadastrado no sistema.
 Ela armazena informações como placa, modelo, ano, fabricante e cor.


package modelo; // Indica que esta classe pertence ao pacote "modelo"

public class Veiculo {

    // Atributos privados do veículo
    private String placa;
    private String modelo;
    private int ano;
    private String fabricante;
    private String cor;

    /*
     Construtor da classe Veiculo.
     É utilizado para criar um novo objeto passando todos os dados necessários.
    
    public Veiculo(String placa, String modelo, int ano, String fabricante, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.fabricante = fabricante;
        this.cor = cor;
    }

    // Métodos Getters e Setters dos atributos

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    /*
     Método que imprime os dados do veículo no console
     para visualização após o cadastro.
    
    public void exibirVeiculo() {
        System.out.println("\n--- Dados do Veículo ---");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cor: " + cor);
    }
}
*/



