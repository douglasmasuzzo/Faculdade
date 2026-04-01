import java.util.Scanner;

public class EXE002 {
   public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       double soma = 0;
       double media;

       System.out.print("Quantos números serão digitados: ");
       int X = sc.nextInt();
       double valores[] = new double[X];

        for ( int i = 0; i < valores.length; i++ ) {
            System.out.print("Digite um número: ");
            valores[i] = sc.nextDouble();
            soma += valores[i];
        }

        System.out.println("VALORES DIGITADOS : ");
        for ( double valor : valores ) {
            System.out.printf("%.2f\n", valor);
        }

        media = soma / X;
        System.out.printf("SOMA DOS VALORES: %.2f\n", soma);
        System.out.printf("MÉDIA DOS VALORES: %.2f\n", media);
        sc.close();
   }
}
