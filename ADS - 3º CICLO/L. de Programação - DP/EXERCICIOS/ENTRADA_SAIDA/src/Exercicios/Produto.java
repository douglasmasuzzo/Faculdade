package Exercicios;
import java.util.Scanner;

public class Produto {
    public static void main( String[] args ){
        Scanner sc = new Scanner ( System.in );

        System.out.println("1º PRIMEIRO PRODUTO");
        System.out.println("INSIRA O CÓDIGO: "); int codigo = sc.nextInt();
        System.out.println("INSIRA A QUANTIDADE: "); int quantidade = sc.nextInt();
        System.out.println("INSIRA O VALOR: "); double preco = sc.nextDouble();
        System.out.println("------------------------");
        System.out.println("2º PRIMEIRO PRODUTO");
        System.out.println("INSIRA O CÓDIGO: "); int codigo2 = sc.nextInt();
        System.out.println("INSIRA A QUANTIDADE: "); int quantidade2 = sc.nextInt();
        System.out.println("INSIRA O VALOR: "); double preco2 = sc.nextDouble();

        System.out.println("------------------------------");
        System.out.println("CÓDIGOS: 1º PRODUTO: " +  codigo + " | 2º PRODUTO: " + codigo2 );
        System.out.println("QUANTIDADES: 1º PRODUTO: " + quantidade + " | 2º PRODUTO: " + quantidade2 );
        System.out.println("VALOR: 1º PRODUTO: " + preco + " | 2º PRODUTO: " + preco2 );
        System.out.println("VALOR A PAGAR: " + ( ( quantidade * preco) + ( quantidade2 * preco2 ) ) );
        sc.close();
    }
}
