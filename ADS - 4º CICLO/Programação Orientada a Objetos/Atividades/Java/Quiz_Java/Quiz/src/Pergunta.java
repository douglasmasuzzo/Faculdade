public class Pergunta {
    private String enunciado;
    private String resposta_correta;
    
    public Pergunta( String enunciado , String resposta ){
        this.enunciado = enunciado;
        this.resposta_correta  = resposta;
    }

    public String getEnunciado(){ return this.enunciado; }
    
    public void setEununciado( String enunciado ){ this.enunciado = enunciado; }

    public String getResposta(){ return this.resposta_correta; }

    public void setResposta( String resposta ){ this.resposta_correta = resposta ; }
}