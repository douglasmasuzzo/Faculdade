package atividades;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EXE003{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o local do diretório: ");
        String caminho = sc.nextLine();

        System.out.print("Selecione o nome do arquivo: ");
        String nome  = sc.nextLine();

        File diretorio = new File ( caminho );

        if ( !diretorio.exists() ){
            System.out.print("O diretório não existe. Crie um.");
            diretorio.mkdirs();
        }

        File arquivo = new File ( diretorio , nome );

        try{
            if ( arquivo.createNewFile() ){
                System.out.print("Arquivo criado: " + arquivo.getAbsolutePath() );
            } else {
                System.out.print("O arquivo é existente: " + arquivo.getAbsolutePath() );
            }
        } catch ( IOException e ) {
            System.out.print("Error: Não foi possível criar o arquivo.");
            e.printStackTrace();
        }
        sc.close();
    }
}