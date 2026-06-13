<?php
    /*
        ## FORMATAÇÃO DE VARIÁVEIS ##
        
         + FORMATAÇÃO 
          - number_format()

         + REFERÊNCIA
          - W3SCHOOL = https://www.w3schools.com/php/func_string_number_format.asp
    */

    echo 'FORMATAÇÃO DE VARIÁVEL <br><br>';

    // definição da variável
     $var = 85.7;

    // apresentação sem formatação
     echo 'EXIBIÇÃO SEM FORMATAÇÃO <br>';
     echo "VALOR : $var "; print '<br>';
     
     // informação da variável
     echo "INFORMAÇÕES DESCRITIVAS DA VARIÁVEL: | "; var_dump( $var ); print '<br><br>';    
     
     // apresentação com formatação
      echo 'EXIBIÇÃO COM FORMATAÇÃO <br>';
      $format = number_format($var,2,',','.');
      echo "VALOR ATUALIZADO : $format "; print '<br>';
      
      // verificação do tipo de variável e a formatação
      echo "INFORMAÇÕES ATUALIZADA DA VARIÁVEL: | "; var_dump( $format );

?>