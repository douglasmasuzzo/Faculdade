#include <iostream>
#include <string>

// DIAGRAMA UML
// class Conta
// + nome | id | saldo | limite
// Conta ( ~ -> protegido ) 
// + sacar() | + depositar() | + trasferir()

class Conta{
    public :
    
    std :: string nome; int numero; double saldo; double limite;
    
    Conta(){}
    Conta( std :: string nomeFuncionario, int id, double salario, double limiteSalario ){
        nome = nomeFuncionario;
        numero = id;
        saldo = salario;
        this->limite = limiteSalario;
    }

    bool Sacar( double valor ){
        if ( valor > 0 && valor <= saldo ){
            saldo = saldo - valor; 
            return true;
        } else {
            return false;
        }
    }

    void Depositar( double valor ){
        if ( valor > 0 ){
            saldo += valor;
        } 
    }

    bool Transferir( Conta &destino, double valor ){
            if ( Sacar( valor ) ){
            destino.Depositar( valor );
            return true;
        } else {
            return false;
        }
    }
};

int main(){

    Conta conta1;
    Conta conta2("FULANO", 1 , 4500.0, 2800.0 );
    int opcao; double valor;

    std :: cout << "INFORME O NOME DO USUÁRIO: "; std :: cin >> conta1.nome;
    std :: cout << "INFORME O NÚMERO DE IDENTIFICAÇÃO: "; std :: cin >> conta1.numero; 
    std :: cout << "INFORME O SALÁRIO: "; std :: cin >> conta1.saldo; 
    std :: cout << "INFORME O LIMITE: \n"; std :: cin >> conta1.limite;

    std :: cout << "-------------------------------\n";
    std :: cout << " SELECIONE A OPÇÃO DISPONÍVEL " << std :: endl;
    std :: cout << " [ 1 ] - SACAR SALÁRIO " << std :: endl;
    std :: cout << " [ 2 ] - DEPOSITAR SALÁRIO " << std :: endl;
    std :: cout << " [ 3 ] - TRANSFERIR VALORES " << std :: endl;
    std :: cin >> opcao;
    
    switch( opcao ){

        case 1 :
            std :: cout << "VALOR DO SAQUE: "; std :: cin >> valor;

            if ( conta1.Sacar( valor ) ) {
                std :: cout << "SAQUE DISPONÍVEL" << std :: endl;
            } else {
                std :: cout << "SAQUE INDISPONÍVEL" << std :: endl;
            }

            break;

        case 2 :
            std :: cout << "VALOR DO DEPÓSITO: "; std :: cin >> valor; 
            conta1.Depositar( valor );
            break;

        case 3 :
            std :: cout << "VALOR DE TRANSFERÊNCIA: "; std :: cin >> valor; 
            
            if ( conta1.Transferir( conta2, 5000.0) ){
                std :: cout << "TRANSFERÊNCIA REALIZADA" << std :: endl;
            } else {
                std :: cout << "TRANSFERÊNCIA BLOQUEADA" << std :: endl;
            }

        default :

            std :: cout << "OPERAÇÃO NÃO INFORMADA" << std :: endl; break;
    }

    return 0;
}
