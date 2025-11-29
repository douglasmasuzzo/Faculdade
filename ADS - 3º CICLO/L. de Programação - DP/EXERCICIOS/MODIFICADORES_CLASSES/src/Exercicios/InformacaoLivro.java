package Exercicios;

public class InformacaoLivro {
    private String titulo;
    private String autor;
    private int publicacao;

    public InformacaoLivro( String titulo, String autor, int publicacao ){
        this.titulo = titulo;
        this.autor = autor;
        this.publicacao = publicacao;
    }
    public InformacaoLivro(){}

    public String getTitulo(){ return titulo; }
    public String getAutor(){ return autor; }
    public int getPublicacao(){ return publicacao; }
    public void ExibirLivro(){
        System.out.println("TÍTULO: " + titulo );
        System.out.println("AUTOR: " + autor );
        System.out.println("ANO DE LANÇAMENTO : " + publicacao );
    }

    public void setTitulo( String titulo ){ this.titulo = titulo; }
    public void setAutor( String autor ){ this.autor = autor; }
    public void setPublicacao( int publicacao ){ this.publicacao = publicacao; }
}
