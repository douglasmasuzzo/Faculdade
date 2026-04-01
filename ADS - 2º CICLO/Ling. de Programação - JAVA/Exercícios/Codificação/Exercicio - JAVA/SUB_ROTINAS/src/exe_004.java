import java.util.Scanner;

public class exe_004{
    public static void verificarNumeros ( int numero ){
        int resultado = (numero >= 0) ? 1 : 0;
        System.out.print("Resultado: " + resultado);
    }

    public static void main(String[] args){
        verificarNumeros(-100);
    }
}