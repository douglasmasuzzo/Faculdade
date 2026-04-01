public class Main{
    public static void main(String[] args){
        CalculadoraFibonnaci cal = new CalculadoraFibonnaci();
        int quant_Termos = 10;

        System.out.println("Sequência " + quant_Termos );

        cal.imprimirSequencia( quant_Termos );
    }
}