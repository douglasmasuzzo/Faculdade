# ENG. DE SOFTWARE - CQRS (Command and Query Responsibility Segregation) #

--------------------------------

## Descrição ##

### _CQRS – Engenharia de Software III_ ###

  - [**Referência de Material : Estilos de Arquitetura – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/)
  - [**Referência de Material : CQRS – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/cqrs)

---

## CQRS – Command and Query Responsibility Segregation ##

> " **CQRS é um estilo de arquitetura que separa operações de leitura de operações de gravação** "

- **Command** – operações de **gravação** (write): atualizam o estado dos dados
- **Query** – operações de **leitura** (read): consultam e retornam dados sem modificar o banco

### _Problema das Arquiteturas Tradicionais_ ###

  - Nas arquiteturas tradicionais, o **mesmo modelo de dados é usado para consultar e atualizar** um banco de dados
  - É simples e funciona bem para operações CRUD básicas, mas em aplicativos mais complexos pode se tornar complicado:
    + No lado de **leitura**: o aplicativo pode executar muitas consultas diferentes, retornando **objetos de transferência de dados (DTOs)** com formas diferentes; o mapeamento de objetos pode se tornar complicado
    + No lado de **gravação**: o modelo pode implementar uma **validação complexa e lógica de negócios**
  - O resultado pode ser um modelo **excessivamente complexo** que faz coisas em excesso
  - Outro problema potencial: cargas de trabalho de leitura e gravação geralmente são **assimétricas**, com **diferentes requisitos de desempenho e escalabilidade**

### _Como o CQRS Resolve_ ###

> " **O CQRS trata desses problemas, separando as leituras e gravações em modelos separados, usando comandos para atualizar dados e consultas para ler dados** "

  - **Comandos:**
    + Devem ser **baseados em tarefas**, em vez de centrados nos dados
    + Podem ser posicionados em uma **fila para processamento assíncrono**, em vez de serem processados de forma síncrona
  - **Consultas:**
    + **Nunca modificam o banco de dados**
    + Uma consulta retorna um **DTO que não encapsula qualquer conhecimento de domínio**

### _Separação Física dos Bancos_ ###

> " **Para maior isolamento, você pode separar fisicamente os dados de leitura de dados de gravação** "

  - O banco de dados de leitura pode usar seu **próprio esquema de dados, otimizado para consultas**
  - Por exemplo, pode armazenar uma **view (visão pré-preenchida sobre os dados em um ou mais armazenamentos de dados)** quando os dados não estiverem idealmente formatados para as operações de consulta necessárias
  - Isso ajuda a suportar consultas eficientes, extração de dados e melhora o desempenho do aplicativo
  - **Sincronização:** Se os bancos de dados de leitura e gravação separados forem usados, deverão ser mantidos em sincronia:
    + Normalmente feito com a **publicação de um evento** pelo modelo de gravação sempre que ele atualiza o banco de dados
    + A atualização do banco e a publicação do evento devem ocorrer em **uma única transação**
  - Podem usar **tipos diferentes de armazenamento de dados** (ex.: banco de dados de gravação relacional e banco de dados de leitura de documentos)

### _CQRS em Microsserviços_ ###

> " **O CQRS pode ser especialmente útil em uma arquitetura de microsserviços** "

  - Um dos princípios de microsserviços é que **um serviço não pode acessar diretamente o armazenamento de dados do outro serviço**
  - Solução com CQRS:
    + O **Serviço A** grava em um armazenamento de dados e publica um evento
    + O **Serviço B** assina o evento e mantém uma **exibição materializada dos dados** para leitura

---

## Quando Usar o CQRS? ##

> " **Aplique o CQRS somente a esses subsistemas onde houver um valor claro na separação de leituras e gravações** "

  - **Domínios colaborativos** em que muitos usuários acessem os mesmos dados, especialmente quando as cargas de trabalho de leitura e gravação forem assimétricas
  - O CQRS **não é uma arquitetura de nível superior** que se aplica ao sistema inteiro
  - Deve ser aplicado **somente a subsistemas específicos** onde houver um valor claro na separação

---

## Benefícios do CQRS ##

  - **Dimensionamento independente**
    > " **O CQRS permite que as cargas de trabalho de leitura e gravação sejam dimensionadas de forma independente e pode resultar em menos contenções de bloqueio** "
  - **Esquemas de dados otimizados**
    > " **O lado de leitura pode usar um esquema que é otimizado para consultas, enquanto o lado de gravação usa um esquema que é otimizado para atualizações** "
  - **Segurança**
    > " **É mais fácil garantir que apenas as entidades do direito de domínio estejam executando gravações nos dados** "
  - **Separação de preocupações**
    > " **Isolar os lados de leitura e gravação pode resultar em modelos mais flexíveis e sustentáveis. A maior parte da lógica de negócios complexa vai para o modelo de gravação. O modelo de leitura pode ser relativamente simples** "
  - **Consultas mais simples**
    > " **Ao armazenar uma exibição materializada no banco de dados de leitura, o aplicativo poderá evitar junções complexas durante as consultas** "

---

## Desafios do CQRS ##

> " **A ideia básica do CQRS é simples. Mas isso poderá resultar em um design de aplicativo mais complexo, especialmente se eles incluírem o padrão Fornecimento de Eventos** "

  - **Complexidade**
    + Pode resultar em um design de aplicativo mais complexo
    + Especialmente se incluir o padrão **Fornecimento de Eventos (Event Sourcing)**
  - **Mensagens**
    > " **Embora o CQRS não necessite de mensagens, é comum usar mensagens para comandos de processo e publicar eventos de atualização** "
    + O aplicativo deve tratar **falhas de mensagem** ou **mensagens duplicadas**
  - **Consistência eventual**
    > " **Se você separar os bancos de dados de leitura e de gravação, os dados de leitura poderão ficar obsoletos** "

---

## CQRS e o Padrão Event Sourcing ##

  - O CQRS é frequentemente associado ao padrão de **Evento de Fornecimento (Event Sourcing)**
  - Neste padrão, o estado do sistema é armazenado como uma sequência de eventos imutáveis
  - Cada evento representa uma mudança no estado, e o estado atual pode ser reconstruído pela reprodução dos eventos
  - Isso complementa o CQRS, fornecendo um mecanismo para:
    + Manter a sincronia entre os modelos de leitura e gravação
    + Garantir um histórico completo de auditoria das mudanças

---

### _Referência Bibliográfica_ ###

- Microsoft
  - **Azure Architecture Guide – Big Data**
  - **Azure Architecture Guide – CQRS**
- [**Referência de Material : Azure Architecture**](https://docs.microsoft.com/pt-br/azure/architecture/)
- [**Referência de Material : CQRS – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/cqrs)

------------------------------------------------

### _Questões – TP_ ###

  1. _O que é CQRS e qual problema ele resolve? (1 Ponto)_
      > Resposta : **CQRS (Command and Query Responsibility Segregation) é um estilo de arquitetura que separa operações de leitura de operações de gravação. Resolve o problema das arquiteturas tradicionais onde o mesmo modelo de dados é usado para consultar e atualizar, o que resulta em modelos excessivamente complexos, mapeamento de objetos complicado no lado da leitura e validação complexa no lado da gravação, além de cargas de trabalho assimétricas com diferentes requisitos de desempenho e escalabilidade**

  2. _Como os comandos e consultas são tratados no CQRS? (1 Ponto)_
      > Resposta : **Os comandos devem ser baseados em tarefas, em vez de centrados nos dados, e podem ser posicionados em uma fila para processamento assíncrono. As consultas nunca modificam o banco de dados e retornam um DTO que não encapsula qualquer conhecimento de domínio**

  3. _Como funciona a separação física dos bancos no CQRS? (1 Ponto)_
      > Resposta : **Para maior isolamento, os dados de leitura e gravação são separados fisicamente. O banco de dados de leitura pode usar seu próprio esquema otimizado para consultas, como views pré-preenchidas. A sincronia é mantida através da publicação de um evento pelo modelo de gravação sempre que atualiza o banco de dados, devendo a atualização do banco e a publicação do evento ocorrer em uma única transação. Podem ser usados tipos diferentes de armazenamento, como banco relacional para gravação e banco de documentos para leitura**

  4. _Quais os benefícios do CQRS? (1 Ponto)_
      > Resposta : **Dimensionamento independente das cargas de trabalho de leitura e gravação; esquemas de dados otimizados para cada operação; maior segurança, garantindo que apenas entidades de domínio autorizadas executem gravações; separação de preocupações, resultando em modelos mais flexíveis e sustentáveis; e consultas mais simples através de exibições materializadas que evitam junções complexas**

  5. _Quais os desafios do CQRS? (1 Ponto)_
      > Resposta : **Complexidade no design do aplicativo, especialmente se incluir o padrão de Fornecimento de Eventos (Event Sourcing); necessidade de tratamento de falhas de mensagens e mensagens duplicadas quando se utiliza mensagens para comandos de processo e publicação de eventos de atualização; e consistência eventual, onde os dados de leitura podem ficar obsoletos quando os bancos de leitura e gravação são separados**

  6. _Como o CQRS se aplica a uma arquitetura de microsserviços? (1 Ponto)_
      > Resposta : **Em microsserviços, um serviço não pode acessar diretamente o armazenamento de dados de outro. O CQRS resolve isso fazendo com que o Serviço A grave em um armazenamento de dados e publique um evento, enquanto o Serviço B assina o evento e mantém uma exibição materializada dos dados para leitura, garantindo isolamento e baixo acoplamento entre os serviços**

  7. _Quando é indicado o uso do CQRS? (1 Ponto)_
      > Resposta : **Em domínios colaborativos onde muitos usuários acessam os mesmos dados com cargas de trabalho de leitura e gravação assimétricas. O CQRS não é uma arquitetura de nível superior que se aplica ao sistema inteiro; deve ser aplicado somente a subsistemas específicos onde houver um valor claro na separação de leituras e gravações**

  8. _Qual a relação entre CQRS e o padrão Event Sourcing? (1 Ponto)_
      > Resposta : **O CQRS é frequentemente associado ao padrão de Evento de Fornecimento (Event Sourcing), onde o estado do sistema é armazenado como uma sequência de eventos imutáveis. Este padrão complementa o CQRS fornecendo um mecanismo para manter a sincronia entre os modelos de leitura e gravação, além de garantir um histórico completo de auditoria das mudanças no sistema**