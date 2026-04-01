package atividades;
import java.io.File;

public class EXE005 {
    public static void main(String[] args){

        File arquivo = new File("C:\\Users\\masuz\\LP - ARQUIVOS TESTES\\NovoArquivo.txt");
        if ( arquivo.exists() ) {
            boolean sucesso = arquivo.delete();
            if ( sucesso ) {
                System.out.print("Arquivo eliminado");
            }
        }
    }
}
