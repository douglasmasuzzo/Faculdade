package manipulacaoArquivos;
import java.io.File; // criar arquivo
import java.io.FileNotFoundException; // alerta de excessão caso não encontrar o arquivo
import java.util.Scanner; // uso da entrada de dados

public class Main{
    public static void main(String[] args){
        File arquivoCSV = new File("C:\\Users\\masuz\\IdeaProjects\\Exercicio - JAVA\\ProvaRecuperacao\\src\\manipulaçãoArquivo\\ocupa.txt");
        // criação do arquivo + o caminho ( path ) onde está localizado
        try {
            String linhaArquivo = "";
            Scanner sc = new Scanner( arquivoCSV );

            while ( sc.hasNext() ) {
                // enquanto o texto tiver linhas, ele...
                linhaArquivo = sc.nextLine();
                // lê a próxima linha
                System.out.println( linhaArquivo );
                // exibindo a quantidade final de conteúdo no arquivo
            }

        } catch ( FileNotFoundException e){
            // caso não haja texto ou exista um arquivo, ele informa:
            System.out.print("Documento não encontrado" + e.getMessage() );
        }
    }
}

// o código acima lista o conteúdo existente em um arquivo.txt ( ou .csv )