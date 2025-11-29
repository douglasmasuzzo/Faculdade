package Exercicios;

public class Inversao {

    private static String Limpar(String string) {
        return string.replaceAll("[^a-zA-Z]", "");
    }

    private static String InverterReversao(String string) {
        if (string == null || string.length() <= 1) {
            return string;
        }
            return string.charAt(string.length() - 1) + InverterReversao(string.substring(0, string.length() - 1));
    }

    public static String Inverter(){
        String palavra = "ABCD_DCBA.01 ";
        String novapalavra = Limpar( palavra );

        System.out.println("PALAVRA ORIGINAL: " + palavra );
        System.out.println("PALAVRA CORRIDA: " + novapalavra );
        String finalpalavra = Inversao.InverterReversao( novapalavra );
        return finalpalavra;
    }

    public static void main( String[] args ){
        String resultado = Inversao.Inverter();
        System.out.println("PALAVRA INVERTIDA: " + resultado );
    }
}