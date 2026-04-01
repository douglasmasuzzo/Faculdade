import java.util.Scanner;

public class exe_002 {

    public static double calcularMedia( double soma, int quantidade ) {
        return soma / quantidade;
    }

    public static void main(String[] args) {
        Scanner mediaNumeros = new Scanner (System.in);
        double soma = 0;

        System.out.print("Escolhe o número ( 2 - 5 ): ");
        int quantidade = mediaNumeros.nextInt();

        while ( quantidade < 2 || quantidade > 5 ) {
            quantidade = mediaNumeros.nextInt();
        }
        for ( int i = 0; i < quantidade; i++ ) {
            System.out.print("Número: " + (i + 1) + ": ");
            soma += mediaNumeros.nextInt();
        }

        System.out.printf("Média: %.2f", calcularMedia(soma, quantidade));
        mediaNumeros.close();
    }
}