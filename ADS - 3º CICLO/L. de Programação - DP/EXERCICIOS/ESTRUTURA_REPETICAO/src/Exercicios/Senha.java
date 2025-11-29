package Exercicios; import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in ); int senhaFinal = 2004; int senha = 0;

        while ( senha != senhaFinal ){
            System.out.println("INFORME A SENHA: "); senha = sc.nextInt();

            if ( senha != senhaFinal ) {
                System.out.println("SENHA: " + senha + " || ACESSO NEGADO");
            } else {
                System.out.println("SENHA: " + senhaFinal + " || ACESSO LIBERADO");
            }

        }
        sc.close();
    }
}
