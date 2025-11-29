package Exercicios;
public class CalcularCirculo {

    private double raio;
    public CalcularCirculo( double raio ){ this.raio = raio; }
    public CalcularCirculo(){}

    public double CalcularArea(){ return Math.PI * ( raio * raio ); }
    public double getRaio(){ return raio; }
    public void setRaio( double raio ){ this.raio = raio; }
}
