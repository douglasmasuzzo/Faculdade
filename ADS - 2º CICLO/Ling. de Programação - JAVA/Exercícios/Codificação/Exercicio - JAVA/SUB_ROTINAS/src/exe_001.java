import java.util.Scanner;

public class exe_001 {
    public static void main(String[] args) {
        Scanner mediaInteiros = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor1 = mediaInteiros.nextInt();
        System.out.print("Digite outro valor: ");
        int valor2 = mediaInteiros.nextInt();

        int mediaFinal = calcularMedia(valor1, valor2);
        int soma = valor1 + valor2;

        System.out.println("A soma dos valores é de: " + (valor1 + valor2));
        System.out.print("A média entre os valores somados é de: " + mediaFinal);

        mediaInteiros.close();
    }
    public static int calcularMedia(int v1, int v2 ){
        return (v1 + v2) / 2;
    }
}
