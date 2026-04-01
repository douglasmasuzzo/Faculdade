import java.util.*;

public class VerificarOrdem {

    public static boolean Ordenada(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirResultado(boolean ordenada) {
        if (ordenada) {
            System.out.println("A lista está em ordem.");
        } else {
            System.out.println("A lista não está em ordem.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite os números inteiros (digite -1 para encerrar):");
        int number;
        while ((number = sc.nextInt()) != -1) {
            numeros.add(number);
        }

        boolean resultado = Ordenada(numeros);
        imprimirResultado(resultado);
        sc.close();
    }
}
