package atividades;
import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto com caracteres: ");
        String entradaLetras = sc.nextLine();
        String apenasLetras = limparString( entradaLetras );
        String inversoLetras = inverterString( apenasLetras );

        System.out.println("Mensagem de Origem: " + entradaLetras );
        System.out.println("Limpeza de Letras: " + apenasLetras);
        System.out.print("Inversão: " + inversoLetras);
    }

    public static String limparString( String str ){
        return str.replaceAll("[^a-zA-Z]", "");
    }

    public static String inverterString ( String str ) {
        if ( str.length() <= 1 ) {
            return str;
        } else {
            return inverterString( str. substring(1)) + str.charAt(0);
        }
    }
}
