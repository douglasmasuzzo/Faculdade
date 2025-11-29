#include <iostream>

int soma( int A , int B ){ return A + B ; }

int raizQuadrada( int X ){
  return X * X;
}

int calcularRaiz( int A , int B ){ 
    return soma( raizQuadrada( A ), raizQuadrada( B ) );
}

int main( int argc, char** argv ){
    int X, Y;

    std :: cout << "Informe o valor do 1º número: " << std :: endl; std :: cin >> X;
    std :: cout << "Informe o valor do 2º número: " << std :: endl; std :: cin >> Y;
    
    std :: cout << "---------------------------" << std :: endl;
    std :: cout << "VALORES: " << X << " | " << Y << std :: endl;
    std :: cout << "SOMA: " << soma( X, Y ) << std :: endl;
    std :: cout << "RAIZ QUADRADA: " << raizQuadrada( X ) << std :: endl;
    std :: cout << "SOMA DAS RAIZES: " << calcularRaiz( X, Y ) << std :: endl;
    return 0;
} 