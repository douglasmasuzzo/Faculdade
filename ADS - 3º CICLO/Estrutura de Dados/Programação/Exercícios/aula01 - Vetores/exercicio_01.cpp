#include <iostream>
#include <vector>

int main( int argc, char ** argv[] ){
    int vetor[ 10 ], leitura[ 10 ]; double vetorInverso = [ 10 ];

    std :: cout << "INFORME 10 VALORES: " << std :: endl;

    for ( int i = 0; i < 10; i++ ){
        std :: cout << " INFORME O VALOR DA POSIÇÃO " << i << " : ";
        std :: cin >> vetor[ i ];

        if ( vetor[ i ] <= 0 ){
            std :: cout << "NÚMERO NEGATIVO" << std :: endl;
        } else {
            std :: cout << "NÚMERO ZERO" << std :: endl;
        }

        break;
    }

    std :: cout << "----------------------------------------\n" << std :: endl;
    std :: cout << "VETOR ORIGINAL: " << std :: endl;

    for ( int i = 0; i < leitura; ++i ){
        std :: cout << "POSIÇÃO " << i << " : " << vetor[ i ] << std :: endl; 
    }

    std :: cout << "------------------------------\n" << std :: endl;
    std :: cout << "VETOR INVERSO: " << std :: endl;

    for ( int i = 0; i < leitura; ++i ){
        if ( vetor[ i ] == 0 ){
            std :: cout << "IMPOSSÍVEL CALCULAR" << std :: endl;
        } else {
            vetorInverso[ i ] = 1.0 / vetor[ i ];
            std :: cout << "O inverso de " << vetor[ i ] << " é: " << vetorInverso[ i ] << std :: endl;
        }
    }
    return 0;
}