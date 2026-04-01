package atividades;
import java.util.Scanner;

public class atividade06 {
    public static int somaDigitos( int num ) {
        int soma = 0;
        while ( num > 0 ) {
            soma += num % 10;
            num /= 10;
        }
        return soma;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Selecione um número: ");
        int num = sc.nextInt();
        int numeros = somaDigitos( num );

        System.out.print("A soma dos números: " + num + " é: " + numeros );
    }
}
