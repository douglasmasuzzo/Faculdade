package Exercicios;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        Funcionario funcionario = new Funcionario();

        System.out.println("INFORME SEU NOME: "); funcionario.nome = sc.nextLine();
        System.out.println("INFORME SEU SOBRENOME: "); funcionario.sobrenome = sc.nextLine();
        System.out.println("INFORME O VALOR DO SALÁRIO BRUTO: "); funcionario.salarioBruto = sc.nextDouble();

        System.out.println("------------------------------------");
        funcionario.VerificarNome( funcionario.nome , funcionario.sobrenome );
        System.out.printf("DESCONTO: %.2f\n" , funcionario.VerificarDesconto( funcionario.salarioBruto ) , "%");
        System.out.printf("SALÁRIO LÍQUIDO: %.4f\n" , funcionario.SalarioLiquido( funcionario.salarioBruto , funcionario.desconto ) );
        System.out.printf("AUMENTO SALARIAL: %.2f\n" , funcionario.AumentarSalario() , "%" );
        System.out.printf("SALÁRIO FINAL: %.4f\n" , funcionario.SalarioFinal() );
        sc.close();
    }
}