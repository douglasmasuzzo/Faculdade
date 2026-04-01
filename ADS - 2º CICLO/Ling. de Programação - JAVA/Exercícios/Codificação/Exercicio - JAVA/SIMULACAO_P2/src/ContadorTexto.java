import java.io.*;

public class ContadorTexto {
    public static void main(String[] args){
        String nomeArquivo = "texto.txt";
        int totalLinhas = 0;
        int totalPalavras = 0;

        try ( BufferedReader br = new BufferedReader ( new FileReader ( nomeArquivo ) ) ){
            String linha;
            while ( ( linha = br.readLine() ) != null ){
                totalLinhas++;
                totalPalavras+= linha.trim().split("\\s+").length;
            }

            double mediaPalavras =  ( totalLinhas > 0 ) ? ( double ) totalPalavras / totalLinhas : 0;
            System.out.print("Total de Linhas: " + totalLinhas );
            System.out.printf("Média de palavras por linhas: %.2f\n", mediaPalavras);
        } catch ( IOException e ){
            System.out.print("Erro ao acessar o arquivo: " + e.getMessage());
        }
    }
}
