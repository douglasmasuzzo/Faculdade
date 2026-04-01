package manipulacaoArquivos;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class escreverArquivo {
    public static void main(String[] args){
            try{
                // cria ou sobrescreve o arquivo no caminho indicado
                FileWriter escritor = new FileWriter ("C:\\Users\\masuz\\OneDrive\\Área de Trabalho\\Douglas - FATEC_2024\\ADS - 2º Cíclo\\Ling. de Prog\\Exercícios\\LP - Teste_Arquivos//arquivo.txt");

                // escreve duas linhas de texto no arquivo
                escritor.write("Teste de Aqruivo\r\n ");
                escritor.write("Apredendno a manipular o arquivo");
                escritor.close(); // fecha o escritor, salvando os recursos descritos
                System.out.println("Arquivo criado com sucesso.");

                File arquivo = new File ("C://Users//masuz//OneDrive//Área de Trabalho//Douglas - FATEC_2024//ADS - 2º Cíclo//Ling. de Prog//Exercícios//LP - Teste_Arquivos//arquivo.txt");
                if ( arquivo.exists() ) { // verificação se existe o arquivo
                    // cria um bloco de notas como um arquivo
                    Desktop desk = Desktop.getDesktop();
                    desk.open(arquivo);
                    System.out.println("Arquivo criado com sucesso");
                }

            } catch ( IOException e ){
                // captura e exibe os erros identificados
                System.out.print("Tente novamente");
                e.printStackTrace(); // especifica o tipo de erro encontrado
            }
    }
}
