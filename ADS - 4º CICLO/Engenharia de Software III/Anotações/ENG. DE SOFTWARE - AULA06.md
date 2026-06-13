# ENG. DE SOFTWARE - Arquitetura SOA, EDA e ESB #
 
--------------------------------
 
## Descrição ##
 
### _SOA, EDA e ESB – Engenharia de Software III_ ###
 
  - [**Referência de Material : Estilos de Arquitetura – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/)
  - [**Referência de Material : Service Bus – Azure**](https://docs.microsoft.com/pt-br/azure/service-bus-messaging/service-bus-messaging-overview)
  - [**Referência de Material : EDA – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/event-driven)
  - [**Referência de Material : DevMedia – EDA com ESB**](https://www.devmedia.com.br)
---
 
## SOA – Arquitetura Orientada a Serviços ##
 
> " **Um estilo de arquitetura onde funcionalidades de aplicações de negócio existentes (LoB – Line of Business) são disponibilizadas e publicadas na forma de serviços** "
 
- Importante o **mapeamento dos serviços e funcionalidades disponíveis**, que irão atender as necessidades do negócio
- Deve estar **alinhado com o planejamento estratégico** da empresa
- Utilizado para integrar aplicações diferentes dentro de um **ERP, CRM, integração externa, pagamentos por diversas plataformas de cartão de crédito**, por exemplo
### _Propriedades da SOA – Definição W3C_ ###
 
> " **O grupo de Arquitetura do W3C define SOA como uma forma de arquitetura de sistemas distribuídos** "
 
  - | **Propriedade** | **Descrição** |
    | - | - |
    | Visão lógica | O serviço é uma abstração, uma visão lógica de programas reais, bases de dados, processos de negócio e assim por diante, definidos em termos do que ele faz, geralmente realizando uma operação de nível empresarial. Serviço é definido como uma ação de negócios significativo |
    | Orientado à mensagens | O serviço é definido formalmente em termos das mensagens trocadas entre provedor e consumidor. A estrutura interna da implementação é deliberadamente abstraída. Interface de serviço é separada da implementação do serviço |
    | Orientado à descrição | O serviço é descrito por metadados processáveis / definição de serviço |
    | Granularidade | Serviços tendem a usar pequeno número de operações com mensagens complexas e extensas |
    | Orientado à redes | Uso sobre redes |
    | Plataforma neutra | As mensagens são enviadas em um formato padronizado de plataforma neutra, entregues através das interfaces. O mais óbvio é o formato XML, que atende essa restrição |
### _Algumas Conclusões sobre SOA_ ###
 
  - **SOA não é uma tecnologia** – As tecnologias (padrões) que dão suporte a SOA são o que a viabiliza, mas SOA não é uma tecnologia por si só
  - **SOA não é uma metodologia** – Há várias metodologias (processos, ferramentas, métodos de trabalho) que podem ser usados para implantar SOA com sucesso. SOA não é e nem define alguma metodologia
  - **SOA pode ser considerada uma filosofia arquitetural** – É uma linha de pensamento que permeia a implementação de necessidades de negócio, refletida em diretrizes, políticas e metodologias corporativas, não necessariamente restritas à área de TI
  - **SOA não é algo que se possa comprar ou instalar**
  - **SOA não é um webservice**
  - **SOA não cria nada** – Ela apenas sugere, propõe, define
### _Características dos Serviços SOA_ ###
 
  - Serviços são **autônomos**
  - Serviços são **orientados a mensagens**
  - Serviços podem suportar **diferentes protocolos e mecanismos de transporte**
  - Serviços podem ser **publicados ou hosteados em diferentes tipos de hosts**
  - Serviços suportam **contratos de operação, interfaces e tipos de mensagens**
### _Serviços Comuns de uma Arquitetura SOA_ ###
 
  - Apresentação dos serviços
  - Colaboração dos serviços
  - Interação dos serviços
  - Processamento dos serviços
  - Dados dos serviços
  - Conectividade dos serviços
  - Monitoramento e segurança dos serviços
  - Orquestração dos serviços
---
 
## APIs – Application Programming Interfaces ##
 
> " **As APIs possibilitam a integração de tecnologias que operam a base de um protocolo HTTP. Seu objetivo é promover a comunicação entre um software e outras aplicações que precisam se integrar** "
 
- As **APIs costumam ser o meio pelo qual os microsserviços se comunicam**
- Podem ser usadas para **expor os dados e as funcionalidades de uma aplicação a terceiros**, abrindo caminho para integrações poderosas
- A estratégia adotada para criação e utilização das APIs é importante para **flexibilizar e entregar rapidamente valor ao negócio**, conectando aplicações internas, clientes, parceiros de negócio e novas funcionalidades
### _Tipos de APIs_ ###
 
  - **Privada** – São desenhadas para integrar processos internos do negócio, servindo de suporte para uma estratégia de arquitetura de microserviços. São utilizadas para integração de sistemas internos, desenvolvidos separadamente
  - **Restrita** – São expostas apenas a parceiros do negócio. Cria-se um ecossistema de desenvolvedores envolvidos em desenhar produtos e serviços inovadores a partir dos dados disponibilizados
  - **Pública** – São disponibilizadas abertamente para que qualquer desenvolvedor possa utilizar os dados no backend da plataforma como suporte para suas aplicações
### _Exemplos de Aplicação de APIs_ ###
 
  - APIs que fazem parte das funcionalidades de um **website**: buscadores de viagens, hotéis, certificadores, autorizadores de cartões de crédito
  - APIs utilizadas em **softwares online (SaaS)**
  - APIs que suportam **aplicações móveis (Apps Mobile)**
  - APIs e **Internet das Coisas (IoT)** têm relação direta
---
 
## EDA – Arquitetura Orientada a Eventos ##
 
> " **A EDA promove uma estrutura que estabelece o alicerce de apoio à integração entre os sistemas e/ou componentes do ambiente – usufruindo da ocorrência de evento, mantendo um baixo acoplamento entre os sistemas** "
 
### _O que é um Evento?_ ###
 
  - Um evento caracteriza uma **ocorrência de um fato**, dentro de um sistema de uma organização
  - Possibilita uma **comunicação organizada e controlada** entre sistemas
  - Definem o **momento da integração**
  - **Carregam informações** relevantes para o processo de negócio da empresa
  - Um evento é **autocontido** – carrega consigo a informação de quando está preparado para ser disparado e quais informações deve conter
  - A definição do evento está muito mais ligada ao **processo de negócio** da empresa do que a decisões técnicas, mas eventos técnicos também podem ser definidos
  - **EXEMPLOS:**
    + Cadastro de um correntista
    + Desistência de uma compra
    + Quantidade limite para execução de um serviço disponível
    + Tempo limite de resposta de uma transação
### _Estrutura da EDA_ ###
 
  - Uma arquitetura orientada a eventos consiste em **produtores de eventos** que geram um fluxo de eventos e **consumidores de eventos** que ouvem os eventos
  - Os eventos trabalham em **tempo real**, são respondidos à medida que ocorrem
  - Os **produtores são dissociados dos consumidores** – um produtor não sabe quais consumidores estão ouvindo
  - Os **consumidores também são dissociados uns dos outros** – todo consumidor vê todos os eventos
  - Em **IoT** os eventos são ingeridos em volumes muito altos
### _Modelos da EDA_ ###
 
  - | **Modelo** | **Descrição** |
    | - | - |
    | Publicação / Assinatura (Pub/Sub) | A infra-estrutura de mensagens acompanha as inscrições. Quando um evento é publicado, ele envia o evento para cada assinante. Depois que um evento é recebido, ele não pode ser repetido e novos inscritos não veem o evento |
    | Fluxo de Eventos (Streaming) | Os eventos são gravados em um log. Eventos são estritamente ordenados e duráveis. Os clientes não assinam o fluxo, em vez disso, um cliente pode ler de qualquer parte do fluxo. O cliente é responsável por avançar sua posição no fluxo. Um cliente pode participar a qualquer momento e pode reproduzir eventos |
### _Quando Usar a EDA?_ ###
 
  - Vários **subsistemas devem processar os mesmos eventos**
  - Processamento em **tempo real** com atraso de tempo mínimo
  - Processamento de **eventos complexos**, como janelas de correspondência de padrões ou agregação ao longo do tempo
  - **Alto volume e alta velocidade de dados**, como IoT
### _Benefícios da EDA_ ###
 
  - Produtores e consumidores são **dissociados**
  - **Nenhuma integração ponto a ponto** – é fácil adicionar novos consumidores ao sistema
  - Os consumidores podem **responder aos eventos imediatamente** à medida que chegam
  - **Altamente escalável e distribuído**
  - Os subsistemas têm **visualizações independentes** do fluxo de eventos
---
 
## ESB – Enterprise Service Bus ##
 
> " **O Barramento de Serviço é mais comumente usado para desacoplar aplicativos e serviços uns dos outros, sendo uma plataforma confiável e segura para dados assíncronos e transferência de estado** "
 
- Para melhorar a organização e o controle da estrutura da EDA, utiliza-se um **barramento de serviços ESB (Enterprise Service Bus)** como mediador
- Ao ter um mediador responsável por tratar as integrações, que **centraliza os serviços existentes no ambiente**, criar uma arquitetura para eventos se torna mais fácil
- Os dados são transferidos entre diferentes aplicativos e serviços usando **mensagens** em formato binário que pode conter **JSON, XML ou apenas texto**
### _ESB e a EDA_ ###
 
  - Pelo ESB é possível **identificar os serviços expostos de sistemas** que são potenciais emissores (origem de eventos), deixando a responsabilidade de gerenciamento dos eventos ao barramento de serviços
  - O barramento centraliza a emissão dos eventos do ambiente, realizando a **inspeção do fluxo de informações** que está trafegando durante a execução dos serviços expostos pelos sistemas
  - Assim que identificado e criado um evento pelo barramento, os **assinantes podem recebê-lo**
  - Sem o ESB, o descontrole sobre a integração resulta em: **eventos duplicados, eventos específicos por sistema, desconhecimento de assinantes e acoplamento mais alto** entre as partes
### _Cenários Comuns de Mensageria com ESB_ ###
 
  - **Mensagens** – Transferir dados comerciais, como vendas ou pedidos de compra, diários ou movimentos de estoque
  - **Desacoplar aplicativos** – Melhorar a confiabilidade e a escalabilidade de aplicativos e serviços (cliente e serviço não precisam estar online ao mesmo tempo)
  - **Tópicos e assinaturas** – Habilitar relacionamentos 1:N entre publicadores e assinantes
  - **Sessões de mensagens** – Implementar fluxos de trabalho que exijam ordenação de mensagens ou adiamento de mensagens
### _Linguagens Suportadas pela EDA_ ###
 
  - .NET
  - Java
  - Node.js
  - Python
  - Ruby
---
 
### _Referência Bibliográfica_ ###
 
- W3C Architecture Group
  - **Web Services Architecture**
- [**Referência de Material : Estilos de Arquitetura – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/)
- [**Referência de Material : Service Bus – Azure**](https://docs.microsoft.com/pt-br/azure/service-bus-messaging/service-bus-messaging-overview)
- [**Referência de Material : EDA – Azure**](https://docs.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/event-driven)
- [**Referência de Material : DevMedia**](https://www.devmedia.com.br)
------------------------------------------------
 
### _Questões – TP_ ###
 
  1. _Explique SOA – Arquitetura Orientada a Serviços. (1 Ponto)_
      > Resposta : **Estilo de arquitetura onde funcionalidades de aplicações de negócio existentes são disponibilizadas e publicadas na forma de serviços, alinhado ao planejamento estratégico da empresa e utilizado para integrar diferentes aplicações**
  2. _O que é um evento no contexto da EDA? (1 Ponto)_
      > Resposta : **Um evento caracteriza uma ocorrência de um fato dentro de um sistema de uma organização. É autocontido, carrega consigo a informação de quando está preparado para ser disparado e quais informações deve conter. Está muito mais ligado ao processo de negócio da empresa do que a decisões técnicas**
  3. _Quais as principais características da Arquitetura Orientada a Eventos? (1 Ponto)_
      > Resposta : **A EDA consiste em produtores de eventos que geram um fluxo de eventos e consumidores que ouvem os eventos. Os eventos trabalham em tempo real, os produtores são dissociados dos consumidores e os consumidores são dissociados entre si**
  4. _Quais os dois modelos da EDA e suas diferenças? (1 Ponto)_
      > Resposta : **Pub/Sub (publicação/assinatura): quando um evento é publicado, é enviado a cada assinante e não pode ser repetido. Streaming de eventos: os eventos são gravados em um log, são duráveis e qualquer cliente pode ler de qualquer posição do fluxo a qualquer momento**
  5. _Qual o papel do ESB em uma arquitetura EDA? (1 Ponto)_
      > Resposta : **O ESB atua como mediador, centralizando a emissão e o gerenciamento dos eventos do ambiente. Ele identifica os serviços expostos, inspeciona o fluxo de informações e entrega os eventos aos assinantes, reduzindo o acoplamento e evitando problemas como eventos duplicados**
  6. _Quais as principais responsabilidades e funcionalidades que um ESB pode fornecer para organizar uma arquitetura EDA? Inclua o nome da ferramenta para: Azure, AWS, Oracle, IBM e Google. (1 Ponto)_
      > Resposta : **O ESB centraliza integrações, gerencia eventos, desacopla sistemas, garante entrega confiável de mensagens e suporta tópicos/assinaturas. Ferramentas: Azure Service Bus (Azure), Amazon MQ / Amazon EventBridge (AWS), Oracle Service Bus (Oracle), IBM App Connect / IBM MQ (IBM), Google Cloud Pub/Sub (Google)**
  7. _Quais os benefícios de se utilizar a EDA? (1 Ponto)_
      > Resposta : **Produtores e consumidores dissociados, sem integração ponto a ponto, resposta imediata aos eventos, alta escalabilidade e distribuição, e visualizações independentes do fluxo de eventos por subsistema**
  8. _Quando é indicado o uso da Arquitetura Orientada a Eventos? (1 Ponto)_
      > Resposta : **Quando vários subsistemas devem processar os mesmos eventos, quando há necessidade de processamento em tempo real, em processamento de eventos complexos (padrões, agregações) e em cenários de alto volume e alta velocidade de dados, como IoT**