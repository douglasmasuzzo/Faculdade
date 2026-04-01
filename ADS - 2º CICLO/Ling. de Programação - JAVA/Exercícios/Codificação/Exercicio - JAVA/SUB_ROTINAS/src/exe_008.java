import java.util.Scanner;

public class exe_008 {

    public static double calcularMedia( double nota1, double nota2, double nota3, char tipo ) {
        if ( tipo == 'A' ) {
            return ( nota1 + nota2 + nota3 ) / 3;
        } else {
            return ( (nota1 * 5) + (nota2 * 3) + (nota3 * 2) / 10);
        }
    }
    public static void main(String[] args){
        Scanner notasAluno = new Scanner (System.in);
        char tipo = ' ';

        System.out.println("Digite as notas do Aluno: ");
        double nota1 = notasAluno.nextDouble();
        double nota2 = notasAluno.nextDouble();
        double nota3 = notasAluno.nextDouble();

        while ( true ){
            System.out.print("Selecione a operação ( A || P ): ");
            tipo = notasAluno.next().toUpperCase().charAt(0);

            if ( tipo == 'A' || tipo == 'P' ) {
                double media = calcularMedia(nota1, nota2, nota3, tipo);

                if (tipo == 'A') {
                    System.out.printf("Média Aritmética: %.2f", media);
                } else {
                    System.out.printf("Média Ponderada: %.2f", media);
                }
                break;
            } else {
                System.out.print("Desculpe. Não há outra forma de operação");
            }
        }

        notasAluno.close();
    }
}
