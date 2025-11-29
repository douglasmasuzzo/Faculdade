#include <iostream>

int numeroPrimo( int number ){
    if ( number <= 1 ) { return 0; }
    for ( int i = 2; i < number ; i++ ){
        if ( number % 1 == 0 ) { std :: cout << "NÚMERO PRIMO"; return 0; } else { std :: cout << "NÚMERO NÃO É PRIMO"; return 1; }
    }
}

int main( int argc, char** argv) {
    int number;
    std :: cout << "DIGITE UM NÚMERO: " << std :: endl;
    std :: cin >> number;
    numeroPrimo( number ); return 0; 
}