<?php
    $X = 10;
    $Y = 20;

    $soma = 10 + ( ++$X );
    $subs = $soma - ( $Y-- );

    echo "VALOR X : " . $X . "<br>";
    echo "VALOR Y : " . $Y . "<br>";
    echo "SOMA : " . $soma . '<br>';
    echo "SUBS : " . $subs . '<br>';
?>