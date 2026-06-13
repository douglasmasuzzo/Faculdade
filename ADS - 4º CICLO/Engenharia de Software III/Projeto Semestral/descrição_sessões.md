# S.E.P – Sistema E-commerce Panini
## Documento de Arquitetura de Software
**Versão:** 1.0  
**Data:** 11/06/2026

---

### Histórico de Revisões

---

## 1. Introdução

[A introdução do Documento de Arquitetura de Software fornece uma visão geral do documento inteiro. Ela inclui a finalidade, o escopo, as definições, os acrônimos, as abreviações, as referências e a visão geral do Documento de Arquitetura de Software.]

[Esta seção define o papel ou finalidade do Documento de Arquitetura de Software, na documentação do projeto como um todo, e descreve rapidamente a estrutura do documento. O público-alvo específico do documento é identificado, com uma indicação de como ele espera usar o documento.]

---

## 2. Identificação do Projeto

* **Projeto:** S.E.P - Sistema E-commerce Panini
* **Requisitante:** Panini Brasil
* **Gerente de Projetos:** Douglas Masuzzo Brasilio e Martha Beatriz Valério

---

## 3. Representação Arquitetural

Esta seção descreve qual é a arquitetura de software do sistema atual e como ela é representada. A partir da Visão de Casos de Uso, Visão Lógica, Visão de Processos, Visão de Implementação e Visão de Implantação, enumera as visões necessárias e, para cada visão, explica quais tipos de elementos de modelo ela contém.

---

## 4. Metas e Restrições da Arquitetura

[ Esta seção descreve os requisitos e objetivos do software que têm algum impacto sobre a arquitetura; por exemplo, segurança, garantia, privacidade, uso de um produto desenvolvido internamente e pronto para ser usado, portabilidade, distribuição e reutilização (lista de requisitos não funcionais, condições e limites). ]

[ Ela também captura as restrições especiais que podem ser aplicáveis: 
estratégia de design (UML) implementação, ferramentas de desenvolvimento e que dão suporte a arquitetura escolhida. ]

---

## 5. Visão de Casos de Uso

Esta seção lista casos de uso ou cenários do modelo de casos de uso quando eles representam funcionalidade central e significativa do sistema final ou, quando têm uma grande cobertura arquitetural — eles experimentam muitos elementos arquiteturais ou quando enfatizam ou ilustram um ponto complexo e específico da arquitetura.

[ Esta seção ilustra o funcionamento do software, apresentando algumas realizações (ou cenários) de casos de uso selecionadas e explica como os diversos elementos do modelo de design contribuem para a respectiva funcionalidade. Lista de casos de uso do sistema, e pequena descrição. O nome dos casos de uso e numeração deverão estar de acordo com o número do requisito funcional da matriz de rastreabilidade., diagrama de casos de uso (modelo completo de caso de uso do projeto), separado por ator. ]

[ Esta seção ilustra o funcionamento do software, apresentando algumas realizações (ou cenários) de casos de uso selecionadas e explica como os diversos elementos do modelo de design contribuem para a respectiva funcionalidade.  Lista de casos de uso do sistema, e pequena descrição. O nome dos casos de uso e numeração deverão estar de acordo com o número do requisito funcional da matriz de rastreabilidade., diagrama de casos de uso (modelo completo de caso de uso do projeto), separado por ator. ] 


---

## 6. Visão Lógica

Esta seção descreve as partes significativas do ponto de vista da arquitetura do modelo de design, como sua divisão em subsistemas e pacotes. Além disso, para cada pacote significativo, ela mostra sua divisão em classes e utilitários de classe. Apresente as classes significativas do ponto de vista da arquitetura e descreva suas responsabilidades, bem como alguns relacionamentos, operações e atributos de grande importância.

### 6.1. Visão Geral

[ Esta subseção descreve toda a decomposição do modelo de design em termos de camadas e de hierarquia de pacotes. Diagramas de pacotes, de cada camada. Ex.: pacote de cadastro de usuário, cadastro de cliente, cadastro de fornecedor, cadastro de produto,(ou seja cadastros). Este pacote existe e dentro dele existem as classes, que serão apresentadas no diagrama de classe no item 1.3. Apresente aqui o diagrama de pacote do sistema, e uma lista para explicar os pacotes, com nome, descrição dos pacotes. ]

### 6.2. Pacotes de Design Significativos do Ponto de Vista da Arquitetura

[ Apresente todo o diagrama de classe do modelo, separe o diagrama de classe por pacote. Crie uma lista, para cada classe significativa no pacote, inclua o respectivo nome, uma breve descrição e, opcionalmente, uma descrição de algumas das suas principais responsabilidades, operações e atributos. ]

### 6.3. Camadas

[ Para cada camada, inclua uma subseção com o respectivo nome, uma lista dos subsistemas localizados na camada e um diagrama de componentes. Diagrama de componentes descrevendo os sistemas e sub-sistemas, componentes das camadas que serão desenvolvidos. Podemos exemplificar: camada da view, back, serviços, armazenamento.(Separados por camada). ]

---

## 7. Visão de Processos

Esta seção descreve a decomposição do sistema em processos leves (threads simples de controle) e processos pesados (agrupamentos de processos leves). Organize a seção em grupos de processos que se comunicam ou interagem. Descreva os modos principais de comunicação entre processos, como transmissão de mensagens e interrupções

[ Represente apenas dois casos de uso , através de um  diagrama de sequência e diagrama de atividades de um processo de negócio que o sistema deverá executar. (então são 4 diagramas) ] 

Esta seção descreve a decomposição do sistema em processos leves (threads simples de controle) e processos pesados (agrupamentos de processos leves). Organize a seção em grupos de processos que se comunicam ou interagem. Descreva os modos principais de comunicação entre processos, como transmissão de mensagens e interrupções

---

## 8. Visão de Implantação

Esta seção descreve uma ou mais configurações da rede física (hardware) na qual o software é implantado e executado. Ela é uma visão do Modelo de Implantação. No mínimo, para cada configuração, ela deve indicar os nós físicos (computadores, CPUs) que executam o software e suas interconexões (barramento, e protocolos de comunicação) É incluído também um mapeamento dos processos da Visão de Processos nos nós físicos.

[ Diagrama de componentes físicos para  implantação. Aqui apresentaremos o diagrama de implantação com os componentes (softwares),  que estarão dentro de cada nó. Lista com o nome dos nós e descrição do nó, e o que ele armazena. ]


---

## 9. Visão da Implementação

Esta seção descreve a estrutura geral do modelo de implementação, a divisão do software em camadas e os subsistemas no modelo de implementação e todos os componentes significativos do ponto de vista da arquitetura,  representados pelo diagrama de componentes. 

[ Do ponto de vista da arquitetura que será utilizada. ]


### 9.1. Visão Geral

[ Esta subseção nomeia e define as diversas camadas e o seu conteúdo, as regras que determinam a inclusão em uma camada específica e as fronteiras entre as camadas. Inclua um diagrama de componentes que mostre os relacionamentos entre as camadas. ]

[ Diagrama geral que demonstra a comunicação entre as camadas do projeto e os componentes principais. Este apresenta a arquitetura a ser utilizada, seus componentes e como eles se comunicam. Fazer uma lista de todas as ferramentas utilizadas em cada camada no sistema. Nome  e descrição. Inclusive ferramentas de fornecedores de cloud e serviços. ] 

---

## 10. Visão de Dados (Opcional)

[ Uma descrição da perspectiva de armazenamento de dados persistentes do sistema. Esta seção será opcional se os dados persistentes forem poucos ou inexistentes ou se a conversão entre o Modelo de Design e o Modelo de Dados for trivial. ]

---

## 11. Tamanho e Desempenho

[ [Uma descrição das principais características de dimensionamento do software que têm um impacto na arquitetura, bem como as restrições do desempenho desejado. ]

---

## 12. Qualidade

[ Uma descrição de como a arquitetura do software contribui para todos os recursos (exceto a funcionalidade) do sistema: extensibilidade, confiabilidade, portabilidade e assim por diante. Se essas características possuírem significado especial, como implicações de segurança, garantia ou privacidade, elas deverão ser delineadas claramente.]

---

## 13. Anexos

[ Relacione aqui eventuais documentos que fazem parte do presente artefato, tais como atas de reunião, cronograma e outros. ]

---

## 14. Referências

Listagem bibliográfica completa e detalhada contendo as referências a documentos internos, sítios na Internet, manuais técnicos, livros ou qualquer outro item de consulta que tenha sido efetivamente utilizado para a confecção e fundamentação deste artefato arquitetural.
