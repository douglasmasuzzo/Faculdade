#include <iostream>

void ordernarVetor( int vetor[], int tamanho ){
    for ( int i = 0; i < tamanho - 1; i++ ){
        for ( int j = 0; j < tamanho - i - 1; j++ ){
            if ( vetor[ j ] > vetor[ j + 1 ] ){
                std :: swap( vetor[ j ], vetor[ j + 1 ] );
            } 
        }
    }
}

int buscarBinario( int vetor[], int inferior, int superior, int valor ){

    if ( inferior > superior ){ return -1; }

    int meio = ( inferior + superior ) / 2 ;

    if ( vetor[ meio ] == valor ){
        return meio;
    } else if ( vetor[ meio ] < valor ){
        return buscarBinario( vetor, meio + 1, superior, valor );
    } else {
        return buscarBinario( vetor, inferior, meio - 1, valor );
    }

    return -1;
}

int main(){
    
    int posicao, valor;
    int tamanho = 10; int vetor[ tamanho ] = { 9, 4, 6, 3, 2, 0, 8, 1, 5, 7 };

    std :: cout << "VETOR ORIGINAL: " << std :: endl;
        for ( int i = 0; i < tamanho; i++ ){
            std :: cout << vetor[ i ] << " ";
        }
    ordernarVetor( vetor, tamanho );
    
    std :: cout << "\nVETOR ORDENADO: " << std :: endl;
        for ( int i = 0; i < tamanho; i++ ){
            std :: cout << vetor[ i ] << " ";
        }
    posicao = buscarBinario( vetor, 0, tamanho - 1, 4 );

    if ( posicao != -1 ){
        std :: cout << "\nVALOR ENCONTRADO NA POSICAO: " << posicao << std :: endl;
    } else { std :: cout << "\nVALOR NÃO ENCONTRADO." << std :: endl; }

    return 0;
}
