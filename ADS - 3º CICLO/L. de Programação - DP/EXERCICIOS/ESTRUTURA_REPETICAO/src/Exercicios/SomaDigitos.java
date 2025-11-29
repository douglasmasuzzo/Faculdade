package Exercicios; import java.util.Scanner;

public class SomaDigitos{
    public static void main( String[] args ){
        Scanner sc = new Scanner ( System.in );

        System.out.println("INFORME O VALOR: "); int numero = sc.nextInt();
        int soma = 0; int somaDigitos = numero;

        while ( numero != 0 ){
            soma += numero % 10;
            numero /= 10;
        }

        System.out.println("VALOR INSERIDO: " + somaDigitos ); System.out.println("SOMA DE DÍGITOS: " + soma ); sc.close();
    }
}