public class Usuario {
    private String nome;
    private Integer acertos;
    private Integer total_questoes;

    public Usuario( String nome ){
        this.nome = nome;
        this.acertos = 0;
        this.total_questoes = 0; 
    }

    public String getNome(){ return this.nome; }

    public void setNome( String nome ){ this.nome = nome; }

    public Integer getAcertos() { return this.acertos; }

    public void setAcertos( Integer acertos ){ this.acertos = acertos; }

    public Integer getTotalQuestoes(){ return this.total_questoes; }

    public void setTotalQuestoes( Integer total_questoes ){ this.total_questoes = total_questoes; }

    public void RegistrarRepsosta( Boolean resposta ){
        total_questoes++;
        if (resposta) { acertos++;}
    }

    public Double CalcularAproveitamento(){
        if ( total_questoes == 0 ) {
            return 0.0;
        } else {
            return ( acertos / ( double ) total_questoes ) * 100;
        }
    }
}