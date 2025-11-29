// class Comparavel
// atributo : int
// construtor  
// métodos -> bool maiorQue( int ) | bool menorQue( int ) | bool igualQue( int)
#include <iostream>

class Comparavel{
    
    public : 
    int valor;

    Comparavel(){}
    Comparavel( int numero ){
        valor = numero;
    }

    // 0 == true | 1 == false 
    bool maiorIgual( int numero ){  return valor >= numero; }
        // if ( valor >= numero ) { return true; } return false;

    bool menorIgual( int numero ){ return valor <= numero; }
        // if ( valor <= numero ) { return true; } return false;
    

    bool diferenteQue( int numero ){ return valor != numero; }
        // if ( valor != numero ) { return true; } return false;
};

int main(){
    Comparavel comparacao;
    std :: cout << "-------------------\n";
    std :: cout << "VALOR MAIOR QUE : " << comparacao.maiorIgual( 5 ) << std :: endl;
    std :: cout << "VALOR MENOR QUE : " << comparacao.menorIgual( 12 ) << std :: endl;
    std :: cout << "VALOR DIFERENTE QUE : " << comparacao.diferenteQue( 4 );
    return 0;
} 