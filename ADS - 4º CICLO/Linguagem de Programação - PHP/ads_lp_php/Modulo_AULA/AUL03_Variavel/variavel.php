<?php
    # VARIÁVEIS - DEFINIÇÕES
     $nome = "FULANO";
     $idade = 0;
     $peso = 70.5;

    # USO DE VARIÁVEIS
     echo "Nome: $nome <br>";
     echo "Idade: $idade <br>";
     echo 'Peso: ' . $peso . " kg <br>";

    # INFORMAÇÕES DESCRITIVAS SOBRE A VARIÁVEL
     echo 'Informações sobre as variáveis: <br>';
     var_dump( $nome ); print ' | ';
     var_dump( $idade ); print ' | ';
     var_dump( $peso );
?>