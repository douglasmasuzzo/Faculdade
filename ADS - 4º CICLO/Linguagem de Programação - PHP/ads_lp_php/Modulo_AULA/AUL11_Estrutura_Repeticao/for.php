<?php
    // Ciclos (Loops) em PHP
    #
    # FOR

    # Este laço permite executar um bloco de código 
    # um determinado número de vezes.

    # Constituie-se de três parâmetros:
    # 1. Valor incial
    # 2. Condição
    # 3. Incremento ou Decremento: Altera o valor do contador

    # Exemplo 1
    # Variável criada e inicializada dentro do laço
    for($x=1; $x < 10; $x++) {
        echo "Exemplo 1 - Valor de x $x <br>";
    }
    echo "<hr>";

    # Exemplo 2 ( Utilizando o exemplo anterior)
    # Simplificação com uma única instrução
    for($x=1; $x < 6; $x++) echo "Exemplo 2 - Valor de x $x <br>";
    echo "<hr>";

    # Exemplo 3
    # Utilizando uma assinatura diferente.
    $y = 1;
    for(; $y < 10; ) {
        echo "Exemplo 3 - Valor de y = $y <br>";
        $y++;
    }
    echo "<hr>";

    # Exemplo 4
    # Utilizando laço for com ARRAY 
    $nomes=['Mari', 'Agda', 'Lena'];
    for($i = 0; $i < sizeof($nomes); $i++) {
        echo "Exemplo 4 - Nome $i = $nomes[$i] <br>";
    }
    echo "<hr>";

    # Exemplo 5
    # Utilizando uma assinatura diferente.
    $y;
    for(; $y < 0; ) {
        echo "Exemplo 3 - Valor de y = $Y <br>";
        $y++;
    }
?>