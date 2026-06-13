<?php
/*
 ENUNCIADO:
  Desenvolva um script em PHP que identifique e exiba os primeiros 50 números primos.
  O programa deve utilizar uma estrutura de repetição para percorrer os números naturais
  e uma lógica de verificação para confirmar se cada número é divisível apenas por 1
  por ele mesmo. A saída deve ser formatada apresentando a ordem do número encontrado
  (com dois dígitos) e o valor do número primo correspondente.
*/


echo "### IDENTIFICAÇÃO - NÚMEROS PRIMOS ###" . "<br>";
print"==========================================================" . "<br>";

$quantidadeDesejada = 50;
$primosEncontrados = 0;
$numeroAtual = 2;

while ($primosEncontrados < $quantidadeDesejada) {
    
    $ehPrimo = true;

    for ($i = 2; $i * $i <= $numeroAtual; $i++) {
        if ($numeroAtual % $i == 0) {
            $ehPrimo = false;
            break;
        }
    }

    if ($ehPrimo) {
        $primosEncontrados++;
        echo "Nº " . sprintf("%02d", $primosEncontrados) . ": || " . "NÚMERO PRIMO: " . $numeroAtual . "<br>";
    }
    $numeroAtual++;
}
?>