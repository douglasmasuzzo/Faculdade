package Estrutura_Dados;

public class Binaria {
    public static int BuscarBinaria( int vetor[], int valor ){
        int inferior = 0 ; int superior = vetor.length - 1; int meio;

        while ( inferior <= superior ){
            meio = ( inferior + superior ) / 2;

            if ( vetor[ meio ] == valor ) {
                return meio;
            } else if ( vetor[ meio ] < valor ){
                inferior = meio + 1;
            } else {
                superior = meio - 1;
            }
        }
        return -1;
    }
}
