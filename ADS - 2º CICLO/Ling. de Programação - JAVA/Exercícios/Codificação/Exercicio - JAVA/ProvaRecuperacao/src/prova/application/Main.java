package prova.application;
import prova.entities.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner( System.in );

        double media = aluno.CalcularMediaFinal();
        double ponto = aluno.CalcularPontos();

        System.out.println("INFORME O NOME DO USUÁRIO: ");
        String nome = sc.next();
        aluno.setNome( nome );

        aluno.setNota1( 70.0 );
        aluno.setNota2( 45.0 );
        aluno.setNota3( 30.0 );

        System.out.println("|| RELATÓRIO ||");
        System.out.println("NOME: " + aluno.getNome());
        System.out.println("NOTA 1: " + aluno.getNota1() );
        System.out.println("NOTA 2: " + aluno.getNota2() );
        System.out.println("NOTA 3: " + aluno.getNota3() );
        System.out.printf("CALCULAR MÉDIA: %.2f\n", aluno.CalcularMediaFinal());

        if ( media >= 60.0 ){
            System.out.printf("PONTOS: %.2f ", ponto );
        }
    }
}
