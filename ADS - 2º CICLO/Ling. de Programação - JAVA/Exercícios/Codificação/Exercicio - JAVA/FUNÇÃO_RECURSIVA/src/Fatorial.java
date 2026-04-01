public class Fatorial {

    public static int fatorial ( int number ) {
        if ( number <= 1) {
            return number;
        } else {
            return number * fatorial ( number - 1 );
        }
    }

    public static void main(String[] args){
        int number = 5;
        System.out.print("O Fatorial de " + number + " é: " + fatorial ( number ) );
    }
}
