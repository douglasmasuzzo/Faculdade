package Heranca_Polimorfismo;

public class Empresa {
    String nome; double salario;

    public double CalcularBonus(){
        return salario * 0.10;
    }
    public void MostrarFuncionario(){
        System.out.println("NOME: " + nome );
        System.out.println("SALÁRIO BÔNUS: " + CalcularBonus() );
    }
}

