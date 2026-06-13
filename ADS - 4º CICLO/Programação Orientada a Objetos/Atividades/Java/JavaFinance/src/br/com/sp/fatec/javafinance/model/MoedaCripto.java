package br.com.sp.fatec.javafinance.model;

public class MoedaCripto extends AtivoFinanceiro {
    public MoedaCripto(String nome, String codigo, double quantidade, double valorCompra) {
        super(nome, codigo, quantidade, valorCompra);
    }

    @Override
    public double calcularRendimento(double valorAtual) {
        // Cripto pode ter cálculos de rendimento diferentes, mas para este projeto seguiremos o padrão.
        return (valorAtual - getValorCompra()) * getQuantidade();
    }

    @Override
    public String getTipo() {
        return "Criptomoeda";
    }
}
