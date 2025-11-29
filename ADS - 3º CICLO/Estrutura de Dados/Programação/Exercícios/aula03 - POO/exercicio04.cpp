#include <iostream>

int anoBissexto( int ano ) {
    if ( ( ano % 4 == 0 || ano % 400 == 0 ) &&  ( ano % 100 != 0 ) ) {
        std :: cout << " ANO BISSEXTO " << std :: endl; return 1;
    } else {
        std :: cout << " ANO NÃO BISSEXTO " << std :: endl; return 0;
    }
}

int main( int argc, char** argv ) {
    int ano;
    std :: cout << " DIGITE UM ANO: " << std :: endl;
    std :: cin >> ano;
    anoBissexto ( ano );
    return 0;
}