package Exercicios;
import java.util.Scanner;

public class Livro {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        InformacaoLivro livro = new InformacaoLivro( "ABC", "def", 1999 );

        System.out.println("INFORME O TÍTULO DO LIVRO: ");
        String titulo = sc.nextLine(); livro.setTitulo( titulo );

        System.out.println("INFORME O AUTOR DA OBRA: ");
        String autor = sc.nextLine(); livro.setAutor( autor );

        System.out.println("INFORME O ANO DE PUBLICAÇÃO: ");
        int ano = sc.nextInt(); livro.setPublicacao( ano );

        System.out.println("--------------------------------");

        livro.ExibirLivro();
        sc.close();
    }
}
