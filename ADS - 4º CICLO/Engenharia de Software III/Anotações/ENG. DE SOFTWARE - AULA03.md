# **ENGENHARIA DE SOFTWARE - Arquitetura Orientada a Serviços ( AULAO3 )** #

-------------------------------------------------------------------

## Tópicos ##
 - Arquitetura Orientada à Serviços
 - Arquitetura de Microsserviços

### _Arquitetura Orientada a Serviços ( S.O.A )_ ###
 > **Estilo de arquitetura para desenvolvimento de sistemas baseados em software com foco nos processos e funções de negócios da empresa, implementando-os através de serviços reutilizáveis e interoperáveis**

### _Serviço_ ###
 > **Um serviço é uma implementação de uma funcionalidade bem definida, sendo a menor unidade de aplicação S.O.A**

### _Interpretações de Serviços_ ###

 - _Diretor de Negócios_
    - "S.O.A é uma tecnologia que cria um ambiente de negócio ágil e provê vantagem ou maior valorização"

 - _Gerente de T.I_
    - "S.O.A é o conjunto de processo, estrutura e diretrizes de governança que permite alinhar T.I às necessidades de negócios"

 - _Engenheiro de Software_
    - "É uma arquitetura de software baseada em padrões abertos que permitem integrar aplicações novas e existentes" 

 - _Desenvolvedor_
    - "É um framework baseado em webservices que permite invocar objetos remotamente utilizando protocolo 'S.O.A.P' ( Simples Protocolo de Acesso a Objetos ), baseado em XML ( Extensible Markup Language )"

### _Conceitos_ ###

 1. _Quebrar aplicações de negócios em blocos reutilizáveis e serviços_

 2. _Combinar os blocos de negócios para atender as necessidades de negócios_

 3. _Reutilização de blocos para atender novas necessidades de negócios_

 - _Proxy_
  > **"Proxy é um servidor intermediário entre uma rede interna e a internet. Uma das principais funções de um servidor proxy é compartilhar uma única conexão de internet coms os diversos computadores de uma rede, sendo o único conector inteligado entre a internet e os demais dispositivos"**
  ( _Referência_ : [Guia do Hardware - Proxy](https://www.guiadohardware.net/termos/proxy-servidor) )

## Características ##

 > **Atividades de Negócio são realizadas através de uma série de serviços que possuem maneiras definidas de 'pedir' e 'responder' informações**

 > **Não interessa como o serviço foi implementado, contando que ele corresponda aos comandos de maneira correta com a qualidade necessária**

 > **Isso significa que o serivço precisa ser adequadamente seguro e confiável, além de rápido e funcional**

 > **Isso faz com que a Arquitetura de Serviço uma tecnologia ideal para ser utilizada em um ambiente de T.I, que possua um hardware e software de múltiplos fabricantes**

 > **Origem : 1980**

 ### _Principais Vantagens_ ###

  - Baixo acomplamento entre aplicações
  - Alta interoperabilidade entre plataformas tecnológicas
  - Alta reutilização de código e regras de negócios
  - Serviços são testados

  > **"Um estilo de arquitetura onde funcionalidades de aplicações de negócios existentes ( _LoB - Line of Business_ ) são disponibilizados e publicados na forma de serviços"**

  > Importante o mapeamento dos servidores e funcionalidades disponíveis, que irão atender as necessidades de negócios. 
  
  > Deve estar alinhado com o planejamento estratégico da empresa. 
  
  > Utilizado para integrar diferentes aplicações entre de um ERP ( _Planejamento de Recursos Empresariais_ ), CRM ( _Gerenciamento de Relações do Cliente_ ), Integração Externa, Pagamentos em Multiplataformas, etc.    
 
----------------------------------

### _Questões Práticas_ ###
 
 1. _O que caracteriza uma Arquitetura de Microsserviços?_
   > **R: Um conjunto de pequenos serviços, independentemente e implatáveis separadamente**

 2. _Qual é um dos principais benefícios dos microsserviços em ambientes em  nuvem?_ 
   > **R: Escalabilidade Independente de Serviços**
    
 3. _Em arquitetura de microsserviços, o que significa ‘ Deploy Independente ‘?_
   > **R: Cada serviço pode ser atualizado sem impactar diretamente os outros**

 4. _Qual é a tecnologia frequentemente utilizada para empacotar microserviços?_
   > **R: Containers ( Dockers )**
   
 5. _Qual é a ferramenta amplamente usada para orquestração de containers em Arquiteturas de Microsserviços?_ 
   > **R: Kubernets ( Orquestradores )**

 6. _Qual é uma forma de comunicação entre microsserviços?_
   > **R: API Rest e Mensageria**

 7. _Qual é o desafio comum em Arquitetura de Microsserviços?_ 
   > **R: Gestão de comunicação entre serviços distribuídos**

 8. _O que é uma API Gateway em Microserviços?_
   > **R: Um único ponto de entrada para requisições de serviços**

 9. _Em uma arquitetura de microserviços, cada serviço geralmente possui:_
   > **R: Uma responsabilidade específica dentro do sistema**
   
 10. _Qual princípio é recomendado em arquiteturas de microsserviços?_
   > **R: Baixo acoplamento e alta coesão** 

