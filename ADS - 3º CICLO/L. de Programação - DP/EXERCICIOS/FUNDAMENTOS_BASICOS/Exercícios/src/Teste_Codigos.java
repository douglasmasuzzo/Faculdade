public class Teste_Codigos {
    public static void main( String[] args ){
        int i = 10;
        int x = i++; // RESPOSTA: 10
        int y = ++i; // RESPOSTA: 11
        System.out.println( x ); System.out.print( y );

        /*
            Segundo o conteúdo apresentado em aula, os códigos executados mostram diferentes
            resultados. Primeiramente, o uso do pós-incremento modifica o valor original da variável
            acrescentando um valor adicional que será contabilizado após a execução do código ( i++ ).
            A segunda variável apresenta outro tipo de incremento: o pré-incremento. Neste caso, a variável
            acrescenta o valor adicional enquanto executa o código, exibindo o resultado com o valor contabilizado
            ( ++i ).
        */
    }
}
