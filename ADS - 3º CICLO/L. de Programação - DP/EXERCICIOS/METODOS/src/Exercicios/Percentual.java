package Exercicios; import java.util.Scanner;

public class Percentual {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME O PRODUTO: "); String produto = sc.nextLine();
        System.out.println("INFORME O VALOR DO PRODUTO: "); double valorOriginal = sc.nextDouble();
        System.out.println("INFORME O NOVO VALOR: "); double valorAtual = sc.nextDouble();

        double percentual = ( ( valorAtual - valorOriginal ) / valorOriginal ) * 100;

        System.out.println("------------------");
        System.out.println("PRODUTO: " + produto );
        System.out.println("VALOR ANTIGO: " + valorOriginal );
        System.out.println("VALOR ATUAL: " + valorAtual );
        System.out.printf("PERCENTUAL: %.1f%%" , VerificarPercetual( percentual ) );
    }

    public static double VerificarPercetual( double porcentagem ){

        if ( porcentagem == 0.0 ) {
            System.out.println("STATUS: ESTABILIDADE ");
        } else if ( porcentagem > 0.0) {
            System.out.println("STATUS: ACIMA DO VALOR ");
        } else {
            System.out.println("STATUS: ABAIXO DO VALOR ");
        }

        return porcentagem;
    }


}
