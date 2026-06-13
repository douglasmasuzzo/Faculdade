<?php
    ## ESTRUTURA DE REPETIÇÃO - DO-WHILE ##

    // declaração de variável
     $x = 1;

    // exemplo de estrutura de repetição ( 1º parte )
     echo "EXEMPLO DE REPETIÇÃO - DO-WHILE" . "<br>";
     do {
        echo "O NÚMERO DE REPETIÇÃO FOI EXIBIDO: " . ( $x++ ) . " vezes " . "<br>";
     } while ( $x <= 10 )

    // exemplo de estrutura de repetição ( 2º parte )
      do echo "O NÚMERO DE REPETIÇÃO FOI EXIBIDO: " . ( $x++ ) . " vezes " . "<br>";
      while( $x <= 10 );
?>