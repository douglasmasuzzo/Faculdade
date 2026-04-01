package teste;

public class carro {

    String nome;
    String marca;
    int ano;
    double velocidade;

    public void acelerar( int aceleracao ) {
        velocidade += aceleracao;
    }

    public void frear( int reduzir ){
        velocidade -= reduzir;
    }
}
