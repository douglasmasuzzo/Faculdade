package Exercicios;

public class MainAluno {
    public static void main( String[] args ){
        Aluno aluno = new Aluno("Douglas");

        aluno.AdicionarNotas( 8.0 );
        aluno.AdicionarNotas( 6.0 );
        double media = aluno.CalcularMedia();

        System.out.println("ALUNO: " + aluno.getNome() );
        System.out.println("MÉDIA : " + media );
    }
}
