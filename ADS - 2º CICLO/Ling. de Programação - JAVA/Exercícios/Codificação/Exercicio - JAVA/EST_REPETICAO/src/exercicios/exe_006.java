package exercicios;

import java.util.Scanner;

public class exe_006 {
    public static void main(String[] args){
        Scanner digitos = new Scanner (System.in);

        System.out.print("Digite um número: ");
            int numero = digitos.nextInt();
            int soma = 0;
            int valores_Soma = numero;

        while ( numero != 0 ) {
            soma += numero % 10;
            numero /= 10;
        }
        System.out.printf("A soma dos dígitos de %d é de: %d%n", valores_Soma, soma);
        digitos.close();
    }
}
