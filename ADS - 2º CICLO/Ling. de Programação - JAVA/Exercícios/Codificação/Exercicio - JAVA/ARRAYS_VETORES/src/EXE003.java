import java.util.Scanner;

public class EXE003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int par = 0;

        System.out.print("Quantos números serão calculados? ");
        int X = sc.nextInt();
        int num_Pares[] = new int[X];

        for ( int i = 0; i < num_Pares.length; i++ ) {
            System.out.print("Digite um número: ");
            num_Pares[i] = sc.nextInt();

            if ( num_Pares[i] % 2 == 0 ) {
                par++;
            }
        }

        System.out.print("NÚMEROS PARES: ");
        for ( int i = 0; i < num_Pares.length; i++ ) {
            if ( num_Pares[i] % 2 == 0 ) {
                System.out.println( num_Pares[i] + "" );
            }
        }

        System.out.print("QUANTIDADE DE NÚMEROS PARES: " + par);
        sc.close();
    }
}
