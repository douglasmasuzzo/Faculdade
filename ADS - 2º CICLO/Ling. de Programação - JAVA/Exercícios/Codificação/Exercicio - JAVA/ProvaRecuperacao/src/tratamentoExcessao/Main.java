package tratamentoExcessao;

public class Main{
    public static void main(String[] args) throws Exception{

        try{
            System.out.println("Mensgaem pré excessão");
//            int dividir = 10 / 0;
            System.out.println("Mensagem após a excessão");
        } catch ( Exception erro ) {
            System.out.print("Erro: " + erro.getMessage());
        } finally {
            System.out.println("funcionou");
        }

        System.out.print("vtnc todo mundo");
    }
}