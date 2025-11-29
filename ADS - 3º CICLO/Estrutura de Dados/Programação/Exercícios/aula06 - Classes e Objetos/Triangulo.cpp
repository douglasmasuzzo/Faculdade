#include <iostream>
#include <string>

class Triangulo{
    public :
    
    float A; float B; float C;


    bool VerificarTriangulo(){
        if ( A < ( B + C ) && B < ( A + C ) && C < ( A + B ) ){
            std :: cout << "O VALOR FORMA UM TRIÂNGULO" << std :: endl; return true;
        } else {
            std :: cout << "O VALOR NÃO FORMA UM TRIÂNGULO " << std :: endl; return false;
        }
    }

    std :: string VerificarTipo( float A , float B , float C ){

        if ( A == B && B == C ){
            return "EQUILÁTERO";
        } else if ( A == B || B == C || A == C ){
            return "ISÓSCELES";
        } else {
            return "ESCALENO";
        }
    }
};

int main(){
    Triangulo t;
    int opcao;

    std :: cout << "DIGITE O VALOR DE A: "; std :: cin >> t.A;
    std :: cout << "DIGITE O VALOR DE B: "; std :: cin >> t.B;
    std :: cout << "DIGITE O VALOR DE C: "; std :: cin >> t.C;

    while( opcao != 3 ){ 
        std :: cout << "ESCOLHA UMA OPÇÃO: " << std :: endl;
        std :: cout << " [ 1 ] - VERIFICAR SE É UM TRIÂNGULO" << std :: endl;
        std :: cout << " [ 2 ] - VERIFICAR O TIPO DE TRIÂNGULO " << std :: endl;
        std :: cout << " [ 3 ] - SAIR " << std :: endl;
        std :: cin >> opcao;

    
        switch( opcao ){

            case 1 :
                t.VerificarTriangulo(); break;

            case 2 :
                if ( t.VerificarTriangulo() ){
                    std :: cout << "O TRIÂNGULO É: " << t.VerificarTipo( t.A , t.B , t.C ) << std :: endl; break;
                }

            case 3 :
                std :: cout << "FINALIZANDO O PROGRAMA.." << std :: endl; break;

            default :
                std :: cout << "OPÇÃO INVÁLIDA" << std :: endl; break;
        }
    }
    
    return 0;
}