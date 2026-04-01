public class exe_004_2 {
    public static int identificarValores( int numero ){
        return ( numero >= 0 ) ? 1 : 0;
    }

    public static void main(String[] args){
        int num = -5;
        int valorFinal = identificarValores(num);
        System.out.print(valorFinal);
    }
}