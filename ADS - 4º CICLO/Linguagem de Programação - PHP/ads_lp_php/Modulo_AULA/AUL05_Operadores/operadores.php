<?php
    /* OPERADORES DE ATRIBUIÇÃO
     + São símbolos que permitem executar operadores matemáticos / lógicos / comparativos
     - EXEMPLO
    */ 
    $variavel = 100;
    echo 'OPERADOR DE ATRIBUIÇÃO' . '<br>'; 
    echo 'VARIÁVEL = ' . $variavel . "<br>";

    // ----------------------------------------------------------

    /*
     OPERADORES ARITMÉTICOS
     + Os operadores aritméticos são utilizados para executar operações matemáticas <br>
    */

    // OPERADORES MÓDULOS
    // Exemplos:  
    print '-----------------------------------------'; print '<BR>';
    echo 'OPERADORES DE MÓDULO' . '<BR>';
    
    $x = 10 % 3;
    print(" 10 % 3 = "); print( $x ); print( "<br>" ); 
    
    $x = 60 % 3;
    print( " 60 % 3 = " ); print( $x ); print( "<br>" );
    
    $x = 30 % 3;
    print(" 30 % 3 = "); print( $x ); print( "<br>" );

    // OPERADOR LÓGICO
    print '-----------------------------------------'; print '<BR>';
    print 'OPERADOR LÓGICO' . '<br>';
    
    $x = 5; 
    if ( $x % 2 == 0 ){
        echo $x; echo " = PAR"; echo '<br>';
    } else {
        echo $x; echo " = IMPAR"; echo '<br>';
        }
        
        // OPERADORE DE ATRIBUIÇÃO COMBINADA 
        # Permitem que alteremos o valor de uma variável, a partir do valor original contindo nesta variável.
        print '-----------------------------------------'; print '<BR>';
        print 'OPERADOR DE ATRIBUIÇÃO COMBINADA' . '<br>';
        $x = 10;

        echo 'VALOR: '. $x . '<br>';
        echo 'SOMA: ' . ($x += 10) . '<br>';
        echo 'SUBTRAÇÃO: ' . ($x -= 5) . '<br>';
        echo 'DIVISÃO: ' .  ($x /= 2) . '<br>';
        echo 'MULTIPLICAÇÃO: ' . ($x *= 2) . '<br>';
        echo 'EXPONENCIAÇÃO: ' . ($x **= 2) . '<br>';
        echo 'RESULTADO = ' . $x . '<br>'; 
?>