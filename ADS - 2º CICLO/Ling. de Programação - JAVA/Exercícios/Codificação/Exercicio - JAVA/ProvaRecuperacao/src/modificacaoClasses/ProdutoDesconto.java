package modificacaoClasses;

public class ProdutoDesconto{

    private String produto;
    private int quantidade;
    private int novaQuantidade;
    private double preco;
    private double valorTotal;

    public ProdutoDesconto ( String produto, int quantidade, double preco ){
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void calcularValorTotal(){
        this.valorTotal = quantidade * preco;
    }

    public void atualizarQuantidade(){
        this.novaQuantidade = quantidade++;
    }

    public String toCSV() {
        return String.format( "%s,%d,%d,%.2f,%.2f", produto, quantidade, novaQuantidade, preco, valorTotal);
    }
}