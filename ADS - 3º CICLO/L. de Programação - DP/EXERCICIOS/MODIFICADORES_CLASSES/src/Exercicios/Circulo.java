package Exercicios;
public class Circulo {
    public static void main( String[] args ){

        CalcularCirculo cc = new CalcularCirculo();
        cc.setRaio( 3.5 );
        System.out.println("RAIO : " + cc.getRaio() );
        System.out.printf("ÁREA DO CÍRCULO : %.2f", cc.CalcularArea() );
    }
}
