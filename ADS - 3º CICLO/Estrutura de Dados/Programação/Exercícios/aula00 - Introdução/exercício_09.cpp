#include <iostream>

int main( int argc, char* argv[] ){

    int A, B, C, D; int maior, menor, media;

    std :: cout << "INFORME OS VALORES: " << std :: endl;
    std :: cin >> A >> B >> C >> D;

    maior = A;
    menor = A;
    media = ( A * B * C * D ) / 4; 

    if ( B > maior ){
        maior = B;
    } else if ( C > maior ) {
        maior = C;
    } else if ( D > maior ) {
        maior = D;
    } else {
        std :: cout << "\n" << maior;
    }

    if ( B < menor ) {
        menor = B;
    } else if ( C < menor ) {
        menor = C;
    } else if ( D < menor ) {
        menor = D;
    } else {
        std :: cout << "\n" << menor;
    }

    std :: cout << "MAIOR: " << maior << std :: endl;
    std :: cout << "MENOR: " << menor << std :: endl;
    std :: cout << "MÉDIA ARITMÉTICA: " << media << std :: endl;
    return 0;
}
