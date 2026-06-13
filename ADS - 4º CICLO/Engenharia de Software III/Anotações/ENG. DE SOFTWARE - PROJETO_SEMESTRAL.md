# ENG. DE SOFTWARE - DIRETRIZES E ARQUITETURA DO PROJETO SEMESTRAL (CQRS & CAMADAS) #

--------------------------------

## Descrição ##

### _Especificação e Consolidação da Arquitetura "ITRP" – Engenharia de Software III_ ###

  - [**Referência de Material : Modelo de Documento – Template_Exemplos**](https://docs.microsoft.com/)
  - [**Padrão de Documentação : Especificações Baseadas no Padrão IBM e Diretrizes de Sala**](https://docs.microsoft.com/)

---

## 1.0 - Diretrizes Gerais e Escopo da Documentação ##

> " **O documento de Arquitetura de Software 'ITRP' constitui-se entre os diferentes modelos propostos de acordo com a introdução, escopo e modelagem de requisitos identificados** "

  - **Metodologia e Padronização:**
    + Os campos de visões são estritamente relacionados de acordo com as camadas e os estilos de arquitetura.
    + Exige-se a descrição de padrões metodológicos a serem seguidos, conforme a modelagem de requisitos e adesão de normas profissionais.
    + O objetivo final do projeto é compreender integralmente os processos de construção, abrangendo desde a análise e levantamento de requisitos até a consolidação da arquitetura de software.

  - **Estrutura de Tópicos Base (Fase I & II):**
    + **1.0 - Introdução** e **1.1 - Esboços**: Delimitação inicial do projeto e contexto arquitetural.
    + **1.2 - Finalidade**: Apresentação de acrônimos/abreviações e detalhamento dos recursos e tecnologias implantadas.
    + **1.3 & 1.4 - Visão Geral do Projeto**: Abordagem dos 5 principais pilares/visões da arquitetura (com recomendação de ilustrações como gráficos/tabelas).
    + **2.0 - Identificação do Projeto** e **3.0 - Representação Arquitetural**.
    + **4.0 - Metas e Restrições**: Definidas conforme requisitos não-funcionais e padrões arquiteturais profissionais (Ilustração na tabela 4.0).
    + **5.0 - Visão de Caso de Uso** e **6.0 - Visão Lógica**.
    + **7.0 - Visão de Processos**, **8.0 - Visão de Implantação** e **9.0 - Visão de Implementação**.
    + **10.0 - Visão de Dados**, **11.0 - Tamanho e Desempenho** e **12.0 - Qualidade** (Tópicos Opcionais).

---

## 2.0 - Recursos, Funções Técnicas e Protocolos ##

### _Ferramentas de Desenvolvimento e Fornecedores_ ###
  - **Ferramentas de Integração e Orquestração:** Definição clara do uso de KAFKA (mensageria/eventos) e KUBERNETES (containers/orquestração).
  - **Linguagens do Ecossistema:** Definição explícita de linguagens client-server e linguagens/tecnologias de banco de dados.
  - **Provedores/Fornecedores de Nuvem:** Escolha e definição técnica entre ORACLE, MICROSOFT, GOOGLE ou AMAZON.
  - **Ferramentas de Diagramação e Ilustração:** StarUML, LucidChart ou Draw.io.

### _Protocolos de Segurança e Governança_ ###
  - Adesão estrita a normas e padrões internacionais de engenharia e governança de TI: **IEEE, ISO, CMMI, IOBIT, ITIL e W3C**.

### _Modelo e Mecanismos Arquiteturais_ ###
  - **Segregação de Responsabilidades:** Separação rígida entre Frontend, Backend e Persistência de dados.
  - **Integração e Comunicação:** Integração contínua entre módulos internos e comunicação robusta entre microsserviços.
  - **Segurança de Acesso:** Implementação de mecanismos seguros de autenticação e autorização de usuários e serviços.

---

## 3.0 - Detalhamento das Cinco Visões Arquiteturais ##

### _3.1 - Visão de Casos de Uso (Seção 5.0)_ ###
> " **Representa os usos de requisitos funcionais e a interação direta dos usuários com o sistema através de diagramas e tabelas estruturadas** "
  - **Composição do Diagrama UML:** Deve compor o ambiente, o ator, o caso de uso e os relacionamentos de ações (`include` / `extend`).
  - **Mapeamento Textual:** Representação em formato de tabela com breves descrições, com os casos de uso enumerados conforme o identificador do RF-MR e separados por atores (seguindo o exemplo da tabela "1.1 - Realizações de UC (NVEC)").
  - **Aviso de Modelagem:** Os requisitos funcionais podem gerar múltiplos casos de uso, sendo obrigatório enumerar os segmentos do caso de uso.

### _3.2 - Visão Lógica (Seção 6.0)_ ###
  - Representa formalmente a organização estrutural do software.
  - **Elementos Internos:** Deve evidenciar detalhadamente as entidades, serviços, módulos, bancos de dados e as estruturas gerais de camadas.

### _3.3 - Visão de Processos (Seção 7.0)_ ###
  - Demonstra a concorrência, os fluxos de comunicação e o processamento interno do sistema.
  - **Diagramas Obrigatórios:** Diagrama de Sequência e Diagrama de Atividades para exatamente 2 casos de uso complexos previamente selecionados.
  - **Elementos Técnicos:** Inclusão de classes de fronteira (`boundary`) no diagrama sequencial para receber e enviar informações coletadas pelas telas.
  - **Fluxos Mapeados:** Fluxo de autenticação, fluxo de pagamento, comunicação entre APIs e processamento assíncrono de eventos.

### _3.4 - Visão de Implantação (Seção 8.0)_ ###
  - Demonstra a distribuição física do sistema na infraestrutura computacional, baseando-se no modelo do documento 'ITRP'.
  - **Topologia de Infraestrutura:** Mapeamento de nós de hardware, servidores web, balanceamento de carga, servidores de banco de dados e contêineres/orquestração Kubernetes.
  - **Protocolo Padrão:** Uso mandatório de comunicação remota e distribuída via protocolo **HTTPS**, reservando o protocolo **TCP/IP** estritamente para alinhamentos e conexões locais.

### _3.5 - Visão de Implementação (Seção 9.0)_ ###
  - Apresenta os componentes físicos, organização do código-fonte, divisão em microsserviços, organização de pacotes, dependências internas e frameworks utilizados.
  - **Diagramas de Componentes:** Descrição sob a perspectiva da arquitetura, diagramação da estrutura de camadas (Model-View-Controller) e da arquitetura de serviços (N-Camadas, Microsserviços ou EDA - Orientada a Eventos).
  - **Catálogo de Componentes:** Lista detalhada de todas as ferramentas associadas a cada camada interna ou externa do sistema (Exemplo: Figma na camada *view*, ORACLE como SGBD Relacional).

---

## 4.0 - Metas, Restrições e Padrões Arquiteturais ##

> " **As metas e restrições técnicas devem corresponder de forma direta aos requisitos funcionais e não-funcionais mapeados nas fases iniciais do projeto** "

  - **Regras de Ouro de Modelagem:**
        + **Segregação Absoluta:** Nunca mesclar regras de negócios com regras de padronização de metas e restrições da arquitetura.
        + **Modelos Proibidos:** Não seguir em hipótese alguma os modelos exibidos na sessão 4.2 do material base.
        + **Referência de Mercado:** O modelo de camadas pode se basear em grandes plataformas de e-commerce e serviços robustos, como a plataforma ViaVarejo.

---

### _Sessão de Acrônimos (Item 1.2)_ ###

- **UML** – Unified Modeling Language
- **API** – Application Programming Interface
- **MVC** – Model-View-Controller
- **EDA** – Event-Driven Architecture
- **CQRS** – Command and Query Responsibility Segregation
- **HTTPS** – Hypertext Transfer Protocol Secure
- **ERP** – Enterprise Resource Planning
- **SGBD** – Sistema de Gerenciamento de Banco de Dados
- **Kubernetes** – Orquestrador de Contêineres em Nuvem
- **Kafka** – Barramento de Integração e Processamento de Eventos

------------------------------------------------