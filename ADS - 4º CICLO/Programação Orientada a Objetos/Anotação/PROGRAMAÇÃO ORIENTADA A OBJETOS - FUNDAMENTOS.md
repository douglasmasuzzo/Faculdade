# **P.O.O - FUNDAMENTOS DE PROGRAMAÇÃO** #

-------------------------------------------------

## Sumário ##
 - Classes
 - Declaração de Classes
 - Variáveis e Funções
 - Instanciação
 - Atributos
 - Métodos
 - Encapsulamento ( P.O )

### _Descrições_ ###
 
 - _Criação de Projeto.java_
    + Digite ```ctrl + shift + P``` e procure a opção de criação de um projeto 'Java'. Escolha uma pasta e nomeie-o, que será utilizado para uma nova pasta.

 - _Declarando Classes_
    + Crie um novo arquivo nomeado 'Pessoa.java'. Repare na palavra reservada entitulada "class" seguida de um nome e um par de chaves para delimitar escopo.

 - _Variáveis e Funções_
    + Variáveis e funções podem ser declaradas dentro do escopo de classe, especificando o estado e comportamento.

 - _Instanciação_
    + A classe 'main' torna a classe executável. A instanciação de objetos de uma classe serve para encarregar funções e métodos de uma diferente classe.

 - _Atributos_
    + São as vairáveis declaradas dentro de objetos, que encarregam valores em um contexto de uma classe. A declaração possui componentes como : Modificador de Acesso, Tipos de Dados e Nomenclatura de Atributos.

 - _Encapsulamento_
    + Pode-se definir um modificador de acesso ao atributo, tornando-o **public ( + )** e **private ( - )**. Os atributos são declarados como private e encapsulados em métodos públicos de acesso ( _getters and setters_ )

    - Método de Leitura ( getters ) : Retorna o tipo de dado do atributo e não recebe nenhum parâmetro

    - Método de Gravação ( setters ) : Recebe um parâmetro de mesmo tipo para sua atribuição e não retorna nada ( void )


### _Questões Práticas_ ###

 1. _Crie um pacote nomeado ( 'br.gov.sp.fatec.pg.oo' ) e crie uma classe nomeada "Data" com respectivos atributos: data / mes / ano ( Integer )_

    ```
        public class Data {
            Integer dia;
            Integer mes;
            Integer ano;
        }
    ```

 2. _Dentro da mesma classe "App.java", implemente um método principal que instancie um objeto nomeado "hoje" com os respectivos atributos, juntamente, com outra instanciação da classe nomeada como "nascimento" com os demais valores_

    ```
        public class App {
            Data hoje = new Data();
            Data nascimento = new Data();

            hoje.dia = 10; hoje.mes = 02; hoje.ano = 2026;
            nascimento.dia = 01; nascimento.mes = 01; nascimento.ano = 4002;
        }
    ```

 3. _Inserido dentro no mesmo pacote / projeto, crie uma classe chamada "Horario", com os respectivos atributos : horas / minutos / segundos ( Integer ). Em seguida, altere o método principal da classe para instanciar um objeto nomeado como 'agora', e instancie um objeto chamado 'intervalo' com os demais atributos_

    ```
        public class Horario {
            Integer horas;
            Integer minutos;
            Integer segundos;
        }

        public class App {
            Horario agora = new Horario();
            Horario intervalo = new Horario();
        }
    ```