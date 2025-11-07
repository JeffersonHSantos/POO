package br.upf.ads.atividade.model;

public class Compra {

    // private é encapsulamento, private, public, ...
    private int codigo;
    private String nomeProduto;
    private int quantidade;
    private double preco;

    
    // sobrecarga de construtores = ter dois construtores, um vazio e um com as opções
    public Compra() {
    }

    public Compra(int codigo, String nomeProduto, int quantidade, double preco) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double calcularTotal() {
        return quantidade * preco;
    }

    public double calcularICMS() {
        return calcularTotal() * 0.17;
    }

    public double calcularTotalICMS() {
        return calcularTotal() + calcularICMS();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
     
    /*
    IDENTIDADE DOS OBJETOS, pela chave primária.
    INSERT CODE > equals() e hashCode() e seleciona a chave primária
    */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.codigo;
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
        final Compra other = (Compra) obj;
        return this.codigo == other.codigo;
    }
    
    
    

    @Override
    public String toString() {
        return "Produto: " + nomeProduto
                + " Quantidade: " + quantidade
                + " Preco: R$ " + preco
                + " Total: R$ " + calcularTotal()
                + " ICMS 17%: R$ " + calcularICMS()
                + " Total com icms: R$ " + calcularTotalICMS();
    }
    
    
    
    
    
    
}
