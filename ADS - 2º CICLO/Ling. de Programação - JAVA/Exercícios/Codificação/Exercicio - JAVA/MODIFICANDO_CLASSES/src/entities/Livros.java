package entities;
import java.util.Scanner;

public class Livros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        informacaoLivros tp = new informacaoLivros();

        System.out.print("Digite o título do livro: ");
        String livro = sc.nextLine();
        tp.setTitulo( livro );

        System.out.print("Informe o nome do autor: ");
        String autor = sc.nextLine();
        tp.setAutor( autor );

        System.out.print("Informe o ano: ");
        int ano = sc.nextInt();
        tp.setAnoPublicacao( ano );

        System.out.print("------------------------------\n");
        System.out.println("Livro: " + tp.getTitulo());
        System.out.println("Autor: " + tp.getAutor());
        System.out.print("Ano de Lançamento: " + tp.getAnoPublicacao());
    }
}