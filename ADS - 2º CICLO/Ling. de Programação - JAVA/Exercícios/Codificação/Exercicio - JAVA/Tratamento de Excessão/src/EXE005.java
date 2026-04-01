public class EXE005 {
    public static void main(String[] args) {
        String text = null;

        try {
            System.out.print(text.length());
        } catch( NullPointerException ex ) {
            System.out.print("Erro: Tentativa de acessar o método em objeto nulo");
        }
    }
}
//nullPointerException
