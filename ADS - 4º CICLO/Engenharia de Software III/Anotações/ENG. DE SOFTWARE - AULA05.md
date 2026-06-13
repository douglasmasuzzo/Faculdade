# ENG. DE SOFTWARE - Arquitetura SOA - Microsserviços #
 
--------------------------------
 
## Descrição ##
 
### _SOA – Service-Oriented Architecture_ ###
 
  - [**Referência de Material : Estilos de Arquitetura – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/)
  - [**Referência de Material : Design de APIs – Azure**](https://learn.microsoft.com/pt-br/azure/architecture/best-practices/api-design)
  - [**Referência de Material : Microserviços – AWS**](https://aws.amazon.com/pt/microservices/)
---
 
## SOA – Arquitetura Orientada a Serviços ##
 
> " **Estilo de arquitetura para desenvolvimento de sistemas baseados em software com foco nos processos e funções de negócio da empresa, implementando-os através de serviços reutilizáveis e interoperáveis** "
 
### _O que é um Serviço?_ ###
 
> " **Um serviço é uma implementação de uma bem definida funcionalidade de negócio. É a menor unidade de uma aplicação SOA** "
 
- **EXEMPLOS:**
  + `registrarPedido`
  + `verificarEstoque`
  + `verificarCredito`
### _Diferentes Interpretações da SOA_ ###
 
  - | **Perfil** | **Interpretação** |
    | - | - |
    | Diretor de Negócios | SOA é uma tecnologia que cria um ambiente de negócio ágil e provê vantagem competitiva ou maior valor |
    | Gerente de TI | SOA é conjunto de processo, estrutura e diretrizes de governança que permite alinhar TI às necessidades do negócio |
    | Engenheiro de Software | SOA é uma arquitetura de software baseada em padrões abertos que permite integrar aplicações novas e existentes |
    | Desenvolvedor | SOA é um framework baseado em webservices que permite invocar objetos remotamente utilizando protocolo SOAP, baseado em XML |
### _Lógica da SOA_ ###
 
  1. **Quebrar** aplicações de negócios em blocos reutilizáveis e serviços
  2. **Combinar** blocos para atender as necessidades de negócios
  3. **Reutilizar** blocos para atender novas necessidades de negócios
### _Principais Vantagens da SOA_ ###
 
  - Baixo acoplamento entre aplicações
  - Alta interoperabilidade entre plataformas tecnológicas
  - Alta reutilização de código e regras de negócio
  - Serviços são facilmente testados
### _Características da SOA_ ###
 
  - Atividades de negócio são realizadas através de uma série de serviços com maneiras bem definidas de **"pedir"** e **"responder"** informações
  - Não interessa **como** o serviço foi implementado, desde que responda corretamente com a qualidade necessária
  - O serviço precisa ser **seguro, confiável e rápido**
  - SOA é ideal para ambientes de TI com hardware e software de **múltiplos fabricantes**
  - As ideias têm suas origens em meados da **década de 1980**
### _Propriedades da SOA – Definição W3C_ ###
 
  > " **O grupo de Arquitetura do W3C define SOA como uma forma de arquitetura de sistemas distribuídos** "
 
  - | **Propriedade** | **Descrição** |
    | - | - |
    | Visão lógica | O serviço é uma abstração, uma visão lógica de programas reais, bases de dados e processos de negócio, definidos pelo que faz — uma ação de negócios significativa |
    | Orientado à mensagens | O serviço é definido formalmente pelas mensagens trocadas entre provedor e consumidor, com a interface separada da implementação |
    | Orientado à descrição | O serviço é descrito por metadados processáveis / definição de serviço |
    | Granularidade | Serviços tendem a usar pequeno número de operações com mensagens complexas e extensas |
    | Orientado à redes | Uso sobre redes |
    | Plataforma neutra | Mensagens enviadas em formato padronizado neutro, como XML, entregues pelas interfaces |
### _Algumas Conclusões sobre SOA_ ###
 
  - **SOA não é uma tecnologia** – há tanto de negócio quanto de tecnologia em SOA
  - **SOA não é uma metodologia** – há várias metodologias que podem ser usadas para implantá-la
  - **SOA pode ser considerada uma filosofia arquitetural** – uma linha de pensamento que permeia a implementação de necessidades de negócio
  - **SOA não é algo que se possa comprar ou instalar**
  - **SOA não é um webservice**
  - **SOA não cria nada** – ela apenas sugere, propõe, define
---
 
## Os 8 Princípios dos Serviços SOA (Thomas Erl) ##
 
  _Baseado no livro: "SOA: Princípios do Design de Serviços" – Thomas Erl_
 
  1. **Serviços são CAPAZES DE SE COMPOR** – Um serviço pode "chamar" outro(s) para executar sua tarefa; a composição também é uma forma de reutilização
  2. **Serviços são AUTÔNOMOS** – Um serviço autônomo independe de elemento externo para executar sua lógica
  3. **Serviços evitam ALOCAÇÃO DE RECURSOS por longos períodos** – Evitam informação de estado para não onerar a infraestrutura
  4. **Serviços devem possuir a CAPACIDADE DE SEREM DESCOBERTOS** – Um contrato formal padronizado evita serviços redundantes; a arquitetura deve prover diretórios e registros
  5. **Serviços são REUTILIZÁVEIS** – Permite que a TI forneça respostas rápidas a novos requerimentos de negócio
  6. **Serviços compartilham um CONTRATO FORMAL** – O "contrato" informa o que o serviço faz e como se comunica (o que deve receber e o que deve entregar)
  7. **Serviços possuem BAIXO ACOPLAMENTO** – Implementações específicas podem ser substituídas, modificadas e evoluídas sem que os consumidores sintam qualquer descontinuidade
  8. **Serviços ABSTRAEM A LÓGICA** – Serviços são "caixas pretas"; a lógica não precisa nem deve ser exposta, simplificando o contrato formal
---
 
## APIs – Application Programming Interfaces ##
 
> " **Chamadas de Interfaces de Programação de Aplicativos, as APIs possibilitam a integração de tecnologias que operam a base de um protocolo HTTP. Seu objetivo é promover a comunicação entre um software e outras aplicações que precisam se integrar** "
 
- As **APIs costumam ser o meio pelo qual os microsserviços se comunicam**
- Podem ser usadas para expor dados e funcionalidades de uma aplicação a terceiros
### _Tipos de APIs_ ###
 
  - **Privada** – Desenhadas para integrar processos internos do negócio, servindo de suporte para uma estratégia de arquitetura de microserviços. Utilizadas para integração de sistemas internos desenvolvidos separadamente
  - **Restrita** – Expostas apenas a parceiros do negócio. Cria-se um ecossistema de desenvolvedores para projetar produtos e serviços inovadores a partir dos dados disponibilizados
  - **Pública** – Disponibilizadas abertamente para que qualquer desenvolvedor possa utilizar os dados no backend da plataforma como suporte para suas aplicações
### _Exemplos de Aplicação de APIs_ ###
 
  - APIs que fazem parte das funcionalidades de um **website**: buscadores de viagens, hotéis, certificadores, autorizadores de cartões de crédito
  - APIs utilizadas em **softwares online (SaaS)**
  - APIs que suportam **aplicações móveis (Apps Mobile)**
  - APIs e **Internet das Coisas (IoT)** têm relação direta
### _Serviços Comuns de uma Ferramenta de Arquitetura SOA_ ###
 
  - Apresentação dos serviços
  - Colaboração dos serviços
  - Interação dos serviços
  - Processamento dos serviços
  - Dados dos serviços
  - Conectividade dos serviços
  - Monitoramento e segurança dos serviços
  - Orquestração dos serviços
---
 
## Estilo de Arquitetura – N-Camadas ##
 
> " **O "N" indica que você pode ter quantas camadas quiser** "
 
- **EXEMPLOS DE CAMADAS:**
  + Camada de serviços (APIs)
  + Camada de segurança
  + Camada de integração (mensageria, Kafka)
  + Camada de cache
  + Camada de domínio (DDD)
- **EXEMPLO DE FLUXO N-CAMADAS:**
  + `UI → API → Serviços → Domínio → Repositório → Banco de Dados`
### _Vantagens da Arquitetura N-Camadas_ ###
 
  - Organização clara
  - Facilidade de manutenção
  - Reuso de código
  - Escalabilidade ( cada camada pode escalar separadamente )
  - Segurança ( controle de acesso por camada )
---
 
## Diferença entre Fila com Workers e EDA ##
 
  - | **Estilo** | **Foco** | **Característica** |
    | - | - | - |
    | Fila com Worker | Tarefas | Processamento controlado – quem consome é definido |
    | EDA (Event-Driven Architecture) | Eventos | Vários consumidores podem reagir ao mesmo evento |
  - [**Saiba mais : Kubernetes vs Docker – AWS**](https://aws.amazon.com/pt/compare/the-difference-between-kubernetes-and-docker/)
---
 
### _Referência Bibliográfica_ ###
 
- _Thomas Erl_
  - **SOA: Princípios do Design de Serviços**
- _Ian Sommerville_
  - **Engenharia de Software : 8º Edição**
- W3C Architecture Group
  - **Web Services Architecture**
- [**Referência de Material : Estilos de Arquitetura – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/)
- [**Referência de Material : Design de APIs – Azure**](https://learn.microsoft.com/pt-br/azure/architecture/best-practices/api-design)
- [**Referência de Material : Microserviços – AWS**](https://aws.amazon.com/pt/microservices/)
------------------------------------------------
 
### _Questões – TP_ ###
 
  1. _Explique SOA – Arquitetura Orientada a Serviços. (1 Ponto)_
      > Resposta : **Estilo de arquitetura para desenvolvimento de sistemas baseados em software com foco nos processos e funções de negócio, implementando-os através de serviços reutilizáveis e interoperáveis**
  2. _O que é um serviço no contexto da SOA? (1 Ponto)_
      > Resposta : **A implementação de uma funcionalidade de negócio bem definida; é a menor unidade de uma aplicação SOA**
  3. _Quais as principais características da SOA? (1 Ponto)_
      > Resposta : **Atividades de negócio realizadas por serviços com contratos bem definidos de requisição e resposta, independência de implementação, segurança, confiabilidade e suporte a múltiplas plataformas**
  4. _Quais as principais vantagens da Arquitetura Orientada a Serviços? (1 Ponto)_
      > Resposta : **Baixo acoplamento entre aplicações, alta interoperabilidade entre plataformas, alta reutilização de código e regras de negócio, e facilidade de teste dos serviços**
  5. _Como a SOA pode beneficiar a implantação de um sistema em uma empresa com múltiplas plataformas e sistemas? (1 Ponto)_
      > Resposta : **SOA é ideal para ambientes com hardware e software de múltiplos fabricantes, pois os serviços se comunicam por contratos formais padronizados, independentemente da tecnologia usada em cada plataforma**
  6. _Qual a interpretação de um engenheiro de software e de um desenvolvedor sobre SOA? (1 Ponto)_
      > Resposta : **Para o engenheiro de software, SOA é uma arquitetura baseada em padrões abertos que permite integrar aplicações novas e existentes. Para o desenvolvedor, SOA é um framework baseado em webservices que permite invocar objetos remotamente usando protocolo SOAP em XML**
  7. _Defina microserviços e cite 4 benefícios de utilização. (1 Ponto)_
      > Resposta : **Microserviços são pequenos serviços independentes que compõem uma aplicação, cada um responsável por uma funcionalidade específica. Benefícios: baixo acoplamento, escalabilidade independente por serviço, facilidade de manutenção e deploy independente**
  8. _Cite 5 boas práticas para aplicação de microserviços na arquitetura. (1 Ponto)_
      > Resposta : **Utilizar APIs como meio de comunicação entre serviços; garantir que cada serviço tenha responsabilidade única; aplicar contratos formais bem definidos; usar autenticação e segurança por camada; e implementar monitoramento e orquestração dos serviços**