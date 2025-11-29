package Encapsulamento;

public class ContaBancaria {

    private String titularConta;
    private double saldo;

    public String getTitularConta(){ return titularConta; }
    public double getSaldo(){ return saldo; }

    public void setTitularConta( String titular ){
        this.titularConta = titular ;
    }

    public void setSaldo( double saldo){
        if ( saldo > 0 ){
            this.saldo = saldo ;
        } else {
            System.out.println("VALOR NÃO ENCONTRADO");
        }
    }

    public void Depositar( double valor ){
        saldo = saldo + valor;
    }

    public void  Sacar( double valor ){
        if ( valor <= saldo && valor > 0 ){
            saldo = saldo - valor;
        }
    }

    public void ExibirRelatorio(){
        System.out.println("NOME DO TITULAR: " + titularConta );
        System.out.println("SALDO : " + saldo );
    }
}
