package prova.cotacao;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in );

        float bitcoin = 29190;
        double dollar = 6.00;
        double cotacao = 0;

        System.out.print("INFORME A QUANTIDADE DE MOEDAS: ");
        double quant = sc.nextDouble();

        if ( quant >= 1 ){
            cotacao = bitcoin * dollar;
            System.out.println( cotacao );
        } else {
            System.out.print("QUANTIDADE NÃO INFORMADA");
        }

        System.out.println("QUANTIDADE: " + quant);
        System.out.println("VALOR ATUAL DA MOEDA: " + bitcoin);
        System.out.printf("VALOR FINAL: %.2f\n", cotacao );
        sc.close();
    }
}