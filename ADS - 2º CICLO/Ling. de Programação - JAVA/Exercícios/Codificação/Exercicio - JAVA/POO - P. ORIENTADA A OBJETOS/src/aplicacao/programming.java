package aplicacao;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class programming{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle X, Y;
        X = new Triangle();
        Y = new Triangle();

        System.out.println("Digite os valores de X: ");
        X.a = sc.nextDouble();
        X.b = sc.nextDouble();
        X.c = sc.nextDouble();
        System.out.print("Digite os valores de Y: ");
        Y.a = sc.nextDouble();
        Y.b = sc.nextDouble();
        Y.c = sc.nextDouble();

        double area = X.area(); Y.area();
    }
}