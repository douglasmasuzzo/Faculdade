import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;

    public Aluno(){}

    public String getNome(){
        return nome;
    }
    public void setNome( String nome ){
        this.nome = nome;
    }

    public List<Double> getNotas(){
        return notas;
    }
    public void setNotas( List<Double> notas ){
        this.notas = notas;
    }

    public double calcularMedia(){
        if ( notas == null || notas.isEmpty() ) return 0;
            double soma = 0;
                for ( double nota : notas ){
                    soma += nota;
                }
                return soma / notas.size();
    }

}