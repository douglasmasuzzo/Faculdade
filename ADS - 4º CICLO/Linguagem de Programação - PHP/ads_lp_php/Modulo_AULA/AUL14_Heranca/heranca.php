<?php
    // HERANÇA
    # É uma classe base da qual a partir dela, outras serão criadas por esta classe base
    # Todas as classes derivadas, desta classe base, denominadas classes derivadas.

    // Exemplo
    class baseMamifero{
        public $especie; public $peso;

        function grupoEspecie(){
            return "Este animal é do grupo: { $this -> especie } ";
        }
    }

    // Exemplo - Classe Derivada
    # Aplicando o conceito de herança
    class Euterios extends baseMamifero{
        // Não é preciso redefinir os métodos e os atributos presentes da classe base.
        // Pois todos os elementos (métodos e atributos) já serão criados no objeto 
        // no momento da instanciação
        
        # Adicionando novos atributos e métodos
        public $quantidade_pernas; public $is_pelo;

        function quantidadePernas(){
            return "O animal possui: { $this -> quantidade_pernas } pernas.";
        }
    }

    # Demonstração da instanciação da classe derivada
    $animal = new Euterios(); $animal -> quantidade_pernas = 6; 
    echo "Método da Classe Derivada . '<br>' "; echo $animal -> quantidadePernas(); echo "<br>";

    # Demonstração da instanciação da classe base
    $animal -> especie = "Eutério <br>";
    echo "Método de Classe Base"; echo "<br>"; echo $animal -> grupoEspecie(); echo "<br>";
?>