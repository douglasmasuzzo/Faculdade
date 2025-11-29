package Estrutura_Dados;
import java.util.Scanner; import java.util.Arrays;

public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = {9, 4, 2, 7, 6, 0, 1, 8, 3, 5};

        System.out.println("VETOR ORIGINAL: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\n[ ALGORITMO DE ORDENAÇÃO - BUBBLE SORT ] ");
        OrdenarVetor.ordernar(vetor);

        System.out.print("\nVETOR ORDENADO: ");
        for (int i = 0; i < vetor.length; i++ ) {
            System.out.print( vetor[ i ] + " " ) ;
        }

        System.out.print("\nINFORME A POSIÇÃO DO ELEMENTO: "); int valor = sc.nextInt();
        int posicao = Binaria.BuscarBinaria( vetor , valor );

        if ( posicao != -1 ){
            System.out.println("POSIÇÃO: " + posicao );
        } else {
            System.out.println("VALOR NÃO ENCONTRADO");
        }

        sc.close();
    }
}
