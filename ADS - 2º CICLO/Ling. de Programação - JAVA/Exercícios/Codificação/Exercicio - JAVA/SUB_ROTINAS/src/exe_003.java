import java.util.Scanner;

public class exe_003 {
    public static void main(String[] args){
        Scanner calculadora = new Scanner(System.in);

        System.out.println("Selecione a Operação do Cálculo; ");
        System.out.println(" [ 1 ] - SOMA ");
        System.out.println(" [ 2 ] - SUBTRAÇÃO ");
        System.out.println(" [ 3 ] - MULTIPLICAÇÃO ");
        System.out.println(" [ 4 ] - DIVISÃO ");
        System.out.println(" [ 0 ] - CANCELAR ");
            int operacao  = calculadora.nextInt();

        System.out.print("Digite o 1º número: ");
            double valor1 = calculadora.nextInt();
        System.out.print("Digite o 2º número: ");
            double valor2 = calculadora.nextInt();

            Double resultadoFinal = null;

        switch ( operacao ) {
            case 1:
                resultadoFinal = somar(valor1, valor2);
                System.out.print("Soma " + resultadoFinal);
                    break;
            case 2:
                resultadoFinal = subtrair(valor1, valor2);
                System.out.print("Substração: " + resultadoFinal);
                break;
            case 3:
                resultadoFinal = multiplicar(valor1, valor2);
                System.out.print("Multiplicação: " + resultadoFinal);
                break;
            case 4:
                resultadoFinal = dividir(valor1, valor2);
                    if ( resultadoFinal != null ) {
                        System.out.print("Dividir: " + resultadoFinal);
                    } else {
                        System.out.print("Segundo Sávio:" + " Não existe divisão por 0");
                    }
                break;
            default:
                System.out.print("Operação CANCELADA");
        }
        calculadora.close();
    }

    public static double somar( double valor1, double valor2 ){
        return valor1 + valor2;
    }

    public static double subtrair( double valor1, double valor2 ){
        return valor1 - valor2;
    }

    public static double multiplicar ( double valor1, double valor2 ){
        return valor1 * valor2;
    }

    public static Double dividir ( double valor1, double valor2 ) {
        if ( valor2 == 0 ) {
            return null;
        }
            return valor1 / valor2;
    }
}
