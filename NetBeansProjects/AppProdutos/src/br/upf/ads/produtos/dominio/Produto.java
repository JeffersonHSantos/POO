package br.upf.ads.produtos.dominio;

import java.io.Serializable;
import java.util.Objects;

public class Produto implements Serializable{
    private Integer codigo;
    private String descricao;
    private Float preco;
    private Integer quantidade;

    public Produto() {
        preco = 0f;
        quantidade = 0;
    }

    public Produto(Integer codigo) {
        setCodigo(codigo);
        preco = 0f;
        quantidade = 0;
    }
        
    public Produto(Integer codigo, String descricao) {
        setCodigo(codigo);
        this.descricao = descricao;
        preco = 0f;
        quantidade = 0;
    }
    
    public void reajustarPreco(Float percentual){
        preco = preco + (preco * percentual / 100);
    }

    public void adicionarEstoque(Integer qtd){
        quantidade = quantidade + qtd;
    }

    public void removerEstoque(Integer qtd){
        if (quantidade < qtd){
           throw new UnsupportedOperationException("Estoque insuficiente.");
        }         
        quantidade = quantidade - qtd;
    }
        
    public Integer getCodigo() {
        return codigo;
    }

    public final void setCodigo(Integer codigo) {
        if (codigo <= 0){
           throw new UnsupportedOperationException("Código Inválido");
        }
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.codigo);
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

    @Override
    public String toString() {
        return  codigo + " | " + descricao;
    }

}
