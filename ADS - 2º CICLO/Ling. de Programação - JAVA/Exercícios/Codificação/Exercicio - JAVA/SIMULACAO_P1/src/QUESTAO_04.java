import java.util.Scanner;

public class QUESTAO_04 {
    public static void main(String[] args){
        Scanner fatorial = new Scanner (System.in);

        System.out.print("Digite um número: ");
        int X = fatorial.nextInt();

        if ( X < 0 ) {
            System.out.print("Não existe fatorial com números negativos.");
        } else {
            long fatorar = 1;
                for ( int i = 1; i <= X; i++ ) {
                    fatorar *= i;
                    System.out.print(i);
                        if ( i >= 1 ) {
                            System.out.print( " x " );
                        }
                }

            System.out.print("= " + fatorar);
        }
        fatorial.close();
    }
}
