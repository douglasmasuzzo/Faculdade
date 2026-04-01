import java.util.Scanner;

public class EXE004 {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in );

        System.out.print("Quantos números serão digitados: ");
        int quant = sc.nextInt();
        int valores[] = new int[quant];
        int maiorValor = valores[0];
        int posicao = 0;

        for ( int i = 0; i < valores.length; i++ ) {
            System.out.print("Digite um valor: ");
            valores[i] = sc.nextInt();

            if ( i == 0 || valores[i] > maiorValor ) {
                maiorValor = valores[i];
                posicao = i;
            }
        }

        System.out.print("MAIOR VALOR: " + maiorValor + " || " + "POSIÇÃO: " + posicao);
        sc.close();
    }
}