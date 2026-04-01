package atividades;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EXE006{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o local do diretório: ");
        String caminho = sc.nextLine();

        System.out.print("Informe o nome do arquivo: ");
        String nome = sc.nextLine();

        File arquivo = new File ( caminho , nome );

        if ( !arquivo.exists() ){
            System.out.print("O arquivo não foi encontrado no diretório");
        } else {
            try {
                Scanner leitor = new Scanner( arquivo );
                int contPalavras = 0;

                while ( leitor.hasNext() ){
                    leitor.next();
                    contPalavras++;
                }

                System.out.print("O arquivo contém: " + contPalavras + " palavras.");
                leitor.close();
            } catch ( FileNotFoundException e ) {
                System.out.print("Error: Arquivo não encontrado");
            }

            sc.close();
        }
    }
}