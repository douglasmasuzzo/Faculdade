public class Operaçoes{
    public static void main( String[] args ){
        short A = 1; long B = 100; int C = 29;
        float soma = A + B + C; double media = ( double ) soma / 3;
        System.out.println("SOMA: " + soma ); System.out.printf("MÉDIA: %.2f", media );
    }
}