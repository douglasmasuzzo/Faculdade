package modificacaoClasses;

public class Main{
    public static void main(String[] agrs){
        Caneta caneta = new Caneta();

        caneta.setModelo( "FabreCastelo ");
        caneta.setCor( " Azul ");
        caneta.setPonta( 1.5 );
        caneta.setCarga( 1 );
        caneta.setTampada( true );

        System.out.println("MODELO: " + caneta.getModelo() );
        System.out.println("COR: " + caneta.getCor() );
        System.out.println("ESPESSURA: " + caneta.getPonta() );
        System.out.println("QUANTIDADE DE TINTA: " + caneta.getCarga() + "\n" );

        caneta.Rabiscar();

        System.out.println("\nVERIFICAÇÃO DE TAMPA ");
        System.out.println("Está tampada? " + caneta.isTampada() );
        caneta.VerificarTampa();
        System.out.println("APÓS VERIFICAR: ");
        System.out.print("Está tampada? " + caneta.isTampada() );
    }
}