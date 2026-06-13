import java.util.Scanner; 
public class Idade {
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
    
        System.out.println("INFORME SUA IDADE: ");
        Integer idade = sc.nextInt();

        if ( idade == 0 ){
            System.out.println("REGISTRO INVÁLIDO");
        } else if ( idade <= 12 ) {
            System.out.println("FAIXA ETÁRIA: INFANTIL");
        } else if ( idade <= 18 ) {
            System.out.println("FAIXA ETÁRIA: ADOLESCENTE");
        } else if ( idade <= 65 ) {
            System.out.println("FAIXA ETÁRIA: ADULTO(A)");
        } else {
            System.out.println("FAIXA ETÁRIA: IDOSO(A)");
        }
        sc.close();
    }
}