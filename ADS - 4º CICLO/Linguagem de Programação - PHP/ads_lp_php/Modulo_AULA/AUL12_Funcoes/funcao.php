<?php
    ## FUNÇÕES E PARÂMETROS - PARTE 1 
    ## Referências: https://www.w3schools.com/php/php_functions.asp

    /*
     É uma assinatura que permite reutilizar a estrutura de um código escrito.
     As funções podem receber parâmetros para modificar o comportamento do código
    */

    ## Exemplo - Comum 
    function AcaoFuncao(){
        echo "Código dentro da função"; echo '<br>';
    }   
    AcaoFuncao();

    /*
     Não há um padrão de nomeclatura, as funções podem ser descritas como CamelCase ou Snake_Case.
     Porém, por definição, estima-se usar a mesma estrutura em todo o código 
    */

    ## Uso de Funções com Parâmetros: São variáveis ou valores inseridos dentro dos parânteses de funções 
    ## Exemplo - Soma
    function AdicaoNumero( $A, $B ){
        echo '--------------------------------' . '<br>'; 
        echo 'VALOR FINAL: ' .  ( $A + $B ) . '<br>';
    }
    AdicaoNumero(10 , 10);
 
    ## Ao final do código da função, a execução do código retorna o comando para qual foi chamado.
    ## Exemplo - Array

    $nome = [ 'FULANO' , 'BELTRANO' , 'CICLANO' ];
        foreach( $nome as $nome ){
            SaudacaoPessoa( $nome );
        }

    function SaudacaoPessoa( $pessoa ){
        echo 'OLÁ ' . $pessoa . '!' . '<br>';
    }
    SaudacaoPessoa( 'ALBERTO ');
?>