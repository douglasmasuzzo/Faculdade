#include <iostream>

void InformarSalario( double salarioBase ){ std :: cout << "SALÁRIO: " << salarioBase << std :: endl; }

double CalcularAumento( double salarioBase ){ return salarioBase * 0.08; }

double CalcularDesconto( double salarioBase ){
    double salarioAtual = salarioBase + CalcularAumento( salarioBase );
    double desconto = salarioAtual * 0.11;
    return desconto;
}

double SalarioFinal( double salarioBase ){
    return ( salarioBase + CalcularAumento( salarioBase ) ) - CalcularDesconto( salarioBase );
}

int main(){
    double salario;

    std :: cout << "INFORME O SEU SALARIO: "; std :: cin >> salario;
    std :: cout << "--------------------------" << std :: endl;
    InformarSalario( salario );
    std :: cout << "GRATIFICAÇÃO: " << CalcularAumento( salario ) << std :: endl;
    std :: cout << "DESCONTO: " << CalcularDesconto( salario ) << std :: endl;
    std :: cout << "SALÁRIO FINAL: " << SalarioFinal( salario ) << std :: endl;
    return 0;
}