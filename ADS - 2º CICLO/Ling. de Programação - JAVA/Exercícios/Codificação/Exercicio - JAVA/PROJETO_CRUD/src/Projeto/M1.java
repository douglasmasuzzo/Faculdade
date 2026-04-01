package Projeto;
import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- MENU ---");
        System.out.println("1. Criar produto");
        System.out.println("2. Listar produtos");
        System.out.println("3. Editar produto");
        System.out.println("4. Apagar produto");
        System.out.println("5. Buscar por ID");
        System.out.println("6. Calcular valor total");
        System.out.println("7. Sair");
        System.out.print("Escolha: ");
        int op = input.nextInt();

        switch (op) {
            case 1 -> A1.criar();
            case 2 -> A1.listar();
            case 3 -> A1.editar();
            case 4 -> A1.apagar();
            case 5 -> A1.buscar();
            case 6 -> A1.total();
            case 7 -> {
                System.out.println("Encerrando...");
                return;
            }
            default -> System.out.println("Opção inválida.");
        }

        menu();
    }
}