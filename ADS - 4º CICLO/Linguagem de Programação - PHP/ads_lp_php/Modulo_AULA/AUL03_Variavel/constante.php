<?php
    /*
     # VARIÁVEL - CONSTANTES
      Uma variável constante ocupa espaço na memória nomeado cujo valor ( conteúdo ) 
      não se altera durante a execução do código, diferenciando-se de um valor cujo 
      pode ser alterado ao longo do código 
    */ 

    echo 'EXEMPLOS <p>';

    # EXEMPLOS 
    // definição de TAXA de 50%
    define("TAXA", 0.5 );

    // definição de JUROS de 1%
    define("JUROS", 0.01 );

    // utilizando CONSTANTES
    echo 'VALOR ( TAXA ): ' . TAXA . '% <br>';
    echo 'JUROS ADICIONAIS: ' . JUROS . 'R$'; 

?>