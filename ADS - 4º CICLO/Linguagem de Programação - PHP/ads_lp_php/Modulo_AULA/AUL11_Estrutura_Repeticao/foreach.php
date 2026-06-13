<?php
    // Loops (Ciclos) 

    # Exemplo 1
    echo "Exemplo 1 <br>";
    $nomes = ['Mari', 'Agda', 'Lena'];
    foreach($nomes as $nome) {
        echo $nome . "<br>";
    }
    echo "<hr>";
    # Observe que no exemplo 1, não foi necessário o uso
    # de uma variável incremental. Pois, o ciclo considera
    # o tamanho do 'array' e seque de modo automático de
    # forma sequencial para cada um dos elementos do 'array'.

    # Exemplo 2
    # Com valores numérico
    echo "Exemplo 2 <br>";
    $x = [1,3,4];
    foreach($x as $y) {
        echo $y . "<br>";
    }
    echo "<hr>";

    # Exemplo 3
    # Assinatura alternativa no uso do 'foreach'
    echo "Exemplo 3 <br>";
    $EstadoCapital = [
        'Acre' => 'Rio Branco',
        'Amapa' => 'Macapa',
        'Alagoas' => 'Maceio',
        'Ceara' => 'Fortaleza'
    ];
    foreach($EstadoCapital as $chave => $valor) {
        echo "Para o estado $chave a capital é $valor <br>";
    }
    echo "<hr>";

?>