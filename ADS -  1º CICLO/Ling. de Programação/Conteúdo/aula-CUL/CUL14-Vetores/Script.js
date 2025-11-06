/* Trabalhando com Arrys */
 
// Declarando e Iniciando Arrays
 
let numeros = [1, 4, 5, 2, 3];
let nomes = ["Mari", "Agda", "Lena",];
let mix = [1, "Mari", true, {chave: "Valor"}];

// O 4º elemento é "Object" que é um tipo de dado
// contendo uma propriedade "chave" e o respectivo valor "valor".

// Acessando e apresentando os valores dos Arrays
console.log(numeros[0]); // Saída: 1
console.log(nomes [2]); // Saída: "Lena"
console.log(mix[3]); // Saída: {Chave: "Valor"}

// Acrescentando valores

 numeros[5] =  6;

// Neste exemplo foi ncesssário conhecer a última posição
// ou fazer com

     numeros.push(7);

// Neste exemplo, a última posição do array não era conhecida.

 console.log(numeros[6]);

// Lendo i tamanho do Vetor

 let x = numeros.legth

// É o atributo que contém o tamanho do 'array'

 console.log("O vetor números possui" + numeros.legth + "posições");

// Método de ordenamento

 numeros.sort(); // Ordena o conteúdo do array na forma crescente.
 for(i=0, i <=x ; i+=1;){
     console.log(numeros[i]);
 }

// Buscar valores com o método indexof() -  Referências
// https://www.w3schools.com/jsref/jsref_indexof.asp

 let valorProcurado = 10
 let y = numeros.indexOf(valorProcurado);

// Este método procura no array números o valor, armazenado na variável "valorProcurado".
// Caso não encontre, ele retorna -1.

 if( y == -1 ){
        console.log("O valor " + valorProcurado + "não foi encontrado");
    } else{
        console.log("O valor " + valorProcurado + "está na posição" + y);
 }
