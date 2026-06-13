<?php
    ## OPERADOR TERNÁRIO ##
    // Esta operação pode substituir uma estrutura condicional ( simples )

    ## REFERÊNCIA : ( w3schools )

    // O operador funciona em três passos
     // 1. Expressão lógica a ser verificada
            // caso for verdadeira, o código executará "true", caso contrário, resultará em "false" 
     // 2. código a ser executado ( resulta em true )
     // 3. código a ser executado ( resulta em false )

    // Exemplo 
    $opcao = 0;
    $nome = $opcao == 1 ? "João" : "Maria";
    echo "NOME: " . $nome . "<br>";
?>

<!-- Linha de comentário de HTML e Operador Ternário -->
 <h4> <?= $opcao == 1 ? 'Sim' : 'Não' ?></h4>

<!-- Linha de controle em CSS -->
 <h4 style="color:<?= $opcao == 0 ? 'Red' : 'Blue' ?>">Teste - Operador Ternário</h4>