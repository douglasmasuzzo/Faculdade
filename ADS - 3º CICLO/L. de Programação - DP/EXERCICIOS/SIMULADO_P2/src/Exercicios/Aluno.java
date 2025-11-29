package Exercicios;
import java.util.ArrayList;

public class Aluno {

    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();

    public Aluno( String nome ){ this.nome = nome; }

    public String getNome(){ return nome; }
    public void setNome( String nome ){ this.nome = nome; }

    public ArrayList<Double> getNotas(){ return notas; }
    public void setNotas( ArrayList<Double> notas ){ this.notas = notas; }

    public void AdicionarNotas( double nota ){ this.notas.add( nota ); }

    public double CalcularMedia(){
        double soma = 0;
        for ( double nota : notas ){
            soma += nota;
        }
        return soma / notas.size();
    }
}
