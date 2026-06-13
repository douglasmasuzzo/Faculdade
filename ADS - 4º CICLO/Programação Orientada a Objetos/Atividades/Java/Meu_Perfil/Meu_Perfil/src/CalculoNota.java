import java.util.Scanner;
public class CalculoNota {
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME O VALOR DA 1º NOTA: ");
        Double p1 = sc.nextDouble();
        System.out.println("INFORME O VALOR DA 2º NOTA: ");
        Double p2 = sc.nextDouble();

        Double media = ( p1 + p2 ) / 2.0;
        String status = "";
        
        if ( media >= 7.0 ) {
            status = "APROVADO";
        } else if ( media >= 5.0 && media < 7.0 ){
            status = "RECUPERAÇÃO";
        } else {
            status = "REPROVADO";
        }

        System.out.println("-----------------------------");
        System.out.println("MÉDIA DE NOTA DE PROVA");
        System.out.println("-----------------------------");
        System.out.println("1º NOTA : " + p1);
        System.out.println("2º NOTA : " + p2);
        System.out.printf("MÉDIA = %.2f\n", media );
        System.out.println("STATUS: " + status );
        sc.close();
    }
}
