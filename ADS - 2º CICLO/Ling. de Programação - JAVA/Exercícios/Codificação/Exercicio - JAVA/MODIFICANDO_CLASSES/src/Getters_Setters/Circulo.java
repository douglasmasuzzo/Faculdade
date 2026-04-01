package Getters_Setters;

public class Circulo {
    private double raio;
    private double calcularArea;

    public double getRaio(){
        return raio;
    }
    public void setRaio( double raio ) {
        this.raio = raio;
    }

    public double CalcularArea(){
        return Math.PI * Math.pow( raio , 2 );
    }
}
