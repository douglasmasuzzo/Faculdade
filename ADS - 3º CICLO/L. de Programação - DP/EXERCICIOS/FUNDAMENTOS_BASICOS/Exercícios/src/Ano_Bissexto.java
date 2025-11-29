public class Ano_Bissexto{
    public static void main( String[] args ){
        int ano = 2004;
        String status = ( ano % 4 == 0 ) ? "VOCÊ NASCEU EM UM ANO BISSEXTO! " : "VOCÊ NÃO NASCEU EM UM ANO BISSEXTO! ";
        System.out.println("ANO: " + ano ); System.out.print("STATUS: " + status );
    }
}