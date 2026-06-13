# ENG. DE SOFTWARE - AULA01 # 

--------------------------------

## Descrição ##
 
 ### _Arquitetura de Software_ ###
  
  - A primeira menção sobre a arquitetura de software foi realizada na década de 1960, através de um relatório intitulado : [Técnicas de Engenharia de Software](../Conteúdo/Técnicas%20-%20Engenharia%20de%20Software.pdf)

  - Possível modelo arquitetrial aplicado em sala: [Centro de Arquitetura Azure](https://learn.microsoft.com/pt-br/azure/architecture/)

 
 ### _Descrição : O que é Arquitetura de Sofwtare (Citações)_ ###

 > "A arquitetura de um sistema é um arcabouço abrangente que descreve sua forma e estrutura, seus componenets e como se articulam" - **Jerrold Grochow**

 > "Uma arquitetura de um software, primeiramente, tem que projetar a mistura equilibrada de recursos para apoiar a realização de objetivos de negócio, e, precisa usar uma combinação ótima de tecnologias de implementação sobre hardware / software / operações. Uma boa arquitetura de software pode ser reconhecida quando os objetivos de negócio são cumpridas pela funcionalidade entregue, dentro do tempo estimado e o custo estipulado" - **Nelu Suciu**

 > A arquitetura no Processo e Desenvolvimento de Sistemas têm de ser tão simples quanto possível, a fim de suportar o teste de tempo. "A arquitetura de software são os blocos de construção ou componentes de software, a sua definição, e como esses componentes são ligados entre si e suas interações" - **Philip Lew**

 > "Conjunto de elementos arquiteturais que possuem alguma organização. Os elementos e sua organização são definidos por decisões tomadas para satisfazer objetivos e restrições" - **Dewayne Perry, Alexander Wolf**

 `` Arquitetura = { Elemento*, Organização**, Decisões } ``
   
  - | **Elementos** | **Organização** |
    | - | - |
    | *Elemento de Dados / Processamento / Conexão | **Relacionamento entre elementos arquiteturais 

  - _**Padrão Gof ( Gang of Four - 1983 )**_ 

  ### _Padrão de Arquitetura - **ISO** ( Internation Organization Standardization )_ 
   
   > " **A arquitetura é a organização fundamental de um sistema incorporada em seus componentes, seus relacionamentos com o ambiente, e os princípios que conduzem seu design e evolução** "  

  - **VANTAGENS**
    + Tratamento de qualidade so sistema
    + Guia de consenso
    + Apoio ao processo de planejamento
    + Preservação da integridade de módulos do sistema
    + Auxílio à gerência devido à complexidade
    + Reuso em larga escala

  ### _Modelos Arquiteturais_ ###

   > " **Os modelos arquiteturais são utilizados para representar diferentes visões de arquitetura. Estes modelos podem representar um subconjunto de elementos arquiteturais ( decomposição em módulos ) ou uma visão específica que contemple apenas determinado tipo de elemento ( voltada à estrutura ou comportamento de software )** "

  ### _Papel : Arquiteto de Software_ ###

   > " **O papel do arquiteto é liderar e coordenar as atividades e os artefatos técnicos no decorrer do projeto. O profissional estabelece a estrutura geral de cada visão de arquitetura: a decomposição da visão, o agrupamento dos elementos e as interfaces entre principais agrupamentos. Portanto, comparado aos demais perfís, a visão do arquiteto de software é ampla, e não detalhada** "

   > "O arquiteto de software tem de ser capaz de planejar, documentar e decidir quais tecnologias estarão envolvidas na concepção do software ( incluindo ferramentas tecnológicas ), juntamente com a infraestrutura ( micro/macro serviços ) para abrigar e processar o software" - **Eduardo Spaki**

  - VISÕES DA ARQUITETURA
    + Casos de Uso
    + Visão de Projeto ( estrutura do sistema ) 
    + Visão de processo ( comportamento do sistema )
    + Visão da implementação e teste ( construção do sistema | tecnologias )
    + Visão de implantação ( implatanção e funcionamento do sistema ) 

  ### _Desenvolvimento de Software_ ###

  - **COMPLEXIDADE**
    + Entidade abstrata, composto de partes independentes, complexo no entendimento, exige competências diferentes entre cada membro da equipe 

  - **CONFORMIDADE**
    + O projeto deve atender as expectativas de clientes exigentes, cumprindo prazos, estimativas de custos e níveis de qualidade
  
  - **MUTUABILIDADE**
    + O software está em constante mudança. Interesses mudam, objetivos são trocados e por isso o projeto deve estar pronto para evoluir com o menor impacto possível. Projete pensando no futuro, pois logo você estará nele

  - **INVISIBILIDADE** 
    + A necessidade de modelos de representação simples e eficiente é a prioridade para indústria do software, facilitando o entendimento entre partes envolvidas

  ### _Procesos de Projeto de Arquitetura_

   > " O processo de projeto de arquitetura envolve o estabelecimento de um 'framework' básico que identifica os principais componentes do sistema e as comunicações entre eles "

   > " Os sistemas são decompostos em subsistemas relacionados. O processo inicial do projeto, que consiste em identificar essas subsistemas e estabelecer um framework para controle e comunicação é denominado como **PROJETO DE ARQUITETURA** "

  - **DOCUMENTOS**
    + DOCUMENTO DE PROJETO DE ARQUITETURA DE SOFTWARE 
      + DOCUMENTO DE ARQUITETURA / DOCUMENTO DE PROCESSO

  ### _Estilo de Arquitetura_ ###

   > "O projeto de arquitetura de software de um sistema afeta o desempenho, a manutenção e a distribuição do sistema" - **Jan Bosch**

  - **DESEMPENHO**
    + Requisito crítico, a arquitetura deve ser protegida para lcoalizar operações críticas e priorizá-las

  - **PROTEÇÃO**
    + Uma estrutura em camadas para arquitetura deve ser utilizada, com os itens mais críticos protegidos por camadas mais internas

  - **SEGURANÇA**
    + Todas as operações de segurança devem ser localizadas em um único subsistema, isto reduz custo, reduz problemas com validação de segurança e torna possível fornecer serviços à sistemas de proteção relacionados

  - **DISPONIBILIDADE**
    + A arquitetura deve ser projetada para incluir componentes redundantes, e assim ser possível substituir ou reparar o sistema, sem a necessidade de parar o sistema. Normalmente sistemas que devem ser tolerantes a defeitos e terem alta disponibilidade

  - **MANUTENÇÃO E DISTRIBUIÇÃO**
    + A arquitetura deve ser projetada usando componentes de baixa granularidade e auto contidos, que possam ser modificados sem afetar os demais

  - **RESTRIÇÕES DE ARQUITETURA**
    - ESCOPO
    - PRAZO
    - CUSTO
    - QUANTIDADE

### _Referência Bibliográfica_ ###

- _Roger Pressman_
    - **Software Engineering: A Practitioner's Approach**

- _Ian Sommerville_
  - **Engenharia de Software : 8º Edição**

- RUP
  - **Rational Unified Process**

------------------------------------------------

### _Questões - TP_ ###

  1. _O que é arquitetura de software segundo o padrão ISO/IEEE? (1 Ponto)_ 
      > Resposta : **A organização fundamental de um sistema, incorporada em seus  componentes e seus relacionamento**

  2. _Quais são os dois propósitos principais da arquitetura de software segundo o  Software Engineering Institute? (1 Ponto)_
      > Resposta : **Projetar recursos para objetivos de negócio e usar tecnologias de implementação**

  3. _Qual a diferença entre arquitetura de software e design de software? (1 ponto)_
      > Resposta : **A arquitetura define a estrutura geral e o design detalha a  implementação dos componentes**

  4. _Cite uma vantagem de documentar a arquitetura de software (1 ponto)_
      > Resposta : **Facilita a comunicação entre a equipe.**

  5. _O que é um modelo na arquitetura de software?Requer resposta. (1 Ponto)_
      > Resposta : **Uma abstração semântica que representa uma simplificação da  realidade**

  6. _6.Quais são os tipos de modelos utilizados na arquitetura de software? (1 Ponto)_
      > Resposta : **Modelos estruturais e modelos comportamentais**

  7. _O que é uma visão na arquitetura de software? (1 Ponto)_
      > Resposta : **Parte do modelo voltado para um único aspecto do sistema**

  8. _.Qual é o objetivo da visualização de casos de uso na arquitetura 4+1? (1 Ponto)_
      > Resposta : **Descrever tarefas e encadeamentos**

  9. _Qual é o foco da visualização lógica na arquitetura 4+1? ( 1 ponto )_
      > Resposta : **Compreensão da estrutura e organização do design do sistema**

  10. _O que é arquitetura de referência? (1 Ponto)_
      > Resposta : **Um padrão predefinido testado em contextos específicos**