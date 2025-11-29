/* ESTRUTURA DE DADOS - CLASSES

 -------------------------------------

CLASSE DE PILHA / LISTA ENCADEADA / FILA 

** CLASSE ( EM AULA ) - PILHA 
*/

class PilhaDeArray {

    private:
        int *VET;
        int ProximaPosicaoLivre;
        int MAX;

    public:
        PilhaDeArray(int qtde){
            MAX = qtde;
            VET = new int[MAX];
            ProximaPosicaoLivre = 0;     
        }


        void Empilha(int n){

            if(ProximaPosicaoLivre < MAX) {
                VET[ProximaPosicaoLivre++] = n;
            }
        }

        void Mostra(){

            for(int i = 0; i<ProximaPosicaoLivre; i++){
                cout <<VET[i] <<"\n";
            }
        }
        
        int Desempilha(){

            if(ProximaPosicaoLivre > 0){ 
			    return VET[--ProximaPosicaoLivre];
            }
        }
};

int main(int argc, char *argv[])
{
    PilhaDeArray pilha(50);
    pilha.Empilha(3);
    pilha.Empilha(5);
    pilha.Empilha(7);
    pilha.Empilha(1);
    pilha.Mostra();
    cout <<"\nDesempilha " <<pilha.Desempilha() <<".\n\n";
    cout <<"\nDesempilha " <<pilha.Desempilha() <<".\n\n";
    pilha.Mostra();
    system("PAUSE");
    return EXIT_SUCCESS;
}

--------------------------------------

/* ANOTAÃ‡Ã•ES

 1 Âº - Classe nomeada com CamelCase ( classe voltada ao gerenciamento da pilha )

 2 Âº - Atributos privado 

  ++ geralmente, sÃ£o aplicados quando o programa visa proteger as informaÃ§Ãµes, que sÃ£o inicializados 
diretamente pelo construtor

	private:
             int *VET ( ponteiro ) ;
             int ProximaPosicaoLivre;
             int MAX;

 3Âº - Atributos publicos 

  ++ a variÃ¡vel MAX Ã© pÃºblico pois ele herda o valor definido como parÃ¢metro do construtor

  ++ a variÃ¡vel VET Ã© criada e atribuÃ­da a uma instÃ¢ncia ( new ) , devido o argumento de um vetor " [ MAX ] " declarado
 
  ++ tornar atributos privados implicam na seguranÃ§a de um objeto, redirecionando seu funcionamento apÃ³s transformÃ¡-lo em pÃºblico; 	

	public:
             PilhaDeArray(int qtde) -> construtor
             {
                 MAX = qtde -> ( argumento do mÃ©todo ) ;
                 VET  = new int[MAX] ( variÃ¡vel inicializada declarada como array, limitando o endereÃ§amento de memÃ³ria do ponteiro );
                 ProximaPosicaoLivre = 0 ( inicializando o elemento do vetor no 1Âº Ã­ndex ( 0 ) ) ;
             }
             void Empilha(int n) -> exibiÃ§Ã£o sem retorno
             {
                  if(ProximaPosicaoLivre < MAX) -> verifica se o vetor estÃ¡ armazenado completamente
			VET[ProximaPosicaoLivre++] = n; ( o valor inicializado Ã© incrementado apÃ³s a contagem do index ) 
             }
             void Mostra() -> limita a exibiÃ§Ã£o de quantidade do vetor
             {
                  for(int i = 0; i < ProximaPosicaoLivre; i++) -> exibe os Ã­ndeces informados anteriormente na pilha 
                  {
                          cout <<VET[i] <<"\n";
                  }
             }
             int Desempilha() -> retorna o elemento anterior da pilha
             {
                  if(ProximaPosicaoLivre > 0) 
			return VET[--ProximaPosicaoLivre];
             } 

 4Âº - Int main  

int main(int argc, char *argv[]){
    PilhaDeArray pilha(50);

    // for ( int i = 0; i < 20 ; i++ ){
	 cin << X ; pilha.Empilha( X );
    // 

    pilha.Empilha(3);
    pilha.Empilha(5);
    pilha.Empilha(7);
    pilha.Empilha(1);
    pilha.Mostra();
    cout <<"\nDesempilha " <<pilha.Desempilha() <<".\n\n";
    cout <<"\nDesempilha " <<pilha.Desempilha() <<".\n\n";
    pilha.Mostra();
    system("PAUSE");
    return EXIT_SUCCESS;
*/
}