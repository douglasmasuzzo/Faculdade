#include <iostream>

int main(){
    
    int A, B, soma;
    int *pont1 = NULL, *pont2 = NULL;

    std :: cout << "INFORME O 1º VALOR : "; std :: cin >> A; 
    std :: cout << "INFORME O 2º VALOR : "; std :: cin >> B; 

    pont1 = &A ; pont2 = &B;
    // O motivo pelo qual você usa o operador & ao atribuir valores aos ponteiros pont1 e pont2 é que esse operador é o "endereço de" ou "referência" na linguagem C++.
    soma = *pont1 + *pont2; 

    std :: cout << " 1º VALOR : " << *pont1 << std :: endl;
    std :: cout << " 2º VALOR : " << *pont2 << std :: endl; 
    std :: cout << " SOMA : " << soma;
    return 0; 
}