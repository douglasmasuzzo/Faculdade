<?php
    // Exercício - Classe & Herança (Sem uso de Get/Set)
    # O exercício deve utilizar o conceito de programação orientada a objetos,
    # considere uma situação tal qual cada tipo de veículo tenha que utilizar uma classe comum em PHP


    class Veiculo {
        protected $tipo_veiculo; protected $marca; protected $modelo;

        public function __construct ( $tipo_veiculo, $marca , $modelo){
            $this -> tipo_veiculo = $tipo_veiculo;
            $this -> marca = $marca;
            $this -> modelo = $modelo;
        }
    }

    class Carro extends Veiculo {
        private $versao; private $ano_lancamento;

        public function __construct( $tipo_veiculo, $marca, $modelo, $versao, $ano_lancamento ){
            parent :: __construct( $tipo_veiculo, $marca , $modelo );
            $this -> versao = $versao;
            $this -> ano_lancamento = $ano_lancamento;
        }

        public function ExibirCarro(){
            return "TIPO DE VEÍCULO: " . $this -> tipo_veiculo . ' | ' . "MARCA: " . $this -> marca . ' | ' . "MODELO: " . $this -> modelo . ' | ' . "VERSÃO: " . $this -> versao . ' | ' . "ANO DE LANÇAMENTO: " . $this -> ano_lancamento;
        } 
    }


    $veiculo = new Carro('Carro', 'FIAT', 'Argo', 'Subcompacto', 2022 );
    echo $veiculo -> ExibirCarro(); 
?>