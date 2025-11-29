package Exercicios;

public class Funcionario {

    String nome; String sobrenome; double salarioBruto; double desconto;

    void VerificarNome( String nome , String sobrenome ){
        System.out.println("NOME COMPLETO: " + nome + " " + sobrenome );
    }

    public double VerificarDesconto( double salarioBruto ){
        if ( salarioBruto <= 1.520 ) {
            desconto = salarioBruto * 0.075;
        } else if ( salarioBruto <= 2.800 ){
            desconto = salarioBruto * 0.09;
        } else if ( salarioBruto <= 4.200 ){
            desconto = salarioBruto * 0.12;
        } else {
            desconto = salarioBruto * 100;
        }
        return desconto;
    }

    public double SalarioLiquido( double salarioBruto , double desconto ){
        return salarioBruto - desconto ;
    }

    public double AumentarSalario(){
        return salarioBruto * 0.05;
    }

    public double SalarioFinal(){
        return salarioBruto - desconto + AumentarSalario();
    }
}
