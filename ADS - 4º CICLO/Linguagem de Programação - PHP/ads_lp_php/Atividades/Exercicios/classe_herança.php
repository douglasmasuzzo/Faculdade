<?php
    // Exercício - Classe & Herança (com Get/Set)
    # O exercício deve utilizar o conceito de programação orientada a objetos,
    # considere uma situação tal qual cada tipo de veículo tenha que utilizar uma classe comum em PHP

    class Veiculo {
        private $tipo_veiculo; private $marca; private $modelo;
        
        public function __construct( $tipo_veiculo = null, $marca = null , $modelo = null ){
            $this -> tipo_veiculo = $tipo_veiculo;
            $this -> marca = $marca;
            $this -> modelo = $modelo;
        }

        public function getTipoVeiculo(){ return $this -> tipo_veiculo; }
        public function getMarca(){ return $this -> marca; }
        public function getModelo(){ return $this -> modelo; }

        public function setTipoVeiculo( $tipo ){ $this -> tipo_veiculo = $tipo; }
        public function setMarca( $marca ){ $this -> marca = $marca; }
        public function setModelo( $modelo ){ $this -> modelo = $modelo; }
    }

    class Carro extends Veiculo {
        private $versao; private $ano;

        public function __construct(){
            parent :: __construct();
        }

        public function getVersao(){ return $this -> versao; }
        public function getAno(){ return $this -> ano; }

        public function setVersao( $versao ){ $this -> versao = $versao; }
        public function setAno( $ano ){ $this -> ano = $ano; }

        public function ExibirCarro(){
            return "TIPO DE VEÍCULO: " . $this -> getTipoVeiculo() . ' | ' . 
                    "MARCA: " . $this -> getMarca() . ' | ' . 
                    "MODELO: " . $this -> getModelo() . ' | ' . 
                    "VERSÃO: " . $this -> getVersao() . ' | ' . 
                    "ANO: " . $this -> getAno();
        }
    }

    $variavel = new Carro();
    $variavel -> setTipoVeiculo("CARRO");
    $variavel -> setMarca("FIAT");
    $variavel -> setModelo("UNO");
    $variavel -> setVersao("QUADRADO COM ESCADA EM CIMA");
    $variavel -> setAno(1999);
    echo $variavel -> ExibirCarro();
?>