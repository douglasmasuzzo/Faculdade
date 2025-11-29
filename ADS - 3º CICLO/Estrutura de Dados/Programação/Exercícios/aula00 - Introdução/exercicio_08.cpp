#include <iostream>

int main( int argc, char* argv[] ){

    int A, B, C; 

    std :: cout << "INFORME UM VALOR: " << std :: endl;
    std :: cin >> A >> B >> C;

    if ( A == B && B == C ) { 
        std :: cout << "TRIÂNGULO EQUILÁTERO" << std :: endl;
    } else if ( A == B || B == C || C == A ) {
        std :: cout << "TRIÂNGULO ISÓCELES" << std :: endl;
    } else {
        std :: cout << "TRIÂNGULO ESCALENO" << std :: endl;
    }

    return 0;
}