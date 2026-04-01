package atividade02;

public class Empregado {

    public String Nome;
    public double SalarioBruto;
    public double Descontos;

    public Empregado ( String Nome , double SalBruto , double Descontos ){
        this.Nome = Nome;
        this.SalarioBruto = SalBruto;
        this.Descontos = Descontos;
    }

    public double Sal_Liquido( double Descontos ) {
        return SalarioBruto - Descontos;
    }

    public double AumentarSal ( double porcentagem ) {
        double aumento = SalarioBruto * ( porcentagem / 100 );
        SalarioBruto += aumento;
        return aumento;
    }
}
