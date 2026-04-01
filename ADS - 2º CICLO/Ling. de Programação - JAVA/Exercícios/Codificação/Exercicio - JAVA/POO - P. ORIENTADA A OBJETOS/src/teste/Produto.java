package teste;

public class Produto{

    // atributos
    String nome;
    String marca;
    float valor;

    // construtor padrão
    public Produto(){}

    public Produto( String nome , String marca ) {
        this.nome = nome;
        this.marca = marca;
    }

    public Produto( String nome , String marca , float valor ) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}


    // o termo "this." refere-se a instância do objeto
    // garatindo que o código dentro de uma função opere na instância correta
    // Sem o this., os métodos seriam incapazes de acessar e modificar as vars
