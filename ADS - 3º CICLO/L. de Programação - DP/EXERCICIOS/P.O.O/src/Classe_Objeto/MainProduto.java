package Classe_Objeto;
import java.util.Scanner;

public class MainProduto {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        Produto produto = new Produto();

        System.out.println("INFORME O NOME DO PRODUTO: ");
        produto.nomeProduto = sc.nextLine();
        System.out.println("INFORME A QUANTIDADE: ");
        produto.quantidade = sc.nextInt();
        System.out.println("INFORME O PREÇO: ");
        produto.preco = sc.nextDouble();

        System.out.println("------------------------");
        produto.ExibirInformacoes();
        sc.close();
    }
}
