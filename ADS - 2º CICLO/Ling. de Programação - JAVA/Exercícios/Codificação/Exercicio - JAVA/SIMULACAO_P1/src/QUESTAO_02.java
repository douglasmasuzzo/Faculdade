import java.util.Scanner;

public class QUESTAO_02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Quanto é o salário que você recebe?");
        double quantSalario = scanner.nextDouble();

        if ( quantSalario <= 645 ) {
            System.out.print("Recebe até: 1 Salário.");
        } else if ( quantSalario <= 1935 ) {
            System.out.print("Recebe até: 3 Salário(s).");
        } else if ( quantSalario <= 3225 ) {
            System.out.print("Recebe até: 5 Salário(s)");
        } else {
            System.out.print("Recebe até mais que: 5 Salário(s)");
        }

        scanner.close();
    }
}
