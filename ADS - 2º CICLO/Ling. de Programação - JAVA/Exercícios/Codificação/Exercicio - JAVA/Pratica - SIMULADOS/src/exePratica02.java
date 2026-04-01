import java.util.Scanner;

public class exePratica02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int X = sc.nextInt();

        if ( X % 2 == 0  ) {
            System.out.print("O número é: PAR");
        } else {
            System.out.print("O número é: ÍMPAR");
        }
    }
}
