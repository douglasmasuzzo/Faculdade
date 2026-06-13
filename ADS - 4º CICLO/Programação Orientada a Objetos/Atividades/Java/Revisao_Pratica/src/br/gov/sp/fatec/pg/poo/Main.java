package br.gov.sp.fatec.pg.poo;
import java.util.Scanner;

public class Main {
    public static void main( String[] agrs ){
        Scanner sc = new Scanner( System.in );
        Integer opcao = 0;

        Conta conta = new Conta();
        conta.setSaldo(2500.00);

        while( opcao != 4 ) {
            System.out.println("CAIXA ELETRÔNICO");
            System.out.println("ESCOLHA UMA OPÇÃO ABAIXO:");
            System.out.println(" [ 1 ] - CONSULTAR SALDO");
            System.out.println(" [ 2 ] - DEPOSITAR SALDO");
            System.out.println(" [ 3 ] - SACAR SALDO");
            System.out.println(" [ 4 ] - ENCERRAR ATIVIDADE");
            opcao = sc.nextInt();

            switch ( opcao ) {
                case 1 :
                    System.out.println("SALDO ATUAL: " + conta.ConsultarSaldo() ); break;

                case 2 :
                    System.out.println("INFORME O VALOR: ");
                    Double valor = sc.nextDouble();                
                    conta.DepositarSaldo( valor );
                    break;
                
                case 3 :
                    System.out.println("INFORME O VALOR: ");
                    valor = sc.nextDouble(); conta.SacarSaldo( valor );
                    break;

                case 4 :
                    System.out.println("ENCERRANDO O PROGRAMA...."); break;
                    
                default :
                    System.out.println("OPÇÃO INVÁLIDA"); break;
            }
        }

        sc.close();
    }
}
