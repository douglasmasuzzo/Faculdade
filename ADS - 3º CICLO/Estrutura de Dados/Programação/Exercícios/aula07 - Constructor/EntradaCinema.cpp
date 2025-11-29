// classe Cinema
// atributos -> int diaFilme | int sala | float hora / valor 
// métodos -> calcularDesconto( int nascimento ) | calcularDescontoHorário( ) | toString()

#include <iostream> 
#include <string>

class Data{
    public :

    int dia , mes , ano;

    Data(){}
    Data( int d , int m , int a ){
        dia = d;
        mes = m;
        ano = a;
    }

    void DataNascimento(){
        std :: cout << "-------------------------------------\n"
        std :: cout << "DATA DE NASCIMENTO: " << dia << " / " << mes << " / " << ano << std :: endl;
    }
};

class Cinema{
    public :

    int idade;
    int dia, sala;
    int hora, minuto;
    float valor;

    Cinema(){}
    Cinema( int data , int lugar , int horario , int min , float preco ){
        dia = data;
        sala = lugar;
        hora = horario;
        minuto = min;
        valor = preco;
    }

    double calcularDesconto( Data nascimento ){
        idade = 2025 - nascimento.ano;        
        
        if ( idade <= 12 ){
            return valor * 0.5;
        } else {
            return valor;
        }
    }

    double descontoCarteira( Data nascimento ){
        idade = 2025 - nascimento.ano;

        if ( idade >= 12 && idade < 15 ) {
            return valor * 0.6;
        } else if ( idade >= 16 && idade < 20 ){ 
            return valor * 0.7;
        } else {
            return valor * 0.8;
        }
    }

    double calcularDescontoHora( double valorDesconto ){
        int horaFinal = hora * 60 + minuto;
        
        if ( horaFinal < 960 ){
            return valorDesconto * 0.9;
        } else {
            return valorDesconto;
        }
    }

    void toString(){
        std :: cout << "------------------------------------\n";
        std :: cout << "INGRESSO: " << std :: endl;
        std :: cout << "DIA : " << dia << std :: endl;
        std :: cout << "SALA: " << sala << std :: endl;
        std :: cout << "HORÁRIO: " << hora << " : " << minuto << std :: endl;
        std :: cout << "VALOR ORIGINAL: " << valor << std :: endl; 
    }

};

int main(){
    Data nascimento(10, 10, 2004);
    Cinema ingresso(15, 5, 18, 30, 45.00);

    nascimento.DataNascimento();
    ingresso.toString();

    double valorDesconto = ingresso.descontoCarteira( nascimento );
    double valorFinal = ingresso.calcularDescontoHora( valorDesconto );
    std :: cout << "VALOR FINAL DO INGRESSO: " << valorFinal << std :: endl;
    return 0;
}