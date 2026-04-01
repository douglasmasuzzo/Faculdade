public class CalculadoraFibonnaci {

    public int calcular ( int num ) {
        if ( num <= 1 ) {
            return num;
        } else {
            return calcular( num - 1 ) + calcular ( num - 2 );
        }
    }

    public void imprimirSequencia( int termos ) {
        for ( int i = 0; i < termos; i++ ){
            System.out.print( calcular(i) + " " );
        }
    }

//    public static void main(String[] args){
//        int num = 7;
//        System.out.print("O " + num + "º número de Fibonnaci é " + calcular(num));
//    }
}
