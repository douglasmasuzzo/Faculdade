package Exercicios;
import java.math.*;

public class Retangulo{

    double altura; double largura;

    public static double CalcularArea( double altura, double largura ){
        double areaRetangulo = altura * largura;
        return areaRetangulo;
    }

    public static double CalcularPerimetro( double altura, double largura ){
        double perimetroRetangulo = 2 * ( largura + altura );
        return perimetroRetangulo;
    }

    public static double CalcularDiagonal( double altura , double largura ){
        double diagonalRetangulo = Math.sqrt( Math.pow( altura , 2 ) + Math.pow( largura , 2 ) );
        return diagonalRetangulo;
    }
}