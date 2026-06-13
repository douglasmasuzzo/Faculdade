# ENG. DE SOFTWARE - Estilos de Decomposição Modular do Sistema #
 
--------------------------------
 
## Descrição ##
 
### _Estilos de Decomposição Modular do Sistema_ ###
 
- Após definir a organização geral do sistema, é necessário decidir como **decompor os subsistemas em módulos**
- Existem **duas estratégias** principais:
  1. **Decomposição Orientada a Objetos (DOO)**
  2. **Pipelining** – Orientado a Funções
---
 
## Decomposição Orientada a Objetos (DOO) ##
 
> " **Um modelo de arquitetura orientada à objetos estrutura um sistema em um conjunto de objetos não firmemente acoplados com interfaces bem definidas** "
 
- Os **objetos chamam serviços** oferecidos por outros objetos
- Este tipo de decomposição está relacionado às **classes de objetos**, seus **atributos** e **operações**
### _Objetivos da DOO_ ###
 
  1. Definir a arquitetura geral da aplicação
  2. Identificar classes de software que serão implementadas
  3. Definir atributos e métodos
### _Passos Preliminares_ ###
 
  1. Dividir o sistema em partes menores
  2. Cada parte deve ser refinada independentemente das demais
  3. Cada parte pode ser compreendida independentemente das demais
### _Tarefas Essenciais_ ###
 
  1. Identificar e definir classes de domínio do problema, métodos e atributos
  2. Introduzir classes persistentes e de implementação ( interface, banco de dados, etc. )
  3. **Utilizar padrões de projeto ( _design patterns_ )**
  4. Utilizar os casos de uso da modelagem
### _Vantagens da DOO_ ###
 
  - | **Vantagem** | **Descrição** |
    | - | - |
    | Controle | Melhor controle dos objetos, que são representações de entidades do mundo real |
    | Manutenção | Facilidade de manutenção, devido os objetos não serem firmemente acoplados |
    | Escalabilidade | Facilidade na evolução do sistema com novos objetos |
    | Reusabilidade | Reutilização das classes por vários módulos do sistema |
### _Desvantagens da DOO_ ###
 
  - Se uma **classe for alterada**, todos os módulos onde essa classe é chamada serão afetados, logo os usuários serão impactados
---
 
## Decomposição Orientada a Funções – Pipelining ##
 
> " **Em um Pipelining orientado à funções ou modelo de fluxo de dados, as transformações funcionais processam suas entradas e produzem suas saídas de forma sequencial, ou paralelamente** "
 
- O **algoritmo ou estrutura** que representará as funcionalidades são decompostos de **cima para baixo ( top-down )**
### _Vantagens do Pipelining_ ###
 
  1. Técnica intuitiva
  2. A evolução do sistema é direta na função
  3. Simples de ser implementada
  4. Inclui sequência de informações
### _Desvantagens do Pipelining_ ###
 
  1. Incompatível com modelos orientados a objeto
  2. Incompatível com modelos orientados a eventos
  3. Dificulta a manutenção e o entendimento
  4. Reusabilidade limitada
  5. Duplicação de código
  6. Acoplamento **"forte"** das funcionalidades do sistema
  7. Entrada e saídas modeladas ( pré-definidas, sequenciais )
  8. Incompatível com interfaces gráficas complexas
---
 
## Modelo de Repositório ##
 
> " **Os sistemas que constituem um sistema devem trocar informações entre si; para trabalharem juntos com eficiência, precisam compartilhar os dados** "
 
- Os dados podem ser mantidos em um **único banco de dados** e acessados por todos os sistemas
- Este modelo é adequado para aplicações onde **um sistema gera dados que são utilizados por outro subsistema**
- **EXEMPLOS DE USO:**
  + Sistemas de informações gerenciais
  + Sistemas de ERP – Enterprise Resource Planning
  + Sistemas de CAD
  + Sistemas de ferramentas Case
### _Vantagens do Modelo de Repositório_ ###
 
  - **Eficiente** ao compartilhar grande quantidade de dados
  - **Centralização** e maior controle dos dados
  - Os sistemas **não precisam "saber"** como os dados produzidos são compartilhados
  - Atividades de **back-up, proteção, controle de acesso e recuperação** de dados são centralizadas
### _Desvantagens do Modelo de Repositório_ ###
 
  - Todos os sistemas devem estar de acordo com o **modelo de dados do repositório**, o que pode afetar o desempenho
  - Pode ser **difícil integrar novos sistemas** às especificações do modelo
  - Os subsistemas podem ter **políticas diferentes** para atividades de back-up, proteção e controle de acesso, e o repositório impõe a mesma política a todos
### _Tipos de Modelos de Repositório – Armazenamento_ ###
 
  - [Tipos de modelos de repositório](https://docs.microsoft.com/pt-br/azure/architecture/guide/technology-choices/data-store-overview)
  - [Critérios para escolher um modelo de armazenamento](https://learn.microsoft.com/pt-br/azure/architecture/guide/technology-choices/data-store-considerations)
---
 
### _Referência Bibliográfica_ ###
 
- _Ian Sommerville_
  - **Engenharia de Software : 8º Edição**
- _Roger Pressman_
  - **Software Engineering: A Practitioner's Approach**
- [**Referência de Material : Arquitetura de Software – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/)
------------------------------------------------
 
### _Questões – TP_ ###
 
  1. _Quais são as duas estratégias de decomposição modular de subsistemas? (1 Ponto)_
      > Resposta : **Decomposição Orientada a Objetos (DOO) e Pipelining orientado a funções**
  2. _O que é a Decomposição Orientada a Objetos? (1 Ponto)_
      > Resposta : **Um modelo arquitetural que estrutura o sistema em um conjunto de objetos não firmemente acoplados, com interfaces bem definidas, onde os objetos chamam serviços de outros objetos**
  3. _Cite duas vantagens da Decomposição Orientada a Objetos. (1 Ponto)_
      > Resposta : **Facilidade de manutenção e reusabilidade das classes por vários módulos do sistema**
  4. _O que é o Pipelining orientado a funções? (1 Ponto)_
      > Resposta : **Um modelo de fluxo de dados onde transformações funcionais processam entradas e produzem saídas de forma sequencial ou paralela, com decomposição top-down**
  5. _Cite duas desvantagens do Pipelining. (1 Ponto)_
      > Resposta : **Incompatibilidade com modelos orientados a objeto e reusabilidade limitada**
  6. _O que é o Modelo de Repositório? (1 Ponto)_
      > Resposta : **Um modelo onde os dados são mantidos em um único banco de dados central, acessado por todos os subsistemas, permitindo o compartilhamento eficiente de informações**
  7. _Cite dois exemplos de sistemas que utilizam o Modelo de Repositório. (1 Ponto)_
      > Resposta : **Sistemas de ERP (Enterprise Resource Planning) e sistemas de informações gerenciais**
  8. _Qual a principal desvantagem do Modelo de Repositório? (1 Ponto)_
      > Resposta : **Todos os sistemas devem estar de acordo com o modelo de dados do repositório, o que pode afetar o desempenho e dificultar a integração de novos sistemas**
  9. _Quais são as tarefas essenciais da Decomposição Orientada a Objetos? (1 Ponto)_
      > Resposta : **Identificar e definir classes de domínio, introduzir classes persistentes de implementação, utilizar design patterns e utilizar os casos de uso da modelagem**
  10. _Por que o Modelo de Repositório centraliza as atividades de back-up e controle de acesso? (1 Ponto)_
      > Resposta : **Porque todos os dados são mantidos em um único banco central, o que permite gerenciar proteção, recuperação e controle de acesso de forma unificada para todos os subsistemas**