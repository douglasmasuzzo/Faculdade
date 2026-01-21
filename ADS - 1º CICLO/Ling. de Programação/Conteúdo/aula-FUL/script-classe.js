/* 1º Exemplo */
 
class Pessoa1 {
    nome
    sobrenome
    idade
 
    apresentar(){
        return `Saudações. Eu sou ${this.nome} ${this.sobrenome}`;
       
        //return "Saudações ${this}"; // Não funciona
        /* A utilização dos caracteres ${} dentro de um string
        delimitada por crases (``) é conhecida como interpolação
        de string ou template strings.
            Umadas vantagens é a "Inserção de Variáveis", pois permite
            a inserção de valores de variáveis diretamente na string,
            o que torna o código mais legível e evita a concatenação
            excessiva de strings e variáveis.
        */  
    }
}
 
    // Instanciei a classe com um objeto
        let mae = new Pessoa1();
   
    // Note que ao digitar "mae", já aparecem as propriedades.
    // já podemos preencher as propriedades do objeto.
 
        mae.nome = "Agda";
        mae.sobrenome = "Lena";
        mae.idade = 40;
 
        let pai =  new Pessoa1();
            pai.nome = "Agdo";
            pai.sobrenome = "Leno";
            pai.idade = 40;
 
    // Perceba que são dois objetos com valores diferentes
        console.table(mae);
            console.table(pai);
                console.table
           
    // Métodos com parâmetros
        console.table