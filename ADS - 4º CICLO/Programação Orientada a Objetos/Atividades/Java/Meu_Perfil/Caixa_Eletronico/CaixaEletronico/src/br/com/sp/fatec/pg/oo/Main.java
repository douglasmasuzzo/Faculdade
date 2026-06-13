package br.com.sp.fatec.pg.oo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instanciando ContaCorrente (que é uma Conta)
        ContaCorrente conta = new ContaCorrente();
        Scanner sc = new Scanner(System.in);
        
        conta.setSaldo(2500.00);
        Integer opcao;

        System.out.println(" ==== WELCOME LEON ==== ");

        do {
            System.out.println("\n === SELECIONE A OPÇÃO DESEJADA === ");
            System.out.println(" [ 1 ] - CONSULTAR SALDO ");
            System.out.println(" [ 2 ] - DEPOSITAR VALOR ");
            System.out.println(" [ 3 ] - SACAR VALOR ");
            System.out.println(" [ 4 ] - IMPRIMIR EXTRATO ");
            System.out.println(" [ 5 ] - SAIR ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("SALDO: " + conta.ConsultarSaldo());
                    break;
                case 2:
                    System.out.print("INFORME O VALOR DE DEPÓSITO: ");
                    conta.DepositarValor(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("INFORME O VALOR DE SAQUE: ");
                    conta.SacarValor(sc.nextDouble());
                    break;
                case 4:
                    conta.ImprimirExtrato();
                    break;
                case 5:
                    System.out.println("ENCERRANDO PROGRAMA....");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA.");
                    break;
            }
        } while (opcao != 5);

        System.out.println(" ===== CÁLCULO DE TRIBUTOS ===== ");
        List< Tributavel > listaTributos = new ArrayList<>();
        SeguroVida seguro = new SeguroVida();

        listaTributos.add( conta );
        listaTributos.add( seguro );

        Double totalTributos = 0;

        for ( Tributavel item : listaTributos ){
            totalTributos += item.getValorImposto();
        }

        System.out.println("Tributos da Conta Corrente: " + conta.getValorImposto());
        System.out.println("Tributos do Seguro de Vida: " + seguro.getValorImposto());
        System.out.println("TOTAL DE TRIBUTOS ACUMULADOS: " + totalTributos);

        sc.close();
    }
}
