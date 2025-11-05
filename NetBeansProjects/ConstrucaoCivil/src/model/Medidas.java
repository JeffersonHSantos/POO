/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * 1 - Atributos da classe Medidas
 * São as características do objeto que será criado.
 * Double é usado para números com casas decimais.
 */


public class Medidas {
    private Double base;
    private Double altura;
    private Double comprimento;
    private double total;

    /**
    * 2 - Construtores
    * O construtor serve para criar o objeto e definir valores iniciais.
    * - Construtor vazio: cria o objeto sem definir valores.
    * - Construtor com parâmetros: cria o objeto já com valores preenchidos.
    */

    
    public Medidas() {
    }
    
    public Medidas(Double base, Double altura, Double comprimento) {;
        this.base = base;
        this.altura = altura;
        this.comprimento = comprimento;
    }
    
    
    /**
    * 3 - Método de cálculo
    * Este método faz o cálculo dos metros cúbicos (m³).
    * Ele multiplica base x altura x comprimento para obter o volume.
    * Será chamado no programa principal para mostrar o resultado.
    */

    
    public Double calcularM3() {
        this.total = base * altura * comprimento;
        return this.total;
    }
        
    
    /**
    * 4 - Getters e Setters
    * São usados para acessar e alterar os valores dos atributos de forma segura.
    * GET → retorna o valor do atributo.
    * SET → altera o valor do atributo.
    * Boas práticas de Programação Orientada a Objetos.
    */

 

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getComprimento() {
        return comprimento;
    }
    
    
    
    
    
    

}
