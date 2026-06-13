# ENG. DE SOFTWARE - Arquitetura Big Data e CQRS #
 
--------------------------------
 
## Descrição ##
 
### _Big Data e CQRS – Engenharia de Software III_ ###
 
  - [**Referência de Material : Estilos de Arquitetura – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/)
  - [**Referência de Material : CQRS – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/cqrs)
---
 
## Big Data – Arquitetura de Big Data ##
 
> " **Uma arquitetura de big data é projetada para lidar com entrada, processamento e análise de dados que são muito grandes ou complexos para sistemas de bancos de dados tradicionais** "
 
### _Tipos de Carga de Trabalho em Big Data_ ###
 
  - **Processamento em lote** de fontes de big data em repouso
  - **Processamento em tempo real** de big data em movimento
  - **Exploração interativa** de big data
  - **Análise preditiva e aprendizado de máquina**
---
 
## Componentes da Arquitetura Big Data ##
 
### _Origens de Dados_ ###
 
> " **Todas as soluções de Big Data começam com uma ou mais fontes de dados** "
 
  - **EXEMPLOS:**
    + Armazenamento de dados de aplicativos, como **bancos de dados relacionais**
    + Arquivos estáticos produzidos por aplicativos, como **arquivos de log do servidor da web**
    + Origens de dados em tempo real, como **dispositivos IoT**
### _Armazenamento de Dados_ ###
 
> " **Os dados para operações de processamento em lote normalmente são armazenados em um armazenamento de arquivos distribuído que pode conter grandes volumes de arquivos grandes em vários formatos** "
 
  - Esse tipo de loja é frequentemente chamado de **LAKE STORE**
  - Suporta grandes volumes de arquivos em **vários formatos**
  - Base para o processamento em lote distribuído
### _Processamento em Lote_ ###
 
> " **Como os conjuntos de dados são muito grandes, uma solução de big data deve processar arquivos de dados usando tarefas em lote de longa execução para filtrar, agregar e preparar os dados para análise** "
 
  - As tarefas envolvem:
    + **Leitura** de arquivos de origem
    + **Processamento** dos dados
    + **Gravação** da saída em novos arquivos
### _Ingestão de Mensagens em Tempo Real_ ###
 
> " **Se a solução incluir fontes em tempo real, a arquitetura deve incluir uma maneira de capturar e armazenar mensagens em tempo real para processamento de fluxo** "
 
  - Pode ser um armazenamento de dados simples onde as mensagens recebidas são descartadas em uma pasta para processamento
  - Muitas soluções precisam de um **armazenamento de entrada de mensagens** para atuar como um buffer, suportando:
    + Processamento de expansão
    + Entrega confiável
    + Outras semânticas de enfileiramento de mensagens
### _Processamento de Fluxo_ ###
 
> " **Depois de capturar mensagens em tempo real, a solução deve processá-las filtrando, agregando e preparando os dados para análise** "
 
  - Os dados do fluxo processado são gravados em um **coletor de saída**
  - Opera sobre mensagens capturadas em tempo real
### _Armazenamento de Dados Analíticos_ ###
 
> " **Muitas soluções de Big Data preparam dados para análise e, em seguida, veiculam os dados processados em um formato estruturado que pode ser consultado usando ferramentas analíticas** "
 
  - O armazenamento pode ser um **data warehouse relacional estilo Kimball**, como visto na maioria das soluções tradicionais de business intelligence (BI)
  - Permite consultas estruturadas por ferramentas analíticas
### _Análise e Relatório_ ###
 
> " **O objetivo da maioria das soluções de big data é fornecer insights sobre os dados por meio de análises e relatórios** "
 
  - Para capacitar os usuários a analisar os dados, a arquitetura pode incluir:
    + Uma camada de modelagem de dados, como um **cubo OLAP multidimensional**
    + Um **modelo de dados tabulares**
### _Orquestração_ ###
 
> " **A maioria das soluções de big data consiste em operações de processamento de dados repetidas, encapsuladas em fluxos de trabalho** "
 
  - Transformam dados de origem
  - Movem dados entre várias fontes e coletores
  - Carregam os dados processados em um armazenamento de dados analítico
  - Enviam os resultados diretamente para um relatório ou painel
---
 
## CQRS – Command and Query Responsibility Segregation ##
 
> " **CQRS é um estilo de arquitetura que separa operações de leitura de operações de gravação** "
 
- **Command** – operações de **gravação** (write): atualizam o estado dos dados
- **Query** – operações de **leitura** (read): consultam e retornam dados sem modificar o banco
### _Problema das Arquiteturas Tradicionais_ ###
 
  - Nas arquiteturas tradicionais, o **mesmo modelo de dados é usado para consultar e atualizar** um banco de dados
  - Funciona bem para operações CRUD básicas, mas em aplicativos mais complexos pode se tornar complicado:
    + No lado de **leitura**: o aplicativo pode executar muitas consultas diferentes, retornando DTOs com formas diferentes; o mapeamento de objetos pode se tornar complicado
    + No lado de **gravação**: o modelo pode implementar uma validação complexa e lógica de negócios
  - Cargas de trabalho de leitura e gravação geralmente são **assimétricas**, com diferentes requisitos de desempenho e escalabilidade
### _Como o CQRS Resolve_ ###
 
  - O CQRS separa as leituras e gravações em **modelos separados**, usando:
    + **Comandos** para atualizar dados
    + **Consultas** para ler dados
  - Os comandos devem ser **baseados em tarefas**, em vez de centrados nos dados
  - Os comandos podem ser posicionados em uma **fila para processamento assíncrono**
  - As **consultas nunca modificam o banco de dados** – uma consulta retorna um DTO que não encapsula qualquer conhecimento de domínio
### _Separação Física dos Bancos_ ###
 
  - Para maior isolamento, é possível **separar fisicamente os dados de leitura de dados de gravação**
  - O banco de dados de leitura pode usar seu **próprio esquema de dados, otimizado para consultas** (ex.: views pré-preenchidas)
  - Se os bancos de dados de leitura e gravação separados forem usados, deverão ser mantidos em **sincronia**:
    + Normalmente feito com a **publicação de um evento** pelo modelo de gravação sempre que ele atualiza o banco de dados
    + A atualização do banco e a publicação do evento devem ocorrer em **uma única transação**
  - Podem usar **tipos diferentes de armazenamento** (ex.: banco de gravação relacional e banco de leitura de documentos)
### _CQRS em Microsserviços_ ###
 
  - O CQRS pode ser especialmente útil em uma **arquitetura de microsserviços**
  - Um dos princípios de microsserviços é que **um serviço não pode acessar diretamente o armazenamento de dados do outro serviço**
  - Solução com CQRS:
    + O **Serviço A** grava em um armazenamento de dados e publica um evento
    + O **Serviço B** assina o evento e mantém uma exibição materializada dos dados para leitura
### _Quando Usar o CQRS?_ ###
 
  - **Domínios colaborativos** em que muitos usuários acessem os mesmos dados, especialmente quando as cargas de trabalho de leitura e gravação forem assimétricas
  - O CQRS **não é uma arquitetura de nível superior** que se aplica ao sistema inteiro
  - Aplique o CQRS **somente a subsistemas** onde houver um valor claro na separação de leituras e gravações
### _Benefícios do CQRS_ ###
 
  - **Dimensionamento independente** – Permite que as cargas de trabalho de leitura e gravação sejam dimensionadas de forma independente, resultando em menos contenções de bloqueio
  - **Esquemas de dados otimizados** – O lado de leitura pode usar um esquema otimizado para consultas; o lado de gravação, um esquema otimizado para atualizações
  - **Segurança** – É mais fácil garantir que apenas as entidades do direito de domínio estejam executando gravações nos dados
  - **Separação de preocupações** – Isolar os lados de leitura e gravação resulta em modelos mais flexíveis e sustentáveis; a maior parte da lógica de negócios complexa vai para o modelo de gravação
  - **Consultas mais simples** – Ao armazenar uma exibição materializada no banco de dados de leitura, o aplicativo poderá evitar junções complexas durante as consultas
### _Desafios do CQRS_ ###
 
  - **Complexidade** – A ideia básica é simples, mas pode resultar em um design de aplicativo mais complexo, especialmente se incluir o padrão de Fornecimento de Eventos (Event Sourcing)
  - **Mensagens** – Embora o CQRS não necessite de mensagens, é comum usá-las para comandos de processo e publicar eventos de atualização; o aplicativo deve tratar falhas de mensagem ou mensagens duplicadas
  - **Consistência eventual** – Se os bancos de dados de leitura e de gravação forem separados, os dados de leitura poderão ficar obsoletos
---
 
### _Referência Bibliográfica_ ###
 
- Microsoft
  - **Azure Architecture Guide – Big Data**
  - **Azure Architecture Guide – CQRS**
- [**Referência de Material : Azure Architecture**](https://docs.microsoft.com/pt-br/azure/architecture/)
- [**Referência de Material : CQRS – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/cqrs)
------------------------------------------------
 
### _Questões – TP_ ###
 
  1. _O que é uma arquitetura de Big Data e quais tipos de carga de trabalho ela suporta? (1 Ponto)_
      > Resposta : **É uma arquitetura projetada para lidar com entrada, processamento e análise de dados muito grandes ou complexos para bancos de dados tradicionais. Suporta: processamento em lote, processamento em tempo real, exploração interativa e análise preditiva/machine learning**
  2. _Quais são os componentes da arquitetura Big Data? Descreva cada um. (1 Ponto)_
      > Resposta : **Origens de dados (fontes como BDs relacionais, logs e IoT); Armazenamento de dados (Lake Store distribuído); Processamento em lote (tarefas de longa execução para filtrar e agregar dados); Ingestão em tempo real (captura e buffer de mensagens); Processamento de fluxo (filtragem e agregação em tempo real); Armazenamento analítico (data warehouse para consultas); Análise e relatório (insights via OLAP ou modelos tabulares); Orquestração (fluxos de trabalho que movem e transformam dados)**
  3. _O que é CQRS e qual problema ele resolve? (1 Ponto)_
      > Resposta : **CQRS (Command and Query Responsibility Segregation) é um estilo de arquitetura que separa operações de leitura de operações de gravação. Resolve o problema das arquiteturas tradicionais onde o mesmo modelo de dados é usado para consultar e atualizar, o que se torna complicado em aplicativos complexos com cargas de trabalho assimétricas**
  4. _Quais os benefícios do CQRS? (1 Ponto)_
      > Resposta : **Dimensionamento independente de leitura e gravação, esquemas de dados otimizados para cada operação, maior segurança nas gravações, separação de preocupações resultando em modelos mais sustentáveis, e consultas mais simples com uso de exibições materializadas**
  5. _Quais os desafios do CQRS? (1 Ponto)_
      > Resposta : **Complexidade no design do aplicativo (especialmente com Event Sourcing), necessidade de tratamento de falhas de mensagens e mensagens duplicadas, e consistência eventual quando os bancos de leitura e gravação são separados**
  6. _Como o CQRS se aplica a uma arquitetura de microsserviços? (1 Ponto)_
      > Resposta : **Em microsserviços, um serviço não pode acessar diretamente o armazenamento de dados de outro. O CQRS resolve isso fazendo um serviço gravar e publicar eventos, enquanto outro serviço assina esses eventos e mantém uma exibição materializada para leitura, garantindo isolamento e baixo acoplamento**
  7. _Quando é indicado o uso do CQRS? (1 Ponto)_
      > Resposta : **Em domínios colaborativos onde muitos usuários acessam os mesmos dados com cargas de leitura e gravação assimétricas. Deve ser aplicado somente a subsistemas específicos onde há valor claro na separação, não ao sistema inteiro**
  8. _Quais as principais ferramentas de Big Data das grandes empresas de tecnologia? Cite nome e descrição para: Azure, AWS, Oracle, IBM e Google. (1 Ponto)_
      > Resposta : **Azure: Azure Data Lake Storage (armazenamento), Azure HDInsight (Hadoop/Spark), Azure Stream Analytics (processamento de fluxo), Azure Synapse Analytics (analytics). AWS: Amazon S3 (armazenamento), Amazon EMR (Hadoop/Spark), Amazon Kinesis (streaming), Amazon Redshift (data warehouse). Oracle: Oracle Big Data Service, Oracle Cloud Infrastructure Data Flow. IBM: IBM Watson Studio, IBM Db2 Big SQL, IBM Streams. Google: Google Cloud Storage (armazenamento), Google Dataproc (Hadoop/Spark), Google Pub/Sub (streaming), Google BigQuery (analytics)**