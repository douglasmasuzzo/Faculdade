#include <iostream>

int main( int argc, char* argv[] ){
    int X; 
    std :: cout << "INFORME O ANO DE NASCIMENTO: " << std :: endl;
    std :: cin >> X;
    std :: cout << ( ( X % 4 == 0 && X % 100 != 0 ) || ( X % 400 == 0 ) ? " NASCEU EM UM ANO-BISSEXTO " : " NÃO NASCEU EM UM ANO-BISSEXTO " ) << std :: endl ; 
    return 0;
}