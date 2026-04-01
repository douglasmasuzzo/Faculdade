package manipulacaoArquivos;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// Classe responsável por gerar o relatório de produtos
// arquivo de entrada = listaEntrada.csv
// arquivo de saída = listaSaida.csv

public class GerarRelatorio{
    public static void main(String[] args){
        List<DouglasProduto> produtos = new ArrayList<>();

        // leitura do arquivo CSV
        try ( Scanner sc = new Scanner ( new File( "listaEntrada.csv ") ) ){
            // pecorre cada linha do arquivo, dividindo a linha usando a " , " e cria objetos
            // calcula o valor e armaneza

            while ( sc.hasNextLine() ){
                String linha =  sc.nextLine();
                String[] partes = linha.split(",");
                String nome = partes[0];
                int quantidade = Integer.parseInt( partes[1] );
                double preco = Double.parseDouble( partes[2] );

                DouglasProduto produto = new DouglasProduto( nome, quantidade, preco );
                produto.calcularValorTotal();
                produtos.add( produto );
            }
        } catch ( IOException e ) {
            System.out.println("Erro na leitura do arquivo. " + e.getMessage() );
        }

        try ( BufferedWriter BW = new BufferedWriter ( new FileWriter ( "listaSaída.csv" ) ) ){

            // cada produto na lista gera uma linha no formato CSV, incluindo os atributos mencionados anteriormente
            for ( DouglasProduto p : produtos ) {
                BW.write( p.toCSV() );
                BW.newLine();
            }
        } catch ( IOException e ){
            System.out.println("Erro na escrita do arquivo. " + e.getMessage() );
        }
        System.out.print("Arquivo criado com sucesso");
    }
}

