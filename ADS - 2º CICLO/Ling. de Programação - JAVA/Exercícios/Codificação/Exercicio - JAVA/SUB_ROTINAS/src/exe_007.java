
import java.text.DecimalFormat;
import java.util.Scanner;

public class exe_007 {
    public static void main(String[] args){
        Scanner porcento = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0,00");

        System.out.print("Digite o valor antigo do produto: ");
        double valorAntigo = porcento.nextDouble();
        System.out.print("Digite o valor atual do produto: ");
        double valorNovo = porcento.nextDouble();

        double percentual = ((valorNovo - valorAntigo) /  valorAntigo ) * 100;

        System.out.println("\nVariação: " + df.format(Math.abs(percentual)) + "%");

        if (percentual > 0) {
            System.out.print("Ocorreu um aumento no valor.");
        } else if ( percentual < 0) {
            System.out.print("Ocorreu uma baixa no valor.");
        } else {
            System.out.print("O valor está estável.");
        }

        porcento.close();
    }
}
