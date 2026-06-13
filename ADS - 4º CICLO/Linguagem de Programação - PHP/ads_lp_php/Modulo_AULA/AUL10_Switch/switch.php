<?php
    ## INSTRUÇÃO CONDICIONAL SWITCH
    // Referência : ( w3schools )

    // Exemplo com String   
    $nome = "IA";

    switch( $nome ){
        case 'ML' :
            echo "PALAVRA: " . $nome . " | A palavra não é a mesma"; print "<br>";
            break; 

        case 'ADS' :
            echo "PALAVRA: " . $nome . " | A palavra não é a mesma"; print "<br>";
            break;

        case 'DSM' :
            echo "PALAVRA: " .  $nome . " | A palavra não é a mesma"; print "<br>";
            break;

        default :
            echo "PALAVRA : " . $nome . " | A palavra é a mesma"; print "<br>";
            break; 
    }


    // Exemplo com valores 
    $valor = 10;

    switch( $valor ){
        case 1 : 
            break;

        case 2 :
            break;

        case 3 :
            break;

        default :
            break;
    }
?>