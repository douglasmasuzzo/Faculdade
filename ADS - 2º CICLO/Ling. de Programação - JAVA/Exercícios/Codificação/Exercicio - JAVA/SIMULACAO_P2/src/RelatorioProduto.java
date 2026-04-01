import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RelatorioProduto {
    public static void main(String[] args){
        List<Produto> lista = new ArrayList<>();
        String caminho = "produtos.csv";

        try ( BufferedReader br = new BufferedReader ( new FileReader( caminho ))){
            String linha;
            boolean cabeçalho = true;

            while(( linha = br.readLine()) != null ) {
                if ( cabeçalho ){
                    cabeçalho = false;
                    continue;
                }

                String[] dados = linha.split(",");
                if ( dados.length != 3 ) continue;

                String nome = dados[0];
                int quantidade = Integer.parseInt( dados[1] );
                double preco = Double.parseDouble ( dados[2] );
                Produto produto = new Produto ( nome, quantidade, preco );
                lista.add( produto );
            }

            System.out.print("Relatório do Produto: ");
            for ( Produto produto  : lista ) {
                System.out.println( produto );
            }
        } catch ( IOException e ){
            System.out.print("Erro ao ler o arquivo." + e.getMessage());
        }
    }
}
