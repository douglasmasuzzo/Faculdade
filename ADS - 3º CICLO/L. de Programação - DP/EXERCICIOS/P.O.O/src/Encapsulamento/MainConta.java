package Encapsulamento;

public class MainConta {
    public static void main( String[] args ){
        ContaBancaria contaBanco = new ContaBancaria();

        contaBanco.setTitularConta("ABC");
        contaBanco.setSaldo(2500);
        contaBanco.Depositar( 1500 );
        contaBanco.Sacar(650);

        System.out.println("------------------------");
        contaBanco.ExibirRelatorio();
    }
}
