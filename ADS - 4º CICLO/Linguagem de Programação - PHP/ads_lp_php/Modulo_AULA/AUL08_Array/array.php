<?php
    ## MODELOS DE ARRAYS : NUMÉRICO ##
        $valores = [
            'A' => 20,
            'B' => 10,
            'C' => 30,
            'D' => 40,
            'E' => 50 
        ];

    // DEMONSTRAÇÃO DO CONTEÚDO EM ARRAY ( chave string )
     echo $valores[ 'A' ]; print " || "; echo $valores[ 'D' ]; print ' || '; echo $valores[ 'E' ]; print '<br>';
     
     echo "=============="; print '<br>';

     // ALTERAÇÃO | SOBREPOSIÇÃO DE CONTEÚDO 
        $valores = [
            'A' => 100,
            'B' => 200,
            'C' => 300,
            'D' => 400,
            'E' => 500
        ];
        
     echo $valores[ 'B' ]; print " || "; echo $valores[ 'D' ]; print ' || '; echo $valores[ 'E' ]; print '<br>';
?>  