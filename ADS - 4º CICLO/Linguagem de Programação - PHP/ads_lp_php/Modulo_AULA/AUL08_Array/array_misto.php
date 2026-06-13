<?php
    ## MODELO DE ARRAY : ARRAY MISTO ##
        $dados_pessoais = [
            'nome' => "FULANO",
            'sobrenome' => " CICLANO DA SILVA",
            'idade' => 20,
        ];

    // é uma estrutura adaptável, porém, complexa de gerenciar

    // para apresentar o conteúdo presente neste array
    // utile o índice ( index ) nomeado

        echo "NOME COMPLETO: " . $dados_pessoais['nome'] . $dados_pessoais['sobrenome'] . ' || ' . "IDADE: " . $dados_pessoais['idade'] . '<br>';
        echo "=========================================================="; print '<br>'; 

    ## ==================================================== ##

    ## EXERCÍCIO - ARRAY MULTIDIMENSIONAL NUMÉRICO

        $estoque = [
            [ "Martelo" , "Doméstico" , 50.00 ],
            [ "Janela", "Doméstico", 500.00 ],
            [ "Registro", "Elétrico", 150.00 ]
        ];

        echo "ARRAY MULTIDIMENSIONAL NUMÉRICO"; print '<br>';
        echo "PRODUTO : " . $estoque[ 0 ][ 0 ] . " || " . "CATEGORIA: " . $estoque[ 0 ][ 1 ] . " || " . "PREÇO: " . $estoque[ 0 ][ 2 ] . '<br>';


    ## EXERCÍCIO - ARRAY MULTIDIMENSIONAL ASSOCIATIVO

        $empresa = [
            'funcionario1' => [
                'nome' => "FULANO",
                'sexo' => 'M',
                'idade' => 35,
                'cargo' => "Diretor"
            ],

            'funcionario2' => [
                'nome' => "BELTRANA",
                'sexo' => 'F',
                'idade' => 28,
                'cargo' => "Gerente"
            ]
        ];

    // execução do código
        echo "========================================================="; print '<br>';
        echo "NOME: " . $empresa['funcionario1']['nome'] . " || " . "SEXO: " . $empresa['funcionario1']['sexo'] . " || " . "IDADE: " . $empresa['funcionario1']['idade']. ' || ' . "CARGO: " . $empresa['funcionario1']['cargo'] . '<br>';
        echo "NOME: " . $empresa['funcionario2']['nome'] . " || " . "SEXO: " . $empresa['funcionario2']['sexo'] . " || " . "IDADE: " . $empresa['funcionario2']['idade']. ' || ' . "CARGO: " . $empresa['funcionario2']['cargo'] . '<br>';
?>