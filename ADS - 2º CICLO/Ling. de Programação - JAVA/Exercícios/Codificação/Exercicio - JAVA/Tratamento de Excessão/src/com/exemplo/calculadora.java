package com.exemplo;

public class calculadora {
    public static void main(String[] args){
        int A = 5; // V_A
        int B = 0; // V_B
        int RESULTADO = dividir( A, B );
        System.out.print("Resultado: " + RESULTADO );
    }

    private static int dividir(int X, int Y ){ // int P_A / P_B
        if ( Y == 0 ) { // P_B
            System.out.println("Divisão por zero não permite");
            return 0;
        }
        return X / Y; // P_A / P_B
    }
}