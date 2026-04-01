package manipulacaoArquivos;

// Classe que representa um produto lido em um arquivo CSV
public class DouglasProduto {
    private String produto;
    private int quant;
    private double preco;
    private double valorTotal;
    // atributos

    public DouglasProduto ( String produto, int quant, double preco ){
        this.produto = produto; // nome do produto
        this.quant = quant; // número de quant
        this.preco = preco; // valor
    }

    // método que vai calcular o valor total
    public void calcularValorTotal(){
        this.valorTotal = quant * preco;
    }

    public String toCSV(){
        return String.format( "%s,%d,%.2f,%.2f", produto, quant, preco, valorTotal);
        // String.format = formatar a string inserindo variáveis dentro
        // %s = String
        // %d = Double
        // %.2f = Float
    }

}

