package br.upf.ads.tde.dominio;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0) throw new IllegalArgumentException("id negativo");
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null) throw new IllegalArgumentException("nome nulo");
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0) throw new IllegalArgumentException("preco negativo");
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0) throw new IllegalArgumentException("quantidade negativa");
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return id + " | " + nome + " | " + preco + " | " + quantidade;
    }
}
