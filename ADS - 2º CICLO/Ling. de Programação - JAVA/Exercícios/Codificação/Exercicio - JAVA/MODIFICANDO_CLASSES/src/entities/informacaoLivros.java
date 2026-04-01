package entities;

public class informacaoLivros {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo( String titulo ){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor( String autor ){
        this.autor = autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao( int anoPublicacao ){
        this.anoPublicacao = anoPublicacao;
    }
}
