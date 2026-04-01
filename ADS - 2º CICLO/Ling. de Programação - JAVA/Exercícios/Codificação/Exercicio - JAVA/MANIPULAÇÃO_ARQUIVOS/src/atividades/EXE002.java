package atividades;
import java.io.File;

public class EXE002{
    public static void main(String[] args){

        File pasta = new File("C:\\Users\\masuz\\LP - ARQUIVOS TESTES");
        if ( pasta.exists() && pasta.isDirectory() ){
            String arquivos[] = pasta.list();

            if ( arquivos != null && arquivos.length > 0 ){
                System.out.print("Arquivo encontrado\n");
                for ( String arquivo : arquivos ) {
                    System.out.print("\n" + arquivo);
                }
            } else{
                System.out.print("O diretório está vazio");
            }
        } else {
            System.out.print("O diretório não existe");
        }
    }
}