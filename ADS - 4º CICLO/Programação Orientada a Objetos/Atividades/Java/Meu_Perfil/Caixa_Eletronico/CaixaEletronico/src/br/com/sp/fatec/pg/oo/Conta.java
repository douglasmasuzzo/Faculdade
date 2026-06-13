package br.com.sp.fatec.pg.oo;

public abstract class Conta {
    private Double saldo;

    public Double getSaldo(){ return this.saldo; }
    public void setSaldo( Double saldo ){
        this.saldo = saldo;
    }

    public Double ConsultarSaldo(){ return this.saldo; }

    public void DepositarValor( Double valor ){ 
        this.saldo += valor;
        System.out.println("DEPÓSITO REALIZADO. NOVO SALDO: " + this.saldo);
    }
    
    public void SacarValor( Double valor ){
        if ( valor <= saldo ){
            this.saldo -= valor;
            System.out.println("SAQUE REALIZADO. SALDO ATUAL: " + this.saldo);
        } else {
            System.out.println("SALDO INSUFICIENTE");
        }
    }

    public abstract void ImprimirExtrato();
}
