#include <iostream>

class Matematica{
    public :
        int A, B;
        int somar(){ return A + B; }
        int subtrair(){ return A - B; }
        int multiplicar(){ return A * B; }
        float dividir(){ return ( float ) A / B; }
};

int main(){
    Matematica mat;

    int opcao;
    
    std :: cout << "DIGITE UM NÚMERO: "; std :: cin >> mat.A;
    std :: cout << "DIGITE OUTRO NÚMERO: "; std :: cin >> mat.B;
    
    std :: cout << "DIGTE A OPÇÃO DESEJADA: \n";
    std :: cout << " [ 1 ] - SOMAR " << std :: endl;
    std :: cout << " [ 2 ] - SUBTRAIR " << std :: endl;
    std :: cout << " [ 3 ] - MULTIPLICAR " << std :: endl;
    std :: cout << " [ 4 ] - DIVIDIR " << std :: endl;
    std :: cin >> opcao;

    switch( opcao ){

        case 1 :
            std :: cout << "SOMA: " << mat.somar() << std :: endl; 
            break;

        case 2 :
           std :: cout << "SUBTRAÇÃO: " << mat.subtrair() << std :: endl;
           break;

        case 3 :
           std :: cout << "MULTIPLICAÇÃO: " << mat.multiplicar() << std :: endl;
           break;

        case 4 :

            if ( mat.B != 0 ) {
                std :: cout << "DIVISÃO: " << mat.dividir() << std :: endl;
            } else {
                std :: cout << "INDIVÍSVEL POR 0" << std :: endl;
            }
                break; 

        default :
            std :: cout << "OPÇÃO INVÁLIDA." << std :: endl; 
            break;
    }
    return 0;
}