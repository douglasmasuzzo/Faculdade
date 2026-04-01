import java.util.Scanner;

public class EXE001 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int X = sc.nextInt();
        int numeros[] = new int[X];

        for ( int i = 0; i < numeros.length; i++ ) {
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Números Negativos: ");
        for ( int negativos : numeros) {
            if ( negativos < 0 ) {
                System.out.print(negativos);
            } else {
                System.out.print("");
            }
        }

        sc.close();
    }
}
