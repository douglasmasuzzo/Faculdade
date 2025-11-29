/*
 O ArrayList implementa a interface " List " e fornece um array redimensionável,
 o que significa que ele pode crescer ou encolher conforme os elementos são adicionados
 ou removidos.

 Características Principais do ArrayList

  -> Dinamismo
   + diferentemente do array tradicional, não possui um valor fixo

  -> Ordem de Inserção
   + mantém a ordem em que os elementos são inseridos

  -> Permite Duplicadas
   + é possível adicionar o mesmo objeto várias vezes

  -> Acesso Rápido
   + o acesso a um elemento por índice é eficiente

  -> Genéricos
   + possui garantia de segurança dependente do tipo de variável
*/

package Projeto_Crud;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUD {

    static ArrayList<CRUD> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public int ID;
    public String produto;
    public int quantidade;
    public double preco;

    public CRUD(int ID, String produto, int quantidade, double preco) {
        this.ID = ID;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ID : " + ID + " | NOME : " + produto + " | PREÇO : " + preco;
    }

    public static void CriarProduto() {
        System.out.println("INFORME O ID : "); int ID = sc.nextInt(); sc.nextLine();
        System.out.println("INFORME O PRODUTO : "); String produto = sc.nextLine();
        System.out.println("INFORME A QUANTIDADE DO PRODUTO : "); int quantidade = sc.nextInt();
        System.out.println("INFORME O VALOR : "); double preco = sc.nextDouble();

        lista.add( new CRUD(ID, produto, quantidade , preco) );
        System.out.println("PRODUTO CADASTRADO");
    }

    public static void ListarProduto() {
        if (lista.isEmpty()) {
            System.out.println("NENHUM PRODUTO CADASTRADO");
        } else {
            for (CRUD crud : lista) {
                System.out.println(crud);
            }
        }
    }

    public static void EditarProduto() {
        System.out.println("SELECIONE O ID PARA EDITAR AS INFORMAÇÕES: ");
        int idEditar = sc.nextInt();

        for (CRUD crud : lista) {
            if (crud.ID == idEditar) {
                System.out.println("INFORME UM NOVO NOME: ");
                crud.produto = sc.nextLine();
                System.out.println("INFORME O NOVO VALOR : ");
                crud.preco = sc.nextDouble();
                System.out.println("INFORMAÇÕES ATUALIZADAS");
                return;
            }
            System.out.println("PRODUTO NÃO LOCALIZADO");
        }
    }

    public static void ExcluirProduto() {
        System.out.println("INFORME O ID DO PRODUTO : ");
        int idProduto = sc.nextInt();

        for (int i = lista.size() - 1; i >= 0; i--) {
            CRUD crud = lista.get(i);
            if (crud.ID == idProduto) {
                lista.remove(i);
                System.out.println("PRODUTO REMOVIDO");
            } else {
                System.out.println("PRODUTO NÃO ENCONTRADO");
            }
        }
    }

    public static void ProcurarProduto() {
        System.out.println("INFORME O ID DO PRODUTO : ");
        int idBusca = sc.nextInt();

        for (CRUD crud : lista) {
            if (crud.ID == idBusca) {
                System.out.println("PRODUTO ENCONTRADO : " + crud);
            }
        }
    }

    public static void CalcularProduto(){
        double soma = 0;
        for ( CRUD crud : lista ){ soma += crud.preco * crud.quantidade; }
        System.out.printf("VALOR TOTAL %.2f%n", soma );
    }
}
