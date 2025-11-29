#include <iostream>

int main ( int argc, char * argv[] ){

    double altura, base_menor, base_maior, area_trapezio;

    std :: cout << "INFORME OS VALORES: " << std :: endl;
    std :: cin >> altura >> base_maior >> base_menor;

    area_trapezio = ( 1.0 / 2.0 ) * ( base_maior * base_menor ) * altura;

    std :: cout << "ALTURA: " << altura << std :: endl;
    std :: cout << "BASE MAIOR: " << base_maior << std :: endl;
    std :: cout << "BASE MENOR: " << base_menor << std :: endl;
    std :: cout << "TRAPÉZIO: " << area_trapezio << std :: endl;

    return 0;
}