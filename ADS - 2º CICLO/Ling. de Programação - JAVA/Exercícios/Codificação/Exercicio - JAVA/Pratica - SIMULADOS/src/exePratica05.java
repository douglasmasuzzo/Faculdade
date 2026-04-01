import java.util.Scanner;

public class exePratica05 {

    public static double calcularSalarioFinal( double horasTrabalho, double valorHoras, double adFixo){
        double salario = horasTrabalho + valorHoras + adFixo;
        return salario;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as Horas Trabalhadas do funcionário: ");
        double horasTrabalho = sc.nextDouble();

        System.out.print("Digite o Valor da Hora: ");
        double valorHoras = sc.nextDouble();

        System.out.print("Insira o valor do Adicional Fixo: ");
        double adFixo = sc.nextDouble();

        double salarioFinal = calcularSalarioFinal(horasTrabalho, valorHoras, adFixo);

        System.out.printf("\nO salário final é: R$ %.2f%n", salarioFinal);

        sc.close();
    }
}