# **ENG. DE SOFTWARE - REVISÃO ( ENGENHARIA DE SOFTWARE II )** #

----------------------------------------------------------

## Tópicos ##
 - Linguagem de Modelagem Unificada ( _UML_ )
 - Revisão de Diagramas

## Descrição ##
 As primeiras versões do conceito de modelagem de diagramas foram desenvolvidas por 3 engenheiros

 - **Grady Booch** ( Método Booch )
 - **Ivar Jacobson** ( Object-Oriented Software Engineering - OOSE )
 - **Jim Rumbaugh** ( Object Modeling Technique - OMT ) 



## DOCUMENTAÇÃO BASEADA EM REGULAMENTAÇÕES PADRONIZADAS DE NEGÓCIO ##
  - _Object Management Group - OMG_
    + https://www.omg.org/spec/UML/2.5.1/PDF
    + https://www.omg.org/certification/uml/ 
    + https://www.omg.org/ai/

## ESTRUTURAS - DIAGRAMAS ##

### _SEMÂNTICA COMPORTAMENTAL_ ###
  > **A estrutura de modelagem _comportamental_ da UML fornece a base para a semântica comportamental da UML, refletindo na concepção de termos de mudanças no estado do sistema ( especificadas ) através da modelagem comportamental**

### _SEMÂNTICA ESTRUTURAL_ ###
  > **A estrutura de modelagem _estrutural_ baseia-se na base estrutural para fornecer uma base dos componentes do sistema** 
 
### _Diagramas Estruturais_ ###
  + Diagrama de Classes
  + Diagrama de Objetos
  + Diagrama de Componentes
  + Diagrama de Implementação | Implantação
  + Diagrama de Pacote
  + Diagrama de Estrutura

### _Diagrama Comportamentais_ ###
  + Diagrama de Caso de Uso
  + Diagrama de Estados
  + Diagrama de Atividade

### _Diagrama de Interação_ ###
  + Diagrama de Sequência
  + Diagrama de Interatividade
  + Diagrama de Comunicação / Colaboração
  + Diagrama de Tempo

### _Diagrana de Pacotes / Módulos_ ###
 > **O Diagrama de Pacotes organizam os modelos criados, todos os blocos, casos de uso, classes, componentes, etc...Os diagramas podem ser organizados em pacotes específicos segundo a ferramenta selecionada. O pacote compreender os elementos associados via '_packageElement_' e são importados à um sistema, fornecendo uma capacidade genérica de estruturação e organização da UML.** 

### _Diagrama de Classes_ ###
 > **Um diagrama de classes representa a estrutura dos objetos que compõem o sistema, uma classe 'controla' um objeto com características semelhantes. O modelo também representa a estrutura dos objetos, os níveis de relacionamentos e e a organização dos objetos**

  - Estrutura
   + Nome da Classe
   + Atributo
   + Métodos
   
### _Diagrama de Objetos_ ###
  > **O diagrama de objetos é um complemento do diagrama de classes, do qual apresenta os conteúdos dos atributos dos objetos ( _instâncias_ ) em um determinado momento de execução do sistema**

### _Diagrama de Componentes_ ###
 > **É um diagrama de componentes que exibe, juntamente, os componentes lógicos, componentes físicos e seus respectivos relacionamentos** 
  
### _Diagrama de Implementação | Implantação_ ###
 > **Representa a configuração e arquitetura do sistema em que estão ligados respectivamente com os componentes**

### _Diagrama de Colaboração_ ###
 > **É utilizado para descrever a colaboração interna de classes | interfaces | componentes que cooperam entre si para execução com funcionalidade**

### _Diagrama de Caso de Uso_ ###
  > **Mostra os atores, os casos de uso, os pacotes de casos de uso e os relacionamentos ( CASO DE USO NÃO É REGRA | PROCESSO )**

### _Diagrama de Estados_ ###
  > **Mostra uma transição de estados, que específica as sequências de estados que um objeto pode ter, os eventos e as condições que levam o objeto a atingir estados | ações** 

### _Diagrama de Atividade_ ###
  > **São usados para modelar comportamentos do sistema e a maneira como os comportamentos são relacionados em um fluxo geral do sistema ( com interações de elementos dinâmicos ). Os caminhos lógicos que um processo segue, com base em várias condições, processamento simultâneo, acesso a dados, interrupções e outras distinções de caminhos lógicos.**

### _Diagrama de Sequência_ ###
  > **Determina a sequência de eventos que ocorrem em um determinado processo no eixo vertical, e no eixo horizontal mostra os objetivos envolvidos** 
 
## DIAGRAMA DE INTERATIVIDADE ##
  > **Consiste na fusão do diagrama de atividades e o diagrama de sequência, permitindo que fragmentos de interações sejam combinados em pontos e fluxos de decisões**

### _Diagrama de Comunicação / Colaboração_ ###
  > **Exibe as interações entre elementos em tempo de execução da mesma maneira que um diagrama de sequência. No entanto, são usados para visualizar relacionamentos entre objetos, enquanto Diagramas de Sequência são eficazes para visualizar o processo ao longo do tempo.**
 
### _Diagrama de Tempo_ ###
  > **Define o comportamento de diferentes objetos dentro de uma escala de tempo, fornecendo uma representação visual de objetos com alterações de estado e interação do tempo**