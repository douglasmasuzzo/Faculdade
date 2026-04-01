package atividades;
import java.io.File;
import java.util.Scanner;

public class EXE004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o local do diretório: ");
        String caminho = sc.nextLine();

        System.out.print("Informe o nome do arquivo: ");
        String nome = sc.nextLine();

        System.out.print("Renomeie o arquivo: ");
        String renome = sc.nextLine();

        File arquivoAntigo = new File( caminho, nome );
        File arquivoNovo = new File( caminho, renome );

        if ( arquivoAntigo.renameTo( arquivoNovo )){
            System.out.print("Arquivo renomeado com sucesso");
        } else {
            System.out.print("Erro. Tente novamente");
        }
        sc.close();
    }
}
