package br.com.sp.fatec.javafinance.model;

public class Acao extends AtivoFinanceiro {
    public Acao(String nome, String codigo, double quantidade, double valorCompra) {
        super(nome, codigo, quantidade, valorCompra);
    }

    @Override
    public double calcularRendimento(double valorAtual) {
        return (valorAtual - getValorCompra()) * getQuantidade();
    }

    @Override
    public String getTipo() {
        return "Ação";
    }
}
