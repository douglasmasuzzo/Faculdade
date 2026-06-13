ENGENHARIA DE SOFTWARE - ARQUITETURA DE CQRS 

- Objetivo
 + conceito de arquitetura de software
 + integração com ferramentas e processos de desenvolvimento de estruturas
 
- Tarefa
 + implementar os estilos arquiteturais conforme a documentação padronizada pela IBM 
 + os campos de visões são relacionadas de acordo com as camadas e os estilos de arquitetura
 + desenvolver os tópicos: "1.0 - Introdução", "1.1 - Esboços", "1.2. Finalidade", "1.3 - Visão Geral do Projeto", "2.0 - Identificação do Projeto", "3.0 - Representação Arquitetural", "4.0 - Metas e Restrições", "5.0 - Visão de Caso de Uso" e "6.0 - Visão Lógica" 

- Material
 + documento compartilhado, na pasta de "Template_Exemplos" 

** ANOTAÇÕES **

 O documento de Arquitetura de Software "ITRP" constitui entre os diferentes modelos propostos de acordo com a introdução e escopo do projeto, nas sessões 1.0 e 1.1. O item 1.2 deve ser direcionado a apresentação de acrônimos / abreviações, descrevendo todos os recursos e tecnologias implantadas no projeto. O campo relacionado a Visão Geral, localizado na sessão 1.4, deve abordar as 5 principais visões / pilares da arquitetura de software ( recomenda-se exibir ilustrações como gráficos / tabelas sobre este campo ). 
 A sessão direcionada a "Metas e Restrições" devem ser definidas e estabelecidas de acordo com os requisitos não-funcionais identificados nos períodos iniciais do projeto e os padrões arquiteturais profissionais, alinhando conforme as necessidades operacionais e as exigências regulatórias ( ilustração representada na tabela 4.0 ). O documento exige a descrição de padrões metodológicos a serem seguidos, conforme a modelagem de requisitos identificados e adesão de normas e padrões arquiteturais. 


** RECURSOS E FUNÇÕES TÉCNICAS ** 

- FERRAMENTAS DE DESENVOLVIDO
 + definição de ferramentas de integração ( KAFKA / KUBERNETS )
 + definição de linguagens de client-server
 + definição de linguagens de banco de dados
 + definição de linguagem fornecedor ( ORACLE / MICROSOFT / GOOGLE / AMAZON )
 + definição de ferramentas de ilustração / diagramação ( StarUML / LucidChart / Draw.io )

- PROTCOLOS DE SEGURANÇA
 + IEEE
 + ISO
 + CMMI
 + IOBIT 
 + ITIL
 + W3C

** MODELO ARQUITETURIAL ** 
 + separação do frontend / backend / persistência
 + integração entre módulos internos
 + comunicação entre microsserviços
 + mecanismos de autenticação e autorização

** DOCUMENTAÇÃO ARQUITETURIAL **
 + requisitos funcionais
 + requisitos não-funcionais
 + metas arquiteturais
 + restrições técnicas

** DIAGRAMA UML - REPRESENTAÇÃO **
 + atores / casos de uso
 + relacionamento inclued/extend
 + fluxo de mensagem
 + comunicação entre componentes
 + sequência de execução de serviços 

** MODELOS DE IMPLANTAÇÃO **
 + servidores
 + containers
 + banco de dados
 + gateways / API's
 + serviços externos
 + integração com protocolo de comunicação HTTPS 

** SESSÃO DE ACRÔNICOS **
 + UML
 + API
 + MVC
 + EDA
 + CQRS
 + HTTPS
 + ERP
 + SGBD
 + Kubernets
 + Kafka 

** DESCRIÇÃO ENTRE CAMADAS **

 - Visão de Casos de Uso
  + representa os usos de requisitos funcionais e interação dos usuários com o sistema

 - Visão Lógica 
  + representa a organização estrutural do software 

 - Visão de Processos
  + demonstra a concorrência, a comunicação e o processamento interno

 - Visão de Implementação 
  + apresenta os componentes físicos e organização do código

 - Visão de Implantação 
  + demonstra a distribuição física em infraestrutura computacional 

** AVISOS - RECOMENDAÇÕES  ** 

 + pode ilustrar a realização do caso de uso com os DIAGRAMAS DE CASOS DE USO 
 + a menção de casos de uso pode ser representado em uma tabela com uma breve descrição, os nomes de casos de usos deverão ser enumerados conforme o número do RF-MR, separado por atores ( seguir o exemplo da tabela "1.1 - Realizações de UC ( NVEC )"
 + o diagrama de caso de uso deve compor o ambiente, o ator, o caso de uso, o relacionamento de ações ( include / extended ) 
 + os requisitos funcionais podem gerar múltiplos casos de uso. enumere os segmentos do caso de uso 
 + seguir o modelo de documento intitulado "ArquiteturaSoftware
 + os tópicos de metas e restrições devem corresponder aos requisitos funcionais / não-funcionais
 + não seguir os modelos exibidos na sessão 4.2 
 + não mesclar regras de negócios com regras de padronização de metas e restrições da arquitetura 
 + desenvolver o diagrama de implantação ( com uso principal do protocolo HTTP )
 + a visão lógica deve representar os componentes internos do sistema, evidenciando entidade / serviços / módulos / banco de dados e estruturas de camadas 