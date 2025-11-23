package br.upf.ads.tde.dominio;

import java.io.Serializable;
import java.util.Objects;

/**
 * Classe de domínio representando um Produto
 * @author TDE Semana 20/11/2025
 */
public class Produto implements Serializable {
    
    // Atributos - 4 atributos conforme solicitado
    private Integer codigo;
    private String nome;
    private String categoria;
    private Double preco;
    
    // Métodos Construtores
    public Produto() {
        this.preco = 0.0;
    }
    
    public Produto(Integer codigo) {
        setCodigo(codigo);
        this.preco = 0.0;
    }
    
    public Produto(Integer codigo, String nome, String categoria, Double preco) {
        setCodigo(codigo);
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    
    // Métodos de Encapsulamento (Getters e Setters)
    public Integer getCodigo() {
        return codigo;
    }
    
    public final void setCodigo(Integer codigo) {
        if (codigo == null || codigo <= 0) {
            throw new IllegalArgumentException("Código deve ser maior que zero");
        }
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public Double getPreco() {
        return preco;
    }
    
    public void setPreco(Double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.preco = preco;
    }
    
    // Substituição de equals e hashCode para identidade única por código
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codigo);
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
        final Produto other = (Produto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
    // Substituição de toString para representação textual do objeto
    @Override
    public String toString() {
        return codigo + " | " + nome + " | " + categoria + " | R$ " + String.format("%.2f", preco);
    }
}
