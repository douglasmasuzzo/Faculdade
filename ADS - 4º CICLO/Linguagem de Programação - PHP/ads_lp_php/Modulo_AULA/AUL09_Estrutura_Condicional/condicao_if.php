<?php
    ## INSTRUÇÃO CONDICIONAL ( IF ) ##
    // Referência : https://www.w3schools.com/php/php_if_else.asp
    
    // Uma instrução condicional é uma instrução de controle de fluxo de acordo com uma condição lógica.
    // A instrução lógica é construída com operadores lógicos

    ## EXEMPLOS - STRING ##
     // exemplo com conjunto de caracteres
        
        echo "EXEMPLO - STRING"; echo '<br>';
        $nome_esporte = 'futebol';

        if ( $nome_esporte == 'futebol' ){
            echo "PALAVRA : " . $nome_esporte . " ( A variável é igual ao valor comparado ) " . '<br>';
        } else {
            print "Palavra não reconhecida.";
        }

    ## EXEMPLO - NUMBERS ##
     // exemplo com valores numéricos 

        echo "============================"; echo '<br>';
        echo "EXEMPLO - NUMÉRICO"; echo "<br>";
        $idade = 30;
        
        if ( $idade <= 18 ){
            echo "IDADE: $idade || ACESSO NEGADO" . '<br>';
        } else {
            echo "IDADE: $idade || ACESSO AUTORIZADO" . '<br>';
        }
        
    ## EXEMPLO - CONDIÇÃO ANINHADA
     // exemplo com variável numérica aninhada
        
        echo "============================"; echo '<br>';
        echo "EXEMPLO - CONDIÇÃO ANINHADA ( IF )"; echo '<br>';
        
        $nota = 7.5;
        
        if ( $nota <= 5.0 ){
            echo "NOTA : $nota || STATUS: REPROVADO '<br>' "; // instrução única ( impressão + '<br>' )
        } else if ( $nota <= 7.5 ){
            echo "NOTA: $nota || STATUS: EM ANÁLISE '<br>' "; // instrução única ( impressão + '<br>' )
        } else {
            echo "NOTA: $nota || STATUS: APROVADO '<br>' "; // instrução única ( impressão + '<br>' ) 
        }
    
    ## EXEMPLO - ESTRUTURA SEM IDENTAÇÃO
    // exemplo com a estrutura condicional sem identação 
    
        echo "============================"; echo '<br>';
        echo "EXEMPLO - ESTRUTURA SEM IDENTAÇÃO '<br>' ";
    
        $valor = 10;
    
        if ( $valor != 10 )
            echo "O RESULTADO NÃO É SEMELHANTE. '<br>' ";
        else 
            echo "RESULTADO: $valor . '<br>' ";

    ## DECLARAÇÃO COM OPERADOR LÓGICO ##
     // exemplo de estrutura condicional com operador lógico

     echo "============================"; echo '<br>';
     echo "DECLARAÇÃO COM OPERADOR LÓGICO '<br>' "; 

        $valor = 20;

        if ( $valor < 10 && $valor > 20 )
            echo "VALOR NÃO IDENTIFICADO '<br>'";
        else 
            echo "VALOR: $valor  '<br>' ";
?>