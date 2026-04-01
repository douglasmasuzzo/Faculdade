package atividades;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EXE007{
    public static void main(String[] args) throws FileNotFoundException , IOException {
        FileReader entrada = null;
        FileWriter saida = null;

        try {
            entrada = new FileReader("C:\\Users\\masuz\\LP - ARQUIVOS TESTES\\Arquivo.txt");
            saida = new FileWriter("C:\\Users\\masuz\\LP - ARQUIVOS TESTES\\Arquivo_Cópia.txt");

            int caractere;
            while ( ( caractere = entrada.read() ) != -1 ){
                saida.write(caractere);
            }
        } catch ( IOException e ){
            e.printStackTrace();
            System.out.print("Erro ao copiar o arquivo.");
        } finally {
            try{
                if ( entrada != null ) {
                entrada.close();
                }
                if ( saida != null ) {
                saida.close();
                }
            } catch ( IOException e ) {
                e.printStackTrace();
                System.out.print("Arquivo copiado com sucesso.");
            }
        }
    }
}