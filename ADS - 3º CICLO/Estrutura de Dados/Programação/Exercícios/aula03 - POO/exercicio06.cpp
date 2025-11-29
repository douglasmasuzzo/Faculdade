#include <iostream>

int fatorial( int numero ){
    int fatorial;

    if ( numero < 0 ) { return -1; }

    fatorial = 1;

    for ( int i = 1; i <= numero; i++ ){
        fatorial *= i;
    }

    return fatorial;
}

int main( int argc, char ** argv[] ){
    int valor; int resultado;

    std :: cout << "INFORME UM NÚMERO: " << std :: endl; std :: cin >> valor;

    resultado = fatorial( valor );

    std :: cout << "NÚMERO SELECIONADO: " << valor << std :: endl;
    std :: cout << "FATORIAL DE " << valor << " : " << fatorial( valor ) << std :: endl; return 0;
}