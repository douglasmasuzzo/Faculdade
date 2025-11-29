#include <iostream>
#include <string>

class Estacionamento{
    public :

    int dia;
    std :: string diaSemana[ 7 ] = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };
    double horaEntrada;
    double horaSaida;

    void scanner(){
        std :: cout << "DIGITE O DIA DA SEMANA: "; std :: cin >> dia;
        if ( dia < 1 || dia > 7 ){ s
            std :: cout << "DIA INVÁLIDO" << std :: endl;
        }
        
        std :: cout << "DIGITE A HORA DE ENTRADA: "; std :: cin >> horaEntrada;
        std :: cout << "DIGITE A HORA DE SAÍDA: "; std :: cin >> horaSaida;

        while ( horaEntrada < 0 || horaEntrada > 23.59 || horaSaida < 0 || horaSaida > 23.59 ){
            std :: cout << "HORA INVÁLIDA" << std :: endl;
            std :: cout << "HORA DE ENTRADA: "; std :: cin >> horaEntrada;
            std :: cout << "HORA DE SAÍDA: "; std :: cin >> horaSaida;
        }
    }

    
    double calcularValor(){
        double valorTotal = 0; double valorHora = 5.00;

        if ( dia < 1 || dia > 7 ){
            std :: cout << "DIA INVÁLIDO" << std :: endl; return 0;
        } 

        if ( horaSaida < horaEntrada ){
            horaSaida = horaSaida + 24;
        }

        double horaEstacionada = horaSaida - horaEntrada; 

        if ( dia >= 1 && dia <= 7 ){
            valorTotal = horaEstacionada * valorHora;
        } else {
            std :: cout << "VALOR NÃO CALCULADO" << std :: endl;
        }

        return valorTotal;
    }
};

int main(){
    Estacionamento est;

    est.scanner();
    std :: cout << "--------------------------------" << std :: endl;

    if ( est.dia >= 1 && est.dia <= 7 ){
        std :: cout << "DIA DA SEMANA: " << est.diaSemana[ est.dia - 1 ] << std :: endl;
    } else {
        std :: cout << "DIA INVÁLIDO" << std :: endl;
    }

    std :: cout << "HORA DE ENTRADA: " << est.horaEntrada << std :: endl;
    std :: cout << "HORA DE SAÍDA: " << est.horaSaida << std :: endl;
    std :: cout << "VALOR TOTAL: R$ " << est.calcularValor() << std :: endl;
    return 0;

}