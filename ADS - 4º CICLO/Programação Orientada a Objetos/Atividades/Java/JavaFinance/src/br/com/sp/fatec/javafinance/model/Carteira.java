package br.com.sp.fatec.javafinance.model;

import br.com.sp.fatec.javafinance.exception.SaldoInsuficienteException;
import java.util.ArrayList;
import java.util.List;

public class Carteira {
    private List<AtivoFinanceiro> ativos;
    private double saldoDisponivel;

    public Carteira(double saldoInicial) {
        this.ativos = new ArrayList<>();
        this.saldoDisponivel = saldoInicial;
    }

    public void adicionarAtivo(AtivoFinanceiro ativo) throws SaldoInsuficienteException {
        double custoTotal = ativo.getTotalInvestido();
        if (custoTotal > saldoDisponivel) {
            throw new SaldoInsuficienteException("Saldo insuficiente para comprar " + ativo.getNome() + ". Custo: " + custoTotal + ", Saldo: " + saldoDisponivel);
        }
        this.ativos.add(ativo);
        this.saldoDisponivel -= custoTotal;
    }

    public void removerAtivo(String codigo) {
        ativos.removeIf(a -> a.getCodigo().equalsIgnoreCase(codigo));
    }

    public List<AtivoFinanceiro> getAtivos() {
        return new ArrayList<>(ativos);
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void depositar(double valor) {
        this.saldoDisponivel += valor;
    }
}
