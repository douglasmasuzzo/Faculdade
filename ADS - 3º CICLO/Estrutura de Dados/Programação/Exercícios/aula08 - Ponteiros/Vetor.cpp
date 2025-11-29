#include <iostream>

int main(){

    int A = 5; int B = 50; int C = 100;

    int *pnt1 = NULL; int *pnt2 = NULL; int *pnt3 = NULL; int *var_aux = NULL;     
    
    int pos[10] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};

    // Atribuir o endereço de memória 
    pnt1 = &A; pnt2 = &B; pnt3 = &C;

    // Exibir o endereço de memória de A e ponteiro1 
    std :: cout << "ENDEREÇO DE A: " << &A << std :: endl;
    std :: cout << "VALOR DO 1º PONTEIRO : " << *pnt1 << std :: endl;

    *pnt1 = *pnt1 + *pnt2 + *pnt3;

    std :: cout << "VALOR DA VARIÁVEL : " << *pnt1 << std :: endl;

    // Atribuir o valor de memória do vetor e o do ponteiro 
    var_aux = &pos[ 1 ];
    
    // Itere o vetor em 2, acrescentando o valor 
    for ( int i = 1 ; i < 10 ; i + 2 ){
        *var_aux += 10;     
        std :: cout << " VALOR DE POSIÇÃO : " << pos[ i ] << *var_aux << std :: endl;
        var_aux += 2; 
    }

    return 0;
}