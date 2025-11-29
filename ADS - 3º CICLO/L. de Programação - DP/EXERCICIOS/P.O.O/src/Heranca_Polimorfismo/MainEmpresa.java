package Heranca_Polimorfismo;
import java.util.Scanner;

public class MainEmpresa {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        Empresa EP = new Empresa();
        Gerente GR = new Gerente();

        System.out.println("INFORME O NOME DO FUNCIONÁRIO: ");
        EP.nome = sc.nextLine();
        System.out.println("INFORME O SALÁRIO DO FUNCIONÁRIO: ");
        EP.salario = sc.nextDouble();

        sc.nextLine();

        System.out.println("INFORME O NOME DO GERENTE: ");
        GR.nome = sc.nextLine();
        System.out.println("INFORME O SALÁRIO DO GERENTE: ");
        GR.salario = sc.nextDouble();

        System.out.println("-------------------");
        System.out.println(" [ FUNCIONÁRIO ] " ); EP.MostrarFuncionario();
        System.out.println("-------------------");
        System.out.println("[ GERENTE ] "); GR.MostrarFuncionario();
    }
}
