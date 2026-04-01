public class exe_006 {
    public static void main(String[] args){
        int segundo = 16487;
        System.out.printf("%d horas, %d minutos e %d segundos%n",
            calcularHoras(segundo),
            calcularMinutos(segundo),
            calcularSegundos(segundo));
    }

    public static int calcularHoras( int segundos ) {
        return segundos / 3600;
    }

    public static int calcularMinutos( int segundos ) {
        return ( segundos % 3600 ) / 60;
    }

    public static int calcularSegundos( int segundos ) {
        return segundos % 60;
    }
}
