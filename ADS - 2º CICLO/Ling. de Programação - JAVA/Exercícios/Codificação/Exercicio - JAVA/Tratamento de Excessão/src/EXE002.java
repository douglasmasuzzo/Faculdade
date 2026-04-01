import java.util.Scanner;
public class EXE002{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String abc = sc.next();

        try {
            int num = Integer.parseInt(abc);
        } catch ( NumberFormatException ex ) {
            System.out.print("Não é possível converter um texto para um número inteiro.");
        }

        sc.close();
    }
}