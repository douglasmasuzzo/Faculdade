# **Projeto Fridge – Versão Original (Acadêmica)** #

## Visão Geral ##
Este projeto é uma aplicação Java Spring Boot desenvolvida para gerenciar o inventário de alimentos em uma geladeira.
A aplicação permite o controle de itens, quantidades, preços e datas de validade, consolidando conceitos fundamentais de arquitetura em camadas,
persistência de dados com Spring Data JPA e exposição de uma API REST.

Este repositório corresponde à versão original do projeto Fridge, desenvolvido no contexto acadêmico da disciplina Linguagem de Programação – Java, no curso de Análise e Desenvolvimento de Sistemas.
O projeto teve como principal objetivo a aplicação prática dos conceitos iniciais de Spring Boot, arquitetura em camadas e persistência de dados, servindo como base para estudos posteriores e para a evolução do sistema.

## Objetivos ##
Esta versão representa o primeiro estágio funcional do projeto, e é composto por :

  - Introdução ao **SpringBoot**
  - Organização de projetos Java
  - Separação de responsabilidades em camadas
  - Criação de **API REST** simples
  - Persistência de dados utilizando **_JPA ( Java Persistence API )_**
  - Uso de Banco de Dados em Memória ( **H2** )
----------------------------------------------------

### _Estrutura do Projeto_ ###
A aplicação segue o padrão arquiteturial em camadas recomendada pelo _Spring_

> **Controller | Repository | JPA/Hibernate | Banco de Dados**


### _Arquitetura_ ###

- **_Controller_**
  - Responsável por expor os _endpoints **REST**_
  - Gerenciar requisições **HTTP**
  - Recebimento e retorno de dados em formato **JSON**
  - Comunicação com a camada de persistência

- **_Repository_**
  - Responsável pelo acesso de dados
  - Processa operações _CRUD_
  - Abstração de acesso ao Banco de Dados
  - Manipulação do **Spring Data JPA**  

- **_Model_**
  - Responsável por tratamento de entidades entre os domínios de aplicação
  - Uso do comando `` @Entity ``
  - Mapemaento de atributos em colunas
  - Representação do modelo de dados

- **_Service_**
  - Camada responsável pela regra de negócio
  - Centralizar lógica da aplicação
  - Evitar acesso direto ao repositório por ccontrollers
  - Facilitar teste e futuras alterações

### _Persistência de Dados_ ###
- **H2 DataBase**
  - Execução em memória
  - Inicialização automática pelo SpringBoot
  - Configuração simples e execução rápida

------------------------------------------------------------------------------

## Considerações Finais ##
A versão original do Fridge representa um marco importante no processo de aprendizado, documentando a transição entre conceitos básicos
e uma aplicação Spring Boot funcional. Sua preservação permite acompanhar a evolução técnica e arquitetural do projeto ao longo do tempo.
Este repositório deve ser interpretado como um registro acadêmico, não como uma solução final. Segue abaixo para conhecer a versão atual do projeto desenvolvido

[**Curso_JAVA - Projeto "Sistema de Gestão Escolar"**](https://github.com/douglasmasuzzo/Curso_JAVA/tree/main/Projeto%20-%20SpringBoot/Projeto_Java/GestaoEscolar) 
