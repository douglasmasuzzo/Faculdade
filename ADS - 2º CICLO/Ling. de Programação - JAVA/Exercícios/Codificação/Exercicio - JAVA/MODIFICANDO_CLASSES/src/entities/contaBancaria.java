package entities;

public class contaBancaria{
    private String titular;
    private double saldo;

    public String getTitular(){
        return titular;
    }
    public void setTitular ( String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo ( double saldo ){
        this.saldo = saldo;
    }

    public double realizarDeposito( double valor ) {
        if ( valor > 0 ){
            saldo += valor;
            System.out.println("Valor depositado");
        } else {
            System.out.print("Valor indisponível");
        }
        return saldo;
    }

    public double realizarSaque( double valor ) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado");
        } else {
            System.out.print("Valor indisponível.");
        }
        return saldo;
    }
}