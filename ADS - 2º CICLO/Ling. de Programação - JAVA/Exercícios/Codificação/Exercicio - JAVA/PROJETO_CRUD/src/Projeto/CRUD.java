package Projeto;
import java.util.Scanner;
import java.util.ArrayList;

public class CRUD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <String> produtos = new ArrayList<>();

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("[ 1 ] - Criar produtos");
            System.out.println("[ 2 ] - Listar produtos");
            System.out.println("[ 3 ] - Atualizar produtos");
            System.out.println("[ 4 ] - Excluir produto");
            System.out.print("[ 5 ] - SAIR");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("");
                    String produto = sc.nextLine();
                    produtos.add(produto);
                    System.out.print("Adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("");
                    if (produtos.isEmpty()) {
                        System.out.print("Nenhum produto cadastrado.");
                    } else {
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.print(i + " - " + produtos.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Atualize o índice do produto: ");
                    int indiceAtualizar = sc.nextInt();
                    sc.nextLine();

                    if (indiceAtualizar >= 0 && indiceAtualizar < produtos.size()) {
                        System.out.print("Informe o nome do produto: ");
                        produtos.set(indiceAtualizar, sc.nextLine());
                        System.out.print("Produtos Atualizado.");
                    } else {
                        System.out.print("Índice Inválido");
                    }
                    break;

                case 4:
                    System.out.print("Digite o produto que será excluído: ");
                    int indiceExcluir = sc.nextInt();
                    sc.nextLine();

                    if (indiceExcluir >= 0 && indiceExcluir < produtos.size()) {
                        produtos.remove(indiceExcluir);
                        System.out.print("Produto Removido.");
                    } else {
                        System.out.print("Índice Inválido");
                    }
                    break;

                case 5:
                    System.out.print("Finalizando o programa");

                default:
                    System.out.print("Opção Inválida. Tente novamente.");
            }
        } while (true);
    }
}
