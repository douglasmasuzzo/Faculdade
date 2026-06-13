package br.gov.sp.fatec.pg.poo;
public class Conta {
    private Double saldo;
    
    public Conta(){};
    public Conta( Double saldo ){
        this.saldo = saldo;
    }

    public Double getSaldo(){ return this.saldo; }
    public void setSaldo( Double saldo ){ this.saldo = saldo; }

    public Double ConsultarSaldo(){ return this.saldo; }

    public void DepositarSaldo( Double valor ){ 
        if ( valor > 0 ) {
            this.saldo += valor;
        }
        System.out.println("DEPÓSITO REALIZADO COM SUCESSO");
        System.out.printf("VALOR ATUAL: %.2f\n", this.saldo );
    }

    public void SacarSaldo( Double valor ){
        if ( valor <= saldo && valor > 0 ){
            this.saldo -= valor;
            System.out.println("SAQUE REALIZADO COM SUCESSO");
            System.out.printf("VALOR ATUAL: %.2f\n", this.saldo);
        }       
    }
}