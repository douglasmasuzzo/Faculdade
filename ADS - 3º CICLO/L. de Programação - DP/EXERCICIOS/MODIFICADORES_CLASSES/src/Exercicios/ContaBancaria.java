package Exercicios;

public class ContaBancaria {

    private double saldo;
    private String titular;

    public ContaBancaria( String titular, double saldo ){
        this.titular = titular;
        this.saldo = saldo;
    }
    public ContaBancaria(){}

    public String getTitular(){ return titular; }
    public void setTitular( String titular ){ this.titular = titular; }

    public double getSaldo(){ return saldo; }
    public void setSaldo( double saldo ){ this.saldo = saldo; }


    public double RealizarDeposito( double valor ){
        if ( valor > 0 ) {
            saldo += valor;
            System.out.println("DEPÓSITO : " + valor );
        }
        return saldo;
    }

    public double RealizarSaque( double saque ){
        if ( saque > 0 && saque <= saldo ){
            saldo -= saque;
            System.out.println("SAQUE : -" + saque );
        }
        return saldo;
    }
}
