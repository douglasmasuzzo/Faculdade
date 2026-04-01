import java.util.Scanner;

public class PROJETO_VETORES {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int notas[] = new int[5];

        for ( int i = 0; i < notas.length; i++ ) {
            System.out.println("Digite a nota " + ( i + 1 ) + ": ");
            notas[i] = sc.nextInt();
        }

        System.out.println("Notas digitadas: ");
            for ( int nota : notas ) {  // a variável " nota " apresentará os valores de notas junto ao array
                System.out.println(nota);
            }

        sc.close();
    }
}
