<?php
    $lado = 4;
    $base = 3; $altura = 2; 
    $base_maior = 4 ; $base_menor = 2 ; $alt = 3;

    $quadrado = $lado *= $lado; 
    $triangulo = ( $base * $altura ) / 2; 
    $trapezio = ( $base_maior + $base_menor ) * $alt / 2;

    echo 'FORMAS GEOMÉTRICAS' . '<br>';
    echo 'QUADRADO : ' . $quadrado . ' cm' . '<br>';
    echo 'TRIÂNGULO : ' . $triangulo . ' cm' . '<br>';
    echo 'TRAPÉZIO : ' . $trapezio . ' cm' .'<br>';
?>