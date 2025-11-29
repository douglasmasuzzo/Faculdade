#include <iostream>

int main( int argc, char * argv[] ){

    int X;
    std :: cout << "INFORME UM VALOR: " << std :: endl;
    std :: cin >> X;
    X % 2 == 0 ? std :: cout << "PAR" : std :: cout << "ÍMPAR"; 

    return 0;
}