#include <iostream>

int main ( int argc, char * argv[] ) {
    
    double area_triangulo, altura, base; // ex: 2.5 | 5.0 | 10.5 

    std :: cout << "INFORME OS VALORES: " << std :: endl;
    std :: cin >> altura >> base;

    area_triangulo = ( 1.0 / 2.0 ) * base * altura;

    std :: cout << "BASE: " << base << std :: endl;
    std :: cout << "ALTURA: " << altura << std :: endl;
    std :: cout << "ÁREA DO TRIÂNGULO: " << area_triangulo << std :: endl;

    return 0;
}