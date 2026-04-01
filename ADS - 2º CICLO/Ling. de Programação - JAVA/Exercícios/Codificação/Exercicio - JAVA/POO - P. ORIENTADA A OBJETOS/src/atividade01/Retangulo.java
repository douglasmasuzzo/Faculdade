package atividade01;

public class Retangulo {

    public double altura;
    public double largura;

    public Retangulo ( double altura , double largura ) {
        this.altura = altura;
        this.largura = largura;
    }
    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return 2 * ( altura + largura );
    }

    public double diagonal() {
        return Math.sqrt( altura * altura + largura * largura );
//      return Math.sqrt( Math.POW( altura ,  2 ) + Math.POW ( largura , 2 ) );
    }
}
