#include <iostream>
#include <string>

int DiaSemana( int dia , int mes , int ano ){
    int A = ano % 100;
    int B = ano / 100;
    int C = ( dia + ( 13 * ( mes + 1 ) ) / 5 + A + ( A/4 ) + ( B/4 ) + ( 5 * B ) ) % 7;
    int D = ( ( C + 6 ) % 7 );

    if ( mes < 3 ){
        mes += 12;
        ano--;
    }

    return D;
}

int main(){

    int dia, mes, ano;

    std :: string diaSemana[ 7 ] = { "Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado" };

    std :: cout << "INFORME O DIA: "; std :: cin >> dia;
    std :: cout << "INFORME O MÊS: "; std :: cin >> mes;
    std :: cout << "INFORME O ANO: "; std :: cin >> ano; 

    std :: cout << "------------------------" << std :: endl;
    std :: cout << "DIA DA SEMANA: " << diaSemana[ DiaSemana( dia , mes , ano ) ] << std :: endl;
    return 0;
}