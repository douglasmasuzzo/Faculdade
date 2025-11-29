#include <iostream>

float conversaoFarenheit( float farenheit ){ return ( ( farenheit * 32.0 ) * 5.0 / 9.0 ); }
float conversaoCelsius( float celsius ){ return ( ( celsius * 9.0 / 5.0 ) + 32.0 ); }

int main( int argc, char** agrv ){
    float temperaturaF = 0.0 ; float temperaturaC = 0.0 ; int opcao;

    std :: cout << "INFORME O VALOR DA TEMPERATURA: " << std :: endl;
    std :: cin >> temperaturaC;
    temperaturaF = temperaturaC;

    std :: cout << "ESCOLHA O NÍVEL DE CONVERSÃO: " << std :: endl;
    std :: cout << " [ 1 ] - CONVERTER Cº -> Fº " << std :: endl;
    std :: cout << " [ 2 ] - CONVERTER Fº -> Cº " << std :: endl;
    std :: cin >> opcao;

    switch ( opcao ){
        case 1 : 
            std :: cout << " TEMPERATURA EM CELSIUS ( Cº ) : " << conversaoCelsius( temperaturaF ) << "º" << std :: endl;
            break;
        case 2 :
            std :: cout << " TEMPERATURA EM FARENHEIT ( Fº ) : " << conversaoFarenheit( temperaturaC ) << "º" << std :: endl;
            break;
        default :
            std :: cout << " OPÇÃO INVÁLIDA! " << std :: endl; break;

    }
    return 0;
}

