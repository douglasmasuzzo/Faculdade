package Exercicios; import java.util.Scanner;

public class Programa{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        double preco = 0; double bebidapreco = 0;

        System.out.print("---------------------\n");
        System.out.println("MENU DE LANCHES");
        System.out.println(" [ 1 ] - CACHORRO QUENTE ");
        System.out.println(" [ 2 ] - X-SALADA ");
        System.out.println(" [ 3 ] - X-BACON ");
        System.out.println(" [ 4 ] - TORRADA SIMPLES ");

        System.out.print("---------------------\n");
        System.out.println("BEBIDAS");
        System.out.println(" [ 1 ] - REFRIGERANTE ");
        System.out.println(" [ 2 ] - SUCO ");
        System.out.println(" [ 3 ] - ÁGUA ");
        System.out.println(" [ 4 ] - CAFÉ C/ LEITE ");

        System.out.print("---------------------\n");
        System.out.println("INSIRA O CÓDIGO DE LANCHES: "); int codigo = sc.nextInt();
        System.out.println("INSIRA O CÓDIGO DE BEBIDA: "); int bebida = sc.nextInt();
        System.out.println("INFORME A QUANTIDADE DO PRODUTO: "); int quantidade = sc.nextInt();
        System.out.println("INFORME A QUANTIDADE DA BEBIDA: "); int quantbebida = sc.nextInt();

        switch ( codigo ){
            case 1 :
                preco = quantidade * 5.00; break;

            case 2 :
                preco = quantidade * 7.50; break;

            case 3 :
                preco = quantidade * 10.00; break;

            case 4 :
                preco = quantidade * 3.50; break;

            default :
                System.out.println("PRODUTO NÃO ENCONTRADO.");
        }

        switch ( bebida ) {
            case 1 :
                bebidapreco = quantbebida * 8.50; break;

            case 2 :
                bebidapreco = quantbebida * 6.50; break;

            case 3 :
                bebidapreco = quantbebida * 2.50; break;

            case 4 :
                bebidapreco = quantbebida * 9.00; break;

            default :
                System.out.println("PRODUTO NÃO ENCONTRADO");
        }

        double finalpreco = preco + bebidapreco;

        System.out.println("--------------------------------");
        System.out.println("CÓDIGO DO LANCHE: " + codigo + " || " + "CÓDIGO DA BEBIDA: " + bebida );
        System.out.println("QUANTIDADE DE LANCHE: " + quantidade + " || " + "QUANTIDADE DE BEBIDAS: " + quantbebida );
        System.out.printf("VALOR ( LANCHE ): R$%.2f ", preco); System.out.printf("|| " + "VALOR ( BEBIDA ) : R$%.2f\n", bebidapreco );
        System.out.printf("VALOR FINAL: R$%.2f", finalpreco );
    }
}