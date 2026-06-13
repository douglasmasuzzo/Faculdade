import java.util.Scanner;
public class CalculadoraIMC{
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME SEU NOME: ");
        String nome = sc.nextLine();

        System.out.println("INFORME A ALTURA: ");
        Double altura = sc.nextDouble(); 

        System.out.println("INFORME SEU PESO: ");
        Double peso = sc.nextDouble();

        Double imc = peso / ( altura * altura );

        System.out.print("---------------------------------------\n");
        System.out.println("CALCULE SEU IMC");
        System.out.print("---------------------------------------\n");
        System.out.println("USUÁRIO : " + nome );
        System.out.println("PESO: " + peso );
        System.out.println("ALTURA : " + altura );
        System.out.printf("IMC = %.2f", imc );
        sc.close();
    }
}