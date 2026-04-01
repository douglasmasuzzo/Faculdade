package br.edu.Fatecpg.model;

public class Cliente {
    private String nome;
    private double credito;

    public Cliente ( String nome, double credito ){
        this.nome = nome;
        this.credito = credito;
    }

    public String getNome(){
        return nome;
    }

    public double getCredito() {
        return credito;
    }

    public void setNome ( String nome ){
        this.nome = nome;
    }

    public void setCredito ( double credito ){
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "NOME: " + nome + " || CRÉDITO " + credito;
    }
}
