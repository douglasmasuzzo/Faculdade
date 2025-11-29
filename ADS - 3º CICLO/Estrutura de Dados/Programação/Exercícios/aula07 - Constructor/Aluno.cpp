// class Aluno
// construtores = vazio + atributos
// atributos = nome / id / telefone
// método -> void()

#include <iostream>
#include <string>

class Aluno{
    public :

    std :: string nome;
    int matricula;
    std :: string telefone;

    Aluno(){}
    Aluno( std :: string nomeAluno, int ID, std :: string telefone ){
        nome = nomeAluno;
        matricula = ID;
        this->telefone = telefone;
    }

    void ExibirInformacoes(){
        std :: cout << "-----------------------\n";
        std :: cout << "EXIBINDO INFORMAÇÕES" << std :: endl;
        std :: cout << "ALUNO: " << nome << std :: endl;
        std :: cout << "MATRÍCULA: " << matricula << std :: endl;
        std :: cout << "TELEFONE: " << telefone << std :: endl;
    }
};

int main(){

    Aluno estudante1;
    estudante1.nome = "FULANO";
    estudante1.matricula = 12345678;
    estudante1.telefone = "(13) 99654-3812";

    Aluno estudante2("CICLANO", 20258576, "(21) 99324-6352");
    Aluno estudante3("BELTRANO", 34267493, "(31) 94373-7382");

    estudante1.ExibirInformacoes();
    estudante2.ExibirInformacoes();
    estudante3.ExibirInformacoes();
    return 0;
}