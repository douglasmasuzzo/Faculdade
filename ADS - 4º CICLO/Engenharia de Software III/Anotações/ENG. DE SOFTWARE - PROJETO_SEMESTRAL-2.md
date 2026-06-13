ENGENHARIA DE SOFTWARE - PROJETO SEMESTRAL ( reposição )

- Objetivo
 + prosseguir com o desenvolvimento do projeto dos modelos de camadas de arquiteturas
 + dar continuidade entre os tópicos anteriores e o seguintes: "7.0 - Visão de Processos", "8.0 - Visão de Implantação" e "9.0 - Visão Implementação"
 + proposta final do projeto é compreender os processos de construção do projeto, desde a análise e levantamento de requisitos até a consolidação da arquitetura
 + período de entrega: 11/06 ( prova + entrega do projeto ) 

-----------------------------------------------------------

** ELEMENTOS TÉCNICOS - CAMADAS **
 
 - VISÃO DE PROCESSO
  + diagrama de sequência
  + diagrama de atividade
  + fluxo de autenticação
  + fluxo de pagamento
  + comunicação entre API's
  + processamento de eventos

 - VISÃO DE IMPLEMENTAÇÃO
  + componentes do sistema
  + divisão em microsserviços
  + organização dos pacotes
  + dependências internas
  + frameworks utilizados
  + barramento de integração

 - VISÃO DE IMPLANTAÇÃO
  + topologia da infraestrutura
  + containers Kubernets
  + orquestração Kubernets
  + servidores web
  + banco de dados
  + balanceamento de carga
  + comunicação segura HTTPS

 - Protocolo de Comunicação Padrão
  + HTTPS ( distribuído / remoto )
  + TCIP ( alinhado / local ) 

 - Modelos de Arquiteturas
  + Arquitetura de N-Camadas
  + Arquitetura de Microsserviços
  + Arquitetura Orientada a Eventos

 - Exemplo de plataforma direcionada a serviços e-commerce: 
  + ViaVarejo

---------------------------------------

** ANOTAÇÃO **

 + é importante priorizar os principais casos de usos mais complexos 
 + é necessário compreender os elementos implementados entre camadas para oferecer melhor definição de segmentos 
 + apoia-se em uso de materiais válidos sobre os conteúdos abordados por padronizações e normas, como documentações relacionadas ao UML e outros diagramas
 + classe de fronteira ( diagrama sequencial ): elemento denominado como 'boundary' que recebe e envia informações coletadas pela tela 
 + dentro da seção 7.0 em "Diagrama de Sequência" e "Diagrama de Atividade", devemos escolher 2 casos de usos e criar diagramas 
 + dentro da seção 8.0 em "Visão de Implementação", deve ser apresentado e executado os processos e as funcionalidades como uso de barramento para integração de protocolos de comunicação, etc. 
 + referente a seção de "Visão de Implantação", baseia-se ao modelo desenvolvido no documento compartilhado 'ITRP'
 + consuma os materiais selecionados pelo conteúdo original por cada corporação

** AVISOS **

 1º - DESENVOLVA A ARQUITETURA DO PROJETO ( Visão de Implementação )
 2º - ESCOLHA E DEFINA O USO DE MÁQUINAS DE IMPLANTAÇÃO ( Visão de Implantação ) 
 

** EXEMPLO **

- 7.0 - Visão de Processos 
 - Diagrama de Sequencia
  -> Título de UC:
  -> revisar / definir os requisitos levantados
  -> basear em documentação do LucidChart / SparkSystem 

 - 8.0 - Visão de Implantação
  - Diagrama de Componentes
  -> relato de componentes
  -> relato de nós 
  -> definição de escolha de arquitetura 

 - 9.0 - Visão de Implementação
  - Diagrama de Componentes
   -> descrição de ponto de vista da arquitetura
   -> descrição geral da estrutura de arquitetura 
   -> diagramar a estrutura da arquitetura do projeto
   -> diagramar a arquitetura de camadas ( model / view / controller )
   -> diagramar a arquitetura de serviços ( N-camadas / Microsserviços / EDA )
   -> desenvolver uma lista sobre todas as ferramentas utilizadas, descrevendo cada camada existentes no sistemas ( externas / internas ) para a construção de componentes ( ex: Figma (camada view), ORACLE ( SGBDR ) )
   
 - 10.0 - Visão de Dados ( opcional )
  -> área relacionada a descrição do armazenamento de dados persistentes do sistema
  -> descrever a exibição dos valores armazenados em formato de texto
  -> mencionar a escolha do armazenamento de dados e descrever ao implementar

 - 11.0 - Tamanho e Desempenho ( opcional )
  -> área relacionada a menção dos requisitos não funcionais

 - 12.0 - Qualidade ( opcional ) 
  -> sessão direcionada a descrição de recursos ( validação de índice de qualidade entre diferentes modelos de normas e padrões ) 
