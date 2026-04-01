package entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {
        double per = ( a + b + c ) / 2.0;
        return Math.sqrt( per * ( per - a ) * ( per - b ) * ( per - c ) );
    }

}
