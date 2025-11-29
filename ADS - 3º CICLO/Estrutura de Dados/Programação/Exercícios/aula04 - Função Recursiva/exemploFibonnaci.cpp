#include <iostream>

int Fibonnaci( int X ){

    if ( X < 0 ) {
        return -1;
    } else if ( X == 0 ){
        return 0;
    } else if ( X == 1 ) {
        return 1;
    } else {
        std :: cout << "INFORME UM VALOR VÁLIDO" << std :: endl;
    }

    int antes = 0 ; int atual = 1; int proximo = 0;
    
    for ( int i = 2 ; i <= X; ++i ){
        proximo = antes + atual; antes = atual; atual = proximo;
    }

    return proximo;
}

int main( int argc, char** argv[] ){
    int numero;

    std :: cout << "INFORME SOBRE O VALOR DA SEQUÊNCIA: " << std :: endl; std :: cin >> numero;

    if ( numero > 0 ){ std :: cout << "NÚMERO DA SEQUÊNCIA: " << Fibonnaci( numero ) << std :: endl; } else { std :: cout << "VALOR INVÁLIDO" << std :: endl; }
    return 0; 
}

