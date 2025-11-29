#include <iostream>

int main( int argc, char* argv[] ){

    int X;
    std :: cout << "INFORME UM VALOR: " << std :: endl;
    std :: cin >> X;   
    
    if ( X > 0 && X <= 12 ) {
        std :: cout << "CRIANÇA"; 
    } else if ( X > 13 && X <= 17 ) {
        std :: cout << "ADOLESCENTE";
    } else if ( X > 18 && X <= 49 ){
        std :: cout << "ADULTO(A)";
    } else {
        std :: cout << "IDOSO(A)";
    }
    return 0;
}