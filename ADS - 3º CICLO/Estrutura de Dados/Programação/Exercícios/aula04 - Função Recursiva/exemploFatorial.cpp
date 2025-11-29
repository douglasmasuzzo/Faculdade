#include <iostream>

int Fatorial( int X ){ 
    
    if ( X <= 1 ) {
        return 1;
    } else {
        return X * Fatorial( X - 1 );
    }
    
}

int main( int argc, char** argv ){
    int numero;

    std :: cout << "INFORME O NÚMERO DO FATORIAL: " << std :: endl; std :: cin >> numero;
    
    std :: cout << "------------------------------------------------\n";
    std :: cout << "NÚMERO DEFINIDO: " << numero << std :: endl;
    std :: cout << "FATORIAL: " << Fatorial( numero ) << std :: endl; return 0;
}