package projeto;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Menu();
    }

    public static void Menu(){

        Scanner input = new Scanner( System.in );
        System.out.prinln("\n---- MENU -----");
        System.out.println(" [ 1 ] - Criar Produto");
        System.out.println(" [ 2 ] - Listar Produto");
        System.out.println(" [ 3 ] - Editar Produto");
        System.out.println(" [ 4 ] - Apagar Produto");
        System.out.println(" [ 5 ] - Buscar ID do produto");
        System.out.println(" [ 6 ] - Calcular valor total");
        System.out.println(" [ 7 ] - Finalizar");
        int option = input.nextInt();

        switch( option ) {
            case 1 : A1.Criar();
            case 2 : A1.Listar();
            case 3 : A1.Editar();
            case 4 : A1.Apagar();
            case 5 : A1.Buscar();
            case 6 : A1.PesquisarTotal();
            case 7 : System.out.println("Encerrando.."); return;
            default : System.out.println("Opção Inválida");
        }

        Menu();
    }
}