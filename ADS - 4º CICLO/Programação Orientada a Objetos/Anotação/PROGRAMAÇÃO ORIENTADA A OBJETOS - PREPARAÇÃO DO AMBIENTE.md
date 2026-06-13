# **P.O.O - PREPARAÇÃO DO AMBIENTE** #

---------------------------------------------

## Sumário ##
  1. JDK / JSE ( Java Development Kit | Java Standard Edition ) 
  2. Editores de Textos e IDE
  3. Gerenciadores de Dependências
  4. Agentes de Codificação
  5. Preparação de Ambiente

## Conteúdo : JDK / JSE ##
  - OpenJDK ( Java Development Kit )
    + open source
    + atualizado desde Java 7
    + base do OracleJDK
    + desenvolvimento síncrono após Java 11
    + voltado ao uso acadêmico
    + escolha padrão por gratuidade s/ questões comerciais

  - JDK ( Java Development Kit - Comercial )
    + inclusão de recursos comerciais pagos
    + suporte de longo prazo ( LTS )
    + modelo de licença mais permissiva ( NTFC )
    
  - GRAALVM ( Graal Virtual Machine )
    + lançado recentemente ( 2019 ) 
    + extensão do JDK
    + trata-se de uma JVM ( Java Virtual Machine ) com maior desempenho
    + interoperabilidade com Python | JS | R
    + Native Imagem
    + compilação Ahead-of-Time ( AOT )
  
  - OUTRAS DISTRIBUIÇÕES 
    + Amazon Corretto
    + AdoptOpenJDK 
    + Microsoft OpenJDK ( build )

## Conteúdo : Editores de Texto ( IDE ) ##
  - IntelliJ ( IDE )
    + lançado em 2001 ( JetBrains )
    + recursos avançados de refatoração de código e análise estática
    + alternativa gratuita / paga
    + apresenta ergonomia, builds integradas ( Maven / Gradle ) e ecossistema de plugins 
    + code intelligence

  - Virtual Studio Code ( Editor de Texto ) 
    + lançado pela Microsoft ( 2015 )
    + editor de texto leve e extensível
    + focado para desenvolvimento web
    + base viável com o 'extension pack for Java'
    + desenvolvimento de microsserviços e projetos com SpringBoot
    + leve e rápido 
    + escolha padrão de meio acadêmico

  - Eclipse ( IDE )
    + lançado em 2001 ( IBM )
    + IDE padrão de código aberto
    + arquitetura baseada em plugins 
    + Spring Tools Suite ( STS )
    + Android Studio

  - NetBeans ( IDE )
    + lançado em 1996 ( SunMicrosystems )
    + lançado por meio estudantil
    + desenvolvimento de interfaces gráficas ( Swing )
   
  ### _Ranking de Uso : IDE_ ###
    1. VSCODE
    2. IntelliJ
    3. Virtual Studio
    4. Vim
    5. Notepad++

## Conteúdo : Gerenciador de Dependências ##
 Os gerenciadores de dependências são o pilar de desenvolvimento em Java, otimizando e automizando processos de instalar bibliotecas, compilar e executar códigos, e empacotar a aplicação  

  ### _Ranking de Uso - Dependências_ ###
    1. Maven
    2. Gradlle
    3. Apache Ant
    4. SBT
    5. Bazel

  - GRADLE
    + 2007
    + criado para substituir limitações de Maven
    + usado especialmente em Kotlin e Groovy
    + DLS ( Domain-Specific Language )
    + representado por flexibilidade e customização
    + nível de performance superior e expressividade em scripts ( build )
    + Google incorporou como ferramenta de desenvolvimento padrão do Android
    + especialmente aplicado em projeto moníliticos ou builds complexos

  - APACHE MAVEN
    + 2004 ( Apache )
    + convenção sobre configurações
    + repositório centralizado de dependências
    + padronização de estruturas de diretórios e ciclo de vida do build 
    + configuração declarativo ( POM.xml - Project Object Model )
    + madura | estabilidade | útil
    + reconhecido por integrações e seus plugins

  - Apache ANT
    + 2000
    + predecessor do Maven
    + baseada em script.XML 
    + não possui um sistema de gerenciamento de dependências
    + Apache Ivy
    + definição explícita de tarefas
    + verboso e menos padronizado
    + ferramentas legada e limitada  

## Conteúdo : Agente de I.A ##  
  - AGENTE DE CODIFICAÇÃO
    + ferramenta de inteligência artificial
    + auxílio de desenvolvedores
    + pair-programming
    + auto-complemento de código
    + geração de código ( linguagem natural )
    + explicação | documentação de código
    + atuação em chat 
    + integrado com modelo de grande linguagem ( LLM ) 

  - HISTÓRIA
    + 1990 / 2000
      + ferramenta de autocomplementação baseada em análise estática ( métodos e variáveis )
    + 2010
      + ferramentas como 'Kite | Tabmine' com modelos de ML para prever sequências de códigos com padrões de aprendizagem
    + 2020... 
      + compreensão de linguagem natural e criação de blocos de códigos funcionais
      + lançamento do GitHub Copilot / ChatGPT / Gemini / Cursor etc...
      + popularização de agentes de codificação
  
  ### _Agente - Google Gemini CLI_ ###
    + 60 requisições | 1.000 requisições p/ dia 
    + Modelo de agente ( 3.1 pro ) | 1.000 tokens
    + Google Search | Grounding | Manipulação de Arquivos | Web Fetching 
    + Suporte ao MCP ( Model Context Protocol ) 
    + Projeto para linha de comando 
    + Open Source ( Apache 2.0 Licensed )

## MENÇÕES ##

  - instalar VM 
    + https://www.virtualbox.org/wiki/Downloads
  
  - instalar GEMINI CLI
    + https://youtu.be/92Ek0nd8qjA?si=uNO7MlPSKn_3vXEf

  - videoaulas - modelos de agentes
    - GEMINI
      + https://youtu.be/a1PE13JjhAw?si=KyWf-eWGunAFF9rU

    - CHATGPT
      + https://youtu.be/GjginLj7RlA?si=HoPASGj2_3ijcUvR
  
  - instalar Google Antigravity
    + https://antigravity.google/download
  
  - GitHub
    + https://github.com/google-gemini/gemini-cli

  - prompt
    > **"Olá Gemini! Sou um estudante iniciante em Java. Acabei de instalar o Vscode e o Gemini CLI. O que mais preciso instalar no meu computador para criar e rodar um programa simples em Java que funcione no console usando os gerenciadores de pacotes Mavin e Graddle? Me explique o que é cada coisa e por que eu preciso delas."**

    > **"Agora, me dê os comandos exatos que eu preciso usar no terminal para  criar um projeto Java 'Olá, Mundo!'. Depois, me diga como compilar e executar esse projeto."**