package br.edu.infnet.domain.model;

import javax.persistence.*;

import static javax.persistence.InheritanceType.JOINED;

@Entity
@Inheritance(strategy = JOINED)//??
public abstract class Ativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected String nome;
    protected float valor;
    protected int quantidade;

    public Ativo() {
    }

    public Ativo(String nome, float valor, Integer quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}