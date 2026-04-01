public class exe_005 {
    public static int somarNumeros ( int A, int B ){
        int primeiroNumero = Math.min( A , B );
        int segundoNumero = Math.max ( A, B );
        int soma = 0;
        String processo = "";

        for ( int i = primeiroNumero + 1 ; i < segundoNumero; i++ ){
            soma += i ;
            processo += i + (i < segundoNumero - 1 ? " + " : "");
        }
        System.out.println("A operação entre os números: " + processo + " = " + soma);
        return soma;
    }

    public static void main(String[] args){
        System.out.print("Resultado Final: " + somarNumeros(15,10));
    }
}
