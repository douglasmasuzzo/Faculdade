#include <iostream>

int ExibirNumeros( int pnt1, int pnt2 ){
    if ( pnt1 % pnt2 != 0) {
        std :: cout << " NÚMERO ÍMPAR " << std :: endl;
        return pnt1;
    } else {
        std :: cout << " NÚMERO PAR " << std :: endl;
        return pnt2;
    }
}

int main(){
    int A ,  B;
    int *pnt1 = NULL; int *pnt2 = NULL;
    pnt1 = &A; pnt2 = &B;
    
    std :: cout << "INFORME O 1º VALOR : " ; std :: cin >> A;
    std :: cout << "INFORME O 2º VALOR : " ; std :: cin >> B;

    std :: cout << "RESULTADO : " << ExibirNumeros( *pnt1 , *pnt2 ) << std :: endl;
    return 0;
}