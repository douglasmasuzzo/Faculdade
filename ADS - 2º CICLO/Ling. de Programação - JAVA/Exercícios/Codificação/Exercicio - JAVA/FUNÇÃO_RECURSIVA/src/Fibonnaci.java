public class Fibonnaci {

    public static int fibonnaci ( int num ) {
        if ( num <= 0 ) {
            return num;
        } else {
            return fibonnaci( num - 1 ) + fibonnaci ( num - 2 );
        }
    }

    public static void main(String[] args){
        int num = 7;
        System.out.print("O " + num + "º número de Fibonnaci é " + fibonnaci(num));
    }
}
