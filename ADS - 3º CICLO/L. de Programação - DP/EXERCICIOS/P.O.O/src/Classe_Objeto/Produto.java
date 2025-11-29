package Classe_Objeto;

public class Produto {

    String nomeProduto;
    int quantidade; double preco;

    public void ExibirInformacoes(){
        System.out.println("PRODUTO: " + nomeProduto );
        System.out.println("QUANTIDADE: " + quantidade );
        System.out.printf("PREÇO: %.2f\n" , preco );
        System.out.printf("VALOR FINAL: %.2f\n" , CalcularEstoque() );
    }

    public double CalcularEstoque(){
        return preco * quantidade;
    }
}
