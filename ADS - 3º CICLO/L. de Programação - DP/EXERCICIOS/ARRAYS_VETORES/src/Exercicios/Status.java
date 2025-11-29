package Exercicios; import java.util.Scanner;

public class Status {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("DEFINA A QUANTIDADE DE ALUNOS: ");
        int quantidade = sc.nextInt(); sc.nextLine();

        String nomes[] = new String[ quantidade ];
        double primeiroSemestre[] = new double[ quantidade ];
        double segundoSemestre[] = new double[ quantidade ];

        for ( int i = 0; i < quantidade; i++ ){

            System.out.println("INFORME O NOME DO ALUNO: ");
            nomes[ i ] = sc.nextLine();

            System.out.println("INFORME A 1º NOTA DE: " + nomes[ i ] );
            primeiroSemestre[ i ] = sc.nextDouble();

            System.out.println("INFORME A 2º NOTA DE: " + nomes[ i ] );
            segundoSemestre[ i ] = sc.nextDouble(); sc.nextLine();

            double nota = primeiroSemestre[ i ] + segundoSemestre[ i ];
            double media = nota / quantidade;

            if ( media >= 6.0 ){
                System.out.printf("MÉDIA: %.1f\n", media );
                System.out.println("STATUS: APROVADO");
            } else {
                System.out.printf("MÉDIA: %.1f\n", media );
                System.out.println("STATUS: REPROVADO");
            }
        }
        sc.close();
    }
}
