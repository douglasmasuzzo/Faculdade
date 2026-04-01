package modificacaoClasses;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GerarRelatorio {
    public static void main(String[] args){
        List<ProdutoDesconto> produtoDescontos = new ArrayList<>();

        try ( Scanner sc = new Scanner ( new File("listaInicio.csv") )){

            while ( sc.hasNextLine() ){
                String linha = sc.nextLine();
                String[] partes = linha.split(",");
                String nome = partes[0];
                int quant = Integer.parseInt( partes[1] );
                double preco = Double.parseDouble( partes[2] );

                ProdutoDesconto desconto = new ProdutoDesconto( nome, quant, preco );
                desconto.calcularValorTotal();
                desconto.atualizarQuantidade();
                produtoDescontos.add( desconto );
            }
        } catch ( IOException e ){
            System.out.println("Erro: " + e.getMessage());
        }

        try ( BufferedWriter BW = new BufferedWriter ( new FileWriter("listaFinal.csv") )){
            BW.write("produto, quantidade, preco, novaQuantidade, valorTotal");
            BW.newLine();

            for ( ProdutoDesconto p : produtoDescontos ){
                BW.write( p.toCSV() );
                BW.newLine();
            }

            System.out.println("Arquivo criado com sucesso");
        } catch( IOException e ){
            System.out.println("Erro ao gerar o arquivo " + e.getMessage() );
        }

    }
}
