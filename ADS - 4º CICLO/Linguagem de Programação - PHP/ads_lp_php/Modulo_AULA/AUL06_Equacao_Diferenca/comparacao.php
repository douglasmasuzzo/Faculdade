<?php
    // OPERADOR DE COMPARAÇÕES : MAIOR / MENOR IGUAL

    # 1. Exemplo 
     $a = ( 2 > 3 ); ## ( FALSE )
     $a = ( 2 < 3 ); ## ( TRUE )
     $a = ( 2 >= 3 ); ## ( FALSE )
     $a = ( 2 <= 3 ); ## ( TRUE )

    // ======================================

    // OPERADOR DE COMPARAÇÕES : TIE FIGHTER 
    # É o "Tie Fighter" do 'Star Wars'. ( <=> )
    # Esse operador retorna 3 valores possíveis: [ 0, 1, -1 ]
    
    # 1. Exemplo
     $x = 1 <=> 1;
     // Retorna 0 -> Valores Iguais / Equivalente a: ( 1 == 1 )

    # 2. Exemplo
     $x = 3 <=> 2;
     // Retorna 1 -> Quando o valor da esquerda for maior que o da direita / Equivalente a: ( 3 > 2 )

    # 3. Exemplo
     $X = 1 <=> 2;
     // Retorna -1
     // Quando o valor da direita for menor do que a direita / Equivalente a : ( 1 < 2 )

    // =========================================
    
    // OPERADORES LÓGICOS
    ## Permite interligar várias comparações, criando uma lógica elaborada de comparação, utilizando os operadores de comparação ( preposições )
    
    # 1. Exemplo
    $a = 100; $b = 200;
    
    # 2. Exemplo ( FALSE )
     $y = ( $a <= $b ) && ( $b < 100 );
     
     # 3. Exemplo ( TRUE )
     $y = ( $a < $b ) || ( $a < 100 );
     
     # 4. Exemplo ( TRUE ) 
     $y = ( $a < 150 ) && ( $b == 200 );
     
     # 5. Exemplo ( FALSE )
     $y = ( $a > 300 ) || ( $b > 500 ); 
     
    // =========================================

?>