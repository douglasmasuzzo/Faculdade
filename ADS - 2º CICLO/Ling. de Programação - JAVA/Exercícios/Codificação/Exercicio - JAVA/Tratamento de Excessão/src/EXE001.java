import java.util.Scanner;
public class EXE001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int X = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int Y = sc.nextInt();
        int divisao = 0;

        try {
            divisao = X / Y;
        } catch ( ArithmeticException ex) {
            System.out.print("Não é divisível por 0");
        }

        if ( divisao == 0 ) {
        } else {
            System.out.print(divisao);
        }
        sc.close();
    }
}