package atividades;
import java.util.Scanner;

public class atividade02 {

    public static int Somar ( int num ) {
        int soma = 0;

        for ( int i = 1; i <= num; i++ ){
            soma += i;
        }
            return soma;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número que deseja: ");
        int num = sc.nextInt();
        int resultado = Somar( num );

        System.out.print("A soma dos Números é de: " + resultado);
        sc.close();
    }
}
