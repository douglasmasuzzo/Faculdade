#include <iostream>
#include <cmath>

int main(){
    int A; int B; int C; int delta; int X; int Y;

    std :: cout << "Digite 3 valores: " << std :: endl;
    std :: cin >> A >> B >> C;

    std :: cout << "Fazendo a operação..";
    delta = ( B * B ) - 4 * A * C;
    // X = ( - B ) + delta / 2 * A;
    // Y = ( - B ) - delta / 2 * A;

    if ( delta >= 0 ) {
        X = ( - B + sqrt( delta ) ) / 2 * A;
        Y = ( - B - sqrt( delta ) ) / 2 * A;

        std :: cout << "--------------------------" << std :: endl;
        std :: cout << "DELTA: " << delta << std :: endl;
        std :: cout << "RAÍZ X¹: " << X << std :: endl;
        std :: cout << "RAÍZ X²: " << Y << std :: endl;
    } else {
        std :: cout << "- " << delta << " NÃO EXISTE" << std :: endl;
        std :: cout << "Finalizando operação..";
    }
    return 0;
}