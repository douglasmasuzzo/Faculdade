<?php
    // FUNÇÕES - RETURN 
    /*
        A declaração return provoca o fim da execução do codigo de uma função
        retornando o contorle de execução para o coodigo que chamou a função
    */

    function apresentar_texto(){
        echo 'este texto é apresentado';
        return;
        echo 'porem este texto nao sera apresentado';

    }

    apresentar_texto();
?>