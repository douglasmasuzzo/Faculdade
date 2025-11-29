package Exercicios;
import java.util.Scanner;

public class Banco {
    public static void main( String[] args ){
        ContaBancaria CB = new ContaBancaria("Alan", 2500.00 );
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME SEU NOME : "); String nome = sc.nextLine();
        CB.setTitular( nome );

        System.out.println("INFORME O SALDO DA CONTA : "); double saldo = sc.nextDouble();
        CB.setSaldo( saldo );

        System.out.println("ESCOLHA UMA OPÇÃO");
        System.out.println("[ 1 ] - DEPOSITAR DINHEIRO ");
        System.out.println("[ 2 ] - SACAR DINHEIRO");
        int opcao = sc.nextInt();

        switch ( opcao ){
            case 1 :
                System.out.println("SALDO ORIGINAL : " + CB.getSaldo() );
                System.out.println("INFORME A QUANTIA DESEJADA: "); double valor = sc.nextDouble();
                System.out.println("SALDO ATUALIZADO : " + CB.RealizarDeposito( valor ) );
                break;

            case 2 :
                System.out.println("SALDO ORIGINAL : " + CB.getSaldo() );
                System.out.println("INFORME A QUANTIA DESEJADA: "); double saque = sc.nextDouble();
                System.out.println("SALDO ATUALIZADO : " + CB.RealizarSaque( saque ) );
                break;

            default :
                System.out.println("OPÇÃO NÃO DESEJADA"); break;
        }

        System.out.println("-------------------------------");
        System.out.println("TÍTULAR DA CONTA : " + CB.getTitular() );
        System.out.println("SALDO FINAL : " + CB.getSaldo() );
    }
}
