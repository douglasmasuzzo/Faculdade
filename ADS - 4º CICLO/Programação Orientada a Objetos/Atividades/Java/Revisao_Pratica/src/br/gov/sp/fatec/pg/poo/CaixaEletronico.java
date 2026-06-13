package br.gov.sp.fatec.pg.poo;
import java.util.Scanner;

public class CaixaEletronico { 
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        Double saldo = 2500.00;
        Integer opcao = 0;
        
        while( opcao != 4 ){    
            System.out.print("==== CAIXA ELETRÔNICO ====\n");
            System.out.println("ESCOLHA UMA OPÇÃO ABAIXO: ");
            System.out.println(" [ 1 ] - CONSULTAR SALDO");
            System.out.println(" [ 2 ] - DEPOSITAR SALDO");
            System.out.println(" [ 3 ] - SACAR SALDO");
            System.out.println(" [ 4 ] - ENCERRAR ATIVIDADE");
        
            opcao = sc.nextInt();
            System.out.println("OPÇÃO SELECIONADA: " + opcao );
    
            switch( opcao ){
                case 1 :
                    System.out.printf("SALDO ATUAL: %.2f\n", saldo );
                    break;

                case 2 :
                    System.out.println("INFORME O VALOR DE DEPÓSITO: ");
                    Double deposito = sc.nextDouble(); saldo += deposito; 
                    System.out.printf("VALOR ATUAL: %.2f\n", saldo );
                    break;
                    
                case 3 : 
                    System.out.println("INFORME O VALOR DE SAQUE: ");
                    Double saque = sc.nextDouble();
                    if ( saque <= saldo ){
                        saldo -= saque;
                        System.out.printf("SAQUE: %.2f\n", saldo );
                    } else {
                        System.out.println("SAQUE BLOQUEADO, SALDO INSUFICIENTE");
                    }
                    break;

                case 4 :
                    System.out.println("ENCERRANDO PROGRAMA....");
                    break;

                default :
                    System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE");
                    break;
            }
        }
        sc.close();
    }
}
