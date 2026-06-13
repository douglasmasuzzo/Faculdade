<?php
    // Exemplo - Construção de uma Class Humano
    class Humano {
        # Criando propriedades
        public $tipo = "Funcionário(a)";
        public $nome = "Mari";

        # Criando métodos
        public function nomeTipo(){
            return $this -> tipo . ' ' . $this -> nome ;
        }
    } 

    $homem = new Humano(); echo $homem -> nomeTipo(); echo "<hr>";

    # Exemplo 2 - Criando um objeto "homem" a partir da classe Humano.
    class Humano2 {
        # Atributos 
        private $nome; private $tipo;

        # Método Construct
        // é chamado automaticamente no momento em que um objeto da classe é criado

        function __construct( $name , $type ){
            $this -> nome = $name;
            $this -> tipo = $type;
        }

        # Método público, pode se chamado por um código 
        public function codeName(){
            return $this -> nome . ' ' . $this -> tipo;
        }

    }

    $homem = new Humano2( 'Agda', 'Funcionária' );
    echo $homem -> codeName(); echo ( "<br>" );
?>