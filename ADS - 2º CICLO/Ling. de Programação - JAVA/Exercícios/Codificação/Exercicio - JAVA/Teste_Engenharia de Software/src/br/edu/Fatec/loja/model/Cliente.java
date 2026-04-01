package br.edu.Fatec.loja.model;

public class Cliente {
    private String nome;
    private String genero;
    private String classe;
    private int idade;

    public Cliente ( String nome, String genero, String classe, int idade ) {
        this.nome = nome;
        this.genero = genero;
        this.classe = classe;
        this.idade = idade;
    }

    public Cliente(){}

    public String getNome(){
        return nome;
    }
    public String getGenero(){
        return genero;
    }
    public String getClasse(){
        return classe;
    }
    public int getIdade(){
        return idade;
    }

    public void setNome ( String nome ){
        this.nome = nome;
    }
    public void setGenero ( String genero ){
        this.genero = genero;
    }
    public void setClasse( String classe ){
        this.classe = classe;
    }
    public void setIdade( int idade ){
        this.idade = idade;
    }

    @Override
    public String toString() {
        return ("NOME: " + nome + "\n" + "GÊNERO: " + genero + "\n" + "CLASSE: " + classe + "\n" + "IDADE: " + idade );
    }
}
