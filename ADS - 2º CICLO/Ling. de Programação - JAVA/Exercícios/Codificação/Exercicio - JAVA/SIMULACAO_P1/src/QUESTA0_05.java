import java.util.Scanner;

public class QUESTA0_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira um número: ");
        int X = sc.nextInt();

        if ( X > 0 ) {
            System.out.print("O número é: POSITIVO");
        } else {
            System.out.print("O número é: NEGATIVO");
        }

        sc.close();
    }
}