#include <iostream> 

void ordenarVetor( int vetor[], int tam ){
    int swap; 

    for ( int i = 0; i < tam - 1; i++ ){
        for ( int j = 0; j < tam - i - 1 ; j++ ){

            if ( vetor[ j ] > vetor[ j + 1 ] ){
                swap = vetor[ j ];
                vetor[ j ] = vetor[ j + 1 ];
                vetor[ j + 1 ] = swap;             
            }
        }
    }
}

int binario( int vetor[] , int tam, int valor ){
    int inferior = 0; int superior = tam - 1; 
    
    while ( inferior <= superior ){
        int meio = ( inferior + superior ) / 2 ; 

        if ( vetor[ meio ] == valor ){
            return meio; w
        } else if ( vetor[ meio ] < valor ){
            inferior = meio + 1;
        } else {
            superior = meio - 1;
        }
    }

    return -1;
} 

int main(){

    const int tam = 10; int valor; int pos; 
    int vetor[ tam ] = { 9, 4, 6, 3, 2, 0, 8, 1, 5, 7 };

    
    std :: cout << "VETOR ORIGINAL: " << std :: endl;
        for ( int i = 0; i < tam; i++ ){
            std :: cout << vetor[ i ] << " ";
        }
        
        ordenarVetor( vetor , tam );
        
    std :: cout << "\nVETOR ORDENADO: " << std :: endl;
        for ( int i = 0; i < tam; i++ ){
            std :: cout << vetor[ i ] << " " ;
        }
        
    std :: cout << "\nDIGITE O VALOR A SER BUSCADO: " << std :: endl; std :: cin >> valor;

        pos = binario( vetor, tam, valor );

        if ( pos != -1 ){
            std :: cout << "VALOR ENCONTRADO NA POSIÇÃO: " << pos << std :: endl;
        } else {
            std :: cout << "VALOR NÃO ENCONTRADO!" << std :: endl;
        }
        
    return 0;

}