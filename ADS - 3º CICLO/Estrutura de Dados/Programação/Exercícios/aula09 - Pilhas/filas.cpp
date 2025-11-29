#include <cstdlib>
#include <iostream>

using namespace std;

class FilaDeArray{

     private:
        int *VET;
        int ProximaPosicaoLivre;
        int MAX;

    public:
        FilaDeArray(int qtde){

            MAX = qtde;
            VET = new int[MAX];
            ProximaPosicaoLivre = 0;
        }
            void Insere(int n){
                if(ProximaPosicaoLivre <= MAX) VET[ProximaPosicaoLivre++] = n;
            }

            void Mostra(){
                for(int i = 0; i<ProximaPosicaoLivre; i++) {
                    cout <<VET[i] <<"\n";
                }
            }

            int Retira(){

                if(ProximaPosicaoLivre > 0){
                    
                    int ValorDeRetorno = VET[0];
                    
                    for(int i = 1; i < ProximaPosicaoLivre; i++){
                        VET[i-1] = VET[i];
                    }

                    ProximaPosicaoLivre--; return ValorDeRetorno;
                }
            }
};

int main(int argc, char *argv[])
{
    FilaDeArray fila(50);
    fila.Insere(3);
    fila.Insere(5);
    fila.Insere(7);
    fila.Insere(1);
    fila.Mostra();
    cout <<"\nRetira da fila o " <<fila.Retira() <<".\n\n";
    cout <<"\nRetira da fila o " <<fila.Retira() <<".\n\n";
    fila.Mostra();
    system("PAUSE");
    return EXIT_SUCCESS;
}