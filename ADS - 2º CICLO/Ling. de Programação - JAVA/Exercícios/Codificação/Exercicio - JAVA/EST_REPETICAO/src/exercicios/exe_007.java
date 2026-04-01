package exercicios;

import java.util.Scanner;

public class exe_007 {
    public static void main(String[] args){
        Scanner fribonacci = new Scanner (System.in);

        System.out.print("Digite o número da sequeência: ");
            int quant = fribonacci.nextInt();

        if ( quant <= 0 ){
            System.out.print("Operação Interrrompida");
        } else {
            System.out.print("Os primeiros " + quant + " do termo de fribonacci são: ");
        }

        int A = 0;
        int B = 0;

        for ( int cont = 0; cont < quant; cont++ ){
            System.out.print(A + " ");
            System.out.printf("(Cálculo: %d + %d = %d)%n", A, B, A + B);
                int sequencia = A + B;
                    A = B;
                    B = sequencia;
        }

        fribonacci.close();
    }
}
