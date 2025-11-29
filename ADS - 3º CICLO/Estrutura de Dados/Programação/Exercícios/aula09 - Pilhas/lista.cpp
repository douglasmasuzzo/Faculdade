#include <cstdlib>
#include <iostream>

using namespace std;

class Lista{

    private:
        int *VET;
        int ProximaPosicaoLivre;
        int MAX;
    
    public:
        Lista(int qtde){
            MAX = qtde;
            VET = new int[MAX];
            ProximaPosicaoLivre = 0;
        }
             
            void InserirFim( int n ){
                if ( ProximaPosicaoLivre < MAX ) {
                    VET[ ProximaPosicaoLivre++ ] = n;
                } 
            }
             
            void InserirInicio( int n ) {
                  
                if(ProximaPosicaoLivre <= MAX){
                  	
                  	for ( int i = ProximaPosicaoLivre; i >= 0 ; i-- ){
                		VET[ i ] = VET[ i - 1 ];		
                  	}
                 	
                  	VET[ 0 ] = n;
                  	ProximaPosicaoLivre++;
                }     
            }
             
            void Mostrar( ){
                  
                for(int i = 0; i < ProximaPosicaoLivre; i++){
                    cout <<VET[i] <<"\n";
                }
            }
             
            int RetirarInicio( ){
                  
                if(ProximaPosicaoLivre > 0){

                    int ValorDeRetorno = VET[0];
                    
                    for(int i = 0; i < ProximaPosicaoLivre; i++) {
                        VET[i] = VET[i + 1];
                    }
                    
                    ProximaPosicaoLivre--; return ValorDeRetorno;
                }
            }
             
            int RetirarFim( ) {

                if ( ProximaPosicaoLivre > 0 ){
                	return VET[--ProximaPosicaoLivre];    
                }    
             }
};

int main(int argc, char *argv[])
{
    Lista list(50);
    
    list.InserirInicio(3);
    list.InserirInicio(5);
    list.Mostrar();
    
    cout <<"\nRetira da fila o " << list.RetirarFim() <<".\n\n";
    cout <<"\nRetira da fila o " << list.RetirarFim() <<".\n\n";
    list.Mostrar();
    
    system("PAUSE");
    return EXIT_SUCCESS;
}