package br.com.sp.fatec.pg.oo;

public class ContaCorrente extends Conta implements Tributavel {
    
    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.0005; // 0.05% do saldo atual
    }

    @Override
    public void SacarValor(Double valor) {
        double taxa = valor * 0.0005; // 0,05% do valor do saque
        double valorTotal = valor + taxa;
        
        if (valorTotal <= getSaldo()) {
            setSaldo(getSaldo() - valorTotal);
            System.out.println("SAQUE REALIZADO (Taxa: " + taxa + ")");
            System.out.println("SALDO ATUAL: " + getSaldo());
        } else {
            System.out.println("SALDO INSUFICIENTE PARA O SAQUE COM TAXA");
        }
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println(" === EXTRATO CONTA CORRENTE === ");
        System.out.println("INFORMAÇÃO: Conta Corrente com taxa de saque");
        System.out.println("SALDO ATUAL: " + getSaldo());
    }
}
