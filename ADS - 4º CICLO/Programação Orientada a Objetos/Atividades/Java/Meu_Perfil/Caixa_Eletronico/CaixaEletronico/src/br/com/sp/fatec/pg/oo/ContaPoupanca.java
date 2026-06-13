package br.com.sp.fatec.pg.oo;

public class ContaPoupanca extends Conta {
    
    @Override
    public void ImprimirExtrato() {
        System.out.println(" === EXTRATO CONTA POUPANÇA === ");
        System.out.println("SALDO ATUAL: " + getSaldo());
    }
}
