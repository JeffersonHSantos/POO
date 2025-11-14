package br.edu.montadora.dominio;

import java.io.Serializable;
import java.util.Objects;

public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private String estado;

    public Cidade() {}
    public Cidade(Long id, String nome, String estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cidade)) return false;
        Cidade cidade = (Cidade) o;
        return Objects.equals(id, cidade.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "Cidade{id=" + id + ", nome='" + nome + "', estado='" + estado + "'}";
    }
}
