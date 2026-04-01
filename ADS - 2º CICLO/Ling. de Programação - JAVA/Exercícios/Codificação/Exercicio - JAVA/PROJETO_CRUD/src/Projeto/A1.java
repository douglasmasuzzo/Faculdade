package Projeto;
import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
    public int id;
    public String name;
    public String especify;
    public double valor;

    static ArrayList<A1> lista = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public A1(int i, String n, String e, double v) {
        id = i;
        name = n;
        especify = e;
        valor = v;
    }

    @Override
    public String toString() {
       return "ID: " + id + "\nNome: " + name + "\nTipo: " + especify + "\nR$" + valor;
    }

    public static void criar() {
        System.out.print("ID: ");
        int i = input.nextInt(); input.nextLine();
        System.out.print("Nome: ");
        String n = input.nextLine();
        System.out.print("Especificação: ");
        String e = input.nextLine();
        System.out.print("Valor: ");
        double v = input.nextDouble();

        lista.add(new A1(i, n, e, v));
        System.out.println("Produto criado.");
    }

    public static void listar() {
        if (lista.isEmpty()) System.out.println("Nenhum produto.");
        else for (A1 p : lista) System.out.println(p);
    }

    public static void editar() {
        System.out.print("ID do produto a editar: ");
        int busca = input.nextInt(); input.nextLine();
        for (A1 p : lista) {
            if (p.id == busca) {
                System.out.print("Novo nome: ");
                p.name = input.nextLine();
                System.out.print("Nova especificação: ");
                p.especify = input.nextLine();
                System.out.print("Novo valor: ");
                p.valor = input.nextDouble();
                System.out.println("Produto atualizado.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void apagar() {
        System.out.print("ID do produto a apagar: ");
        int busca = input.nextInt();
        boolean removido = lista.removeIf(p -> p.id == busca);
        System.out.println(removido ? "Produto removido." : "Produto não encontrado.");
    }

    public static void buscar() {
        System.out.print("ID do produto: ");
        int busca = input.nextInt();
        for (A1 p : lista) {
            if (p.id == busca) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void total() {
        double soma = 0;
        for (A1 p : lista) soma += p.valor;
        System.out.println("Valor total: R$" + soma);
    }
}