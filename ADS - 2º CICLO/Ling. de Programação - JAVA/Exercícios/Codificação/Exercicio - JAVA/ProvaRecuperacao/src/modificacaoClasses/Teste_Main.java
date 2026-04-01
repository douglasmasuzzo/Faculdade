package modificacaoClasses;

public class Teste_Main {
    public static void main(String[] args){
        Teste_Caneta canetinha = new Teste_Caneta();

        canetinha.setModelo( "BIC" ) ;
        canetinha.setColor( "PRETO" );
        canetinha.setPonta( 0.5 );

        System.out.println("MODELO: " + canetinha.getModelo() );
        System.out.println("COR: " + canetinha.getColor() );
        System.out.print("ESPESSURA: " + canetinha.getPonto() );
    }
}
