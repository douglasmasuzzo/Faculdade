#include <cstdlib> // biblioteca de entrada e saída
#include <iostream>

using namespace std;

class ListaDeArray // molde voltado ao armazenamento de objetos e coleção de forma ordenada

// LISTA ENCADEADA -> DEFINE A AÇÃO CONFORME A ORDEM CRESCENTE DO VETOR

{
      private:
             int *VET; // ponteiro para vetor
             int ProximaPosicaoLivre; // contador de elementos e índices 
      public:
             ListaDeArray(int qtde) // constructor 
             {
                 VET = new int[qtde];
                 ProximaPosicaoLivre = 0;
             }
             void Insere(int n) // inserção ordenada ( crescente )
             {
                  int pos = ProximaPosicaoLivre - 1;

                  // algoritmo de ordenação -> insertion sort
                  while((n < VET[pos]) && (pos > -1))
                  {
                          VET[pos+1] = VET[pos]; // comparações de elementos deslocaldos 
                          pos--;
                  }
                  VET[pos+1] = n; // elemento inserido na posição vaga
                  ProximaPosicaoLivre++; // valor incrementado 
             }
             void Mostra() // percorre o array e imprime cada elemento da lista
             {
                  for(int i = 0; i<ProximaPosicaoLivre; i++)
                  {
                          cout <<VET[i] <<"\n";
                  }
             }
             int Busca(int n) // busca linear
             {
                  for(int i = 0; i<ProximaPosicaoLivre; i++)
                  {
                          if(n == VET[i]) return i; // retorna o índice de posição no array
                  }
                  return -1; // caso não encontradi, retorna o valor especial 
             }
             void Remove(int n) // localizar a posição do elemento removido
             {
                  int pos = Busca(n);
                  if(pos > -1) // caso encontrado, os elementos à direita são deslocados uma posição à esquerda
                  {
                         for(int i = pos+1; i < ProximaPosicaoLivre; i++)
                         {
                                 VET[i-1] = VET[i];
                         }
                         ProximaPosicaoLivre--; // ação que reduz o tamanho da lista
                  }
             }
};

int main(int argc, char *argv[])
{
    ListaDeArray lista(50);
    lista.Insere(1);
    lista.Insere(12);
    lista.Insere(3);
    lista.Insere(7);
    lista.Remove(200); // valor não alterado na lista 
    lista.Remove(3); // valor alterado na lista 
    lista.Mostra();
    cout <<"\n\n\n";
    cout <<lista.Busca(5) <<"\n\n\n"; // valor retornado após a procura do número
    system("PAUSE");
    return EXIT_SUCCESS;
}