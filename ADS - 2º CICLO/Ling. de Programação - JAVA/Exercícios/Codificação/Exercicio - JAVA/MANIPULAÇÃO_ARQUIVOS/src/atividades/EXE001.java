package atividades;
import java.io.File;
import java.util.Scanner;

public class EXE001{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o local do diretório: ");
        String nomeDir = sc.nextLine();
        File dir = new File(nomeDir);

        if ( dir.exists() && dir.isDirectory() ){
            System.out.print("O diretório foi criado com sucesso!");
        } else {
            System.out.print("O diretório não foi encontrado, tente novamente.");
        }

        sc.close();
    }
}