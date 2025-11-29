package Estrutura_Dados;

public class OrdenarVetor {
    public static void ordernar( int vetor[] ){
        for ( int i = 0; i < vetor.length; i++ ){
            for ( int j = 0; j < vetor.length - i - 1; j++ ){

                if ( vetor[ j ] > vetor[ j + 1 ] ){
                    int substituir = vetor[ j ];
                    vetor[ j ] = vetor[ j + 1 ];
                    vetor[ j + 1 ] = substituir;
                }
            }
        }
    }
}