package Heranca_Polimorfismo;

public class Gerente extends Empresa {
    @Override
    public double CalcularBonus() {
        return salario * 0.20;
    }
    @Override
    public void MostrarFuncionario() {
        super.MostrarFuncionario();
    }
}
