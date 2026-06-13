<?php
    // OPERADORES DE COMPARAÇÃO : IGUALDADE //
    # "O que faz Operador de Comparação entre valores?"
    # Verificam igualdades, diferenças, maior, menor ou de mesmo tipo.
    # O resultado da comparação sempre será um "booleano" ( false | true ).
    # Referência - w3schoo
    # https://www.w3schools.com/php/php_operators.asp
    
    // OPERADORES DE IGUALDADE
    # 1. Exemplo ( FALSO )
     $a = ( 2 == 3 ); 

    # 2. Exemplo ( VERDADEIRO )
     $a = ( 100 == 100 );

    # 3. Exemplo ( FALSO )
     $a = ( 50 == '50' );

    # O exemplo acima ( 3º Exemplo ) o símbolo de comparação ( "=" )
    # realiza a verificação é realizada com o valor da variável e do tipo de dados.
     $a = ( 50 === '50' ); # ( false )

    # No final, a verificação do valor binário é oculto
     echo $a; echo "<br>";
    
    # Então, temos que testar o conteúdo de '$a'
        if( $a ){
            echo "TRUE";
            echo "<br>";
        } else {
            echo "FALSE";
            echo "<br>";
        }

    ## ================================================================ ##

    print("==========================================================");

    // OPERADORES DE COMPARAÇÃO : DIFERENÇA //
    
    # 1. Exemplo ( TRUE )
     $a = ( 2 != 3 );  

    # 2. Exemplo - Forma Alternativa ( FALSE ) 
     $a = ( 100 <> 100 );

    # 3. Exemplo ( FALSE )
     $a = ( 50 != 50 ); 

    # 4. Exemplo ( FALSE )
    # O codigo avalia apenas os valores e não os tipos de variáveis definidas
     $a = ( 50 != '50' );

    # 5. Exemplo ( TRUE )
    # A avaliação do tipo de dado
     $a = ( 50 !== '50' );

    // RESUMINDO
    # Os operadores com 3 símbolos, comparando os valores e os tipos
    # " == " ( IGUALDADE )
    # " <> " ( DIFERENÇA )
    # " === " ( IGUALDADE )
    # " != " ( DIFERENÇA )
    # " !== " ( DIFERENÇA )

?>