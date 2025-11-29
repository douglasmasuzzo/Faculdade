#include <iostream>

int main( int argc, char* argv[] ){

    int altura; int base; int area;

    std :: cout << "Informe um valor: " << std :: endl;
    std :: cin >> altura >> base;

    area = base * altura;

    std :: cout << "ALTURA: " << altura << std :: endl;
    std :: cout << "BASE: " << base << std :: endl;
    std :: cout << "ÁREA: : " << area << std :: endl;

    return 0;
}