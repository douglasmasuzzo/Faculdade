<?php
    // STRINGS

    # REFERENCIAS
    # 

    # EXPLICAÇÃO
    # Uma 'string' é um conjunto concatenado de caracteres e símbolos alocados em uma váriavel.
    # Pode ser delimitado como 'aspas simples' ou "aspas duplas", lembre-se que para as aspas duplas
    # os nomes das variáveis são reconhecidas como variáveis, quando estivem entre dentro de aspas duplas.
    
    
    # 1. Exemplo
     $a = "STRING"; $b = 'STRING';
     $c = "ISSO É UMA '$a' | '$b' ";

    # 2. Exemplo - Concatenação
     $e = "Esta é uma";
     echo $e . "'" . $c . "'";

    // ==========================================

    // MANIPULAÇÃO DE STRING
    print( "========================================" ); print "<br>";
    
    # 1. Exemplo
    $texto = 'Frase com X caracteres = 28';
    echo $texto[ 0 ];
    echo $texto[ 27 ];
    echo $texto[ 15 ];
    
    // COMPARAÇÃO DE STRINGS
    # Utilizando funções nativas
    print( "========================================" ); print "<br>";
    
    # 1. Exemplo
    $a = 'Maria';
    $b = 'Agda';
    $c = 'Lena';
    
    # COMPARAÇÃO
    $X = ( $a == $b ); # FALSE
    $X = ( $a != $b ); # TRUE
    
    # FUNÇÕES NATIVAS
    # Retorna o número de caracteres
     $texto = 'Frase com X caracteres = 28';

    # Retorna o número de caracteres
     $numero_total = strlen( $texto );
     echo $numero_total; echo "<br>";

    # Retorna parte do textos
     $parte_texto = substr( $texto , 0, 5 ); echo $parte_texto; 

    # Converte todo o texto em letras maíusculas
     $texto_maiuscula = strtoupper( $texto );
     echo $texto_maiuscula; echo '<br>'; 
?>