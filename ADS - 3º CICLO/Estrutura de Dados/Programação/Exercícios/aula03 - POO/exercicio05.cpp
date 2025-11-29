#include <iostream>

double somar( double A, double B ){ return A + B; }
double subtrair( double A, double B ){ return A - B; }
double multiplicar( double A, double B ) { return A * B; }
double dividir( double A, double B ){
    if ( B != 0 ) {
        return A / B;
    } else {
        std :: cout << "INDIVISÍVEL POR ZERO" << std :: endl;
    }
}

int main( int argc, char ** argv[] ){
    double A, B; int opcao;

    std :: cout << "DIGITE DOIS VALORES: " << std :: endl; std :: cin >> A >> B;
    std :: cout << "ESCOLHA UMA OPERAÇÃO" << std :: endl;
    std :: cout << " [ 1 ] SOMAR" << std :: endl;
    std :: cout << " [ 2 ] SUBTRAIR" << std :: endl;
    std :: cout << " [ 3 ] MULTIPLICAR" << std :: endl;
    std :: cout << " [ 4 ] DIVIDIR" << std :: endl;
    std :: cin >> opcao;
    
    switch( opcao ){
        case 1 : 
            std :: cout << "SOMA: " << somar( A, B ) << std :: endl; break;

        case 2 :
            std :: cout << "SUBTRAÇÃO: " << subtrair( A, B ) << std :: endl; break;

        case 3 :
            std :: cout << "MULTIPLICAÇÃO: " << multiplicar( A, B ) << std :: endl; break;

        case 4 :
            std :: cout << "DIVISÃO: " << dividir( A, B ) << std :: endl; break;

        default :
            std :: cout <<  "OPÇÃO INVÁLIDA\n" << "FIM DO PROGRAMA" << std :: endl;
    }
    return 0;
}