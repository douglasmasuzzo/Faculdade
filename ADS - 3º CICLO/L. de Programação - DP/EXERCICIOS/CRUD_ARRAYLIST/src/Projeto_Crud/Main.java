package Projeto_Crud;
import java.util.Scanner;

public class Main{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("SELECIONE UMA AÇÃO : ");
            System.out.println(" [ 1 ] - CADASTRAR PRODUTO ");
            System.out.println(" [ 2 ] - LISTAR PRODUTOS ");
            System.out.println(" [ 3 ] - ATUALIZAR PRODUTOS ");
            System.out.println(" [ 4 ] - EXCLUIR PRODUTOS ");
            System.out.println(" [ 5 ] - PROCURAR PRODUTOS ");
            System.out.println(" [ 6 ] - CALCULAR TOTAL DO ESTOQUE ");
            System.out.println(" [ 7 ] - FINALIZAR OPERAÇÃO ");
            opcao = sc.nextInt(); sc.nextLine();

            switch (opcao) {
                case 1:
                    CRUD.CriarProduto();
                    break;

                case 2:
                    CRUD.ListarProduto();
                    break;

                case 3:
                    CRUD.EditarProduto();
                    break;

                case 4:
                    CRUD.ExcluirProduto();
                    break;

                case 5:
                    CRUD.ProcurarProduto();
                    break;

                case 6:
                    CRUD.CalcularProduto();
                    break;

                case 7:
                    System.out.println("FINALIZANDO"); break;

                default :
                    System.out.println("OPÇÃO INVÁLIDA"); break;
            }
        } while ( opcao != 7 );
    }
}