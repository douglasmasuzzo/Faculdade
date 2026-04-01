package entities;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    contaBancaria CB = new contaBancaria();

    System.out.print("Informe o nome do titular: ");
    String nome = sc.nextLine();
    CB.setTitular( nome );

    System.out.print("Informe o valor do salário: ");
    double valor = sc.nextDouble();
    CB.setSaldo( valor );

    System.out.print("Informe o valor do Depósito: ");
    double deposito = sc.nextDouble();
    CB.realizarDeposito(deposito);

    System.out.print("Informe o valor do Saque: ");
    double saque = sc.nextDouble();
    CB.realizarSaque(saque);

    System.out.println("------------------------");
    System.out.println("Nome: " + CB.getTitular());
    System.out.print("Valor do Salário: " + CB.getSaldo());

    sc.close();

}
}
