# **ENG. DE SOFTWARE - ARQUITETURA DE SISTEMA (AULA02)** #
 
-----------------------------------------------

## Tópicos ##
 - Estilos de Arquiteturas
 - Modelagem 'Client-Server'
 - Modelo em Camadas

### _Organização do Sistema em Arquitetura_ ###
 > **A organização de um sistema reflete a estratégia básica utilizada para estruturá-lo. O arquiteto precisa analisar como será o modelo geral organizacional do sistema** 

 > **"Um estilo de arquitetura é um padrão organização do sistema". --GARLAN E SHAW( 2003 )**

### _Sistemas Distribuídos_ ###

 > **"Um sistema distribuído é aquele no qual os componentes localizados em computadores interligados em rede se comunicam e coordenam suas ações passando por mensagens" --GEORGE COLOURIS** 

 - Fatores motivadores
    + Compartilhamento de recursos e sistemas
    + Interligação em rede
    + Computação móvel
    + Tendência de considerar o sistema distribuído como um possível serviço público
    + Serviços oferecidos através da internet 

## Modelagem - 'Cliente-Servidor' ##

 > **Modelo em que o sistema é organizado como um conjunto de serviços de servidores e clientes que utilizam esses serviços**

 - _Componentes_
    + Conjunto de clientes que solicita e utilzia os serviços oferecidos por servidores. Os sistemas independentes com várias instâncias sendo executadas simultâneamente.
    
    + Uma rede que permite os clientes acessarem esses tipos de serviços, assim o modelo 'client-server' é um tipo de sistema distrubuído.

    + Os clientes precisam saber os nomes dos servidores disponíveis e os serviços que eles fornecem. Os clientes acessam os serviços fornecidos pelo servidor por meio de chamadas remotas de procedimento usando um protocolo ( "http" )

 - _Vantagens_
    + É uma arquitetura distribuída
    + Facilidade de expansão do sistema

### _Tipos de Clientes_ ###

 - **Thin Client ( Cliente Fino )**
    > O processamento de aplicação e o gerenciamento de dados é realizado no servidor. O cliente é responsável, simplesmente por executar o software de apresentação

 - **Fat Client ( Cliente Gordo )**
    > Especialmente concebido para executar a maior parte do processamento em aplicações de client/server. Neste modelo, o servidor é responsável somente pelo gerenciamento de dados. O software do cliente implementa a lógica da aplicação e as interações com o usuário do sistema

## Modelo em Camadas ##
 1. Organiza um sistema em camadas, cada uma das abordagens fornece um conjunto de serviços
 2. A abordagem em camadas apoia o desenvolvimento incremental de sistemas 
 3. A medida que uma camada é desenvolvida, alguns serviços fornecidos por essa camada podem ser disponibilizadas para os usuários
 4. A arquitetura de sistema é modificável e portável 

 > O sucesso para o desenvolvimento de aplciações com tecnologia orientada a objetos está ligada à arquitetura que o sistema implementa. A tendência indica que a organização da aplicação em camadas e na observação dos padrões utilizados pelo mercado, tem contribuído para os desafios de produzir aplicativos com segurança, eficientes, reutilizáveis e com desenvolvimento mais rápido

 ### _Aplicações Monolíticas_ ###
 > Na era do reinado do mainframe e comuputadores de grande porte, as aplicações eram desenvolvidas para rodar em um único lugar. A entrada de dados, processamento, manipulação de dados alocavam a lógica de negócio dentro de uma máquina

 ### _Modelo - Dupla Camada_ ###
 > A necessidade de compartilhamento de dados simultaneamente fez surgir a aplicação de Duas Camadas. O modelo de Dupla Camadas a base de dados foi separada e começamos a utilizar o servidor de banco de dados, os aplicativos eram instalados em clientes contendo toda a lógica da aplicação. O gerenciamento de versões era um grande problema, pois cada alteração precisam ser atualizados em modelos 'client-server'.

 ### _Modelo - Tripla Camada_ ###
 > Com o advento da internet, a necessidade de portabilidade houve um movimento para separação de camadas de negócio, diferentemente da apresentação do sistema. Os usuários podem acessar aplicaçações sem ter que instalar os sistemas em máquinas locais. O sistema pode ficar mais flexível, permitindo que as partes possam ser alteradas de forma independete, pois as camadas lógicas e físicas estão separadas neste modelo  


 - _Modelagem Orientada a Objetos_
  1. Modulariedade
  2. Redução de dependências
  3. Frágil acoplação
  4. Ágil manutenibilidade durante a evolução do processo

## Padrão MVC ##

 > O _padrão MVC_ fornece um framework para divisão de camadas de uma aplicação, um padrão para organizar sua aplicação. 

 > **MODEL** : É a camada que **representa os dados do usuários**, provendo meios de acesso ( leitura e escrita ) aos dados.

 > **VIEW** : Representa as interfaces com o usuário, do qual o sistema interage diretamente com o usuário final, gerando arquivos e exibido-os em formato HTML | XML | RSS | CSV. 

 > **CONTROLLER** : Define o comportamento da aplicação, interpretando as ações do usuário e mapeia-as para as requisições do camada 'model'. Esta camada controla as duas outras camadas e aplicações como um todo em geral. Atente-se que a camada 'Controller' não busca os dados ( responsabilidade atribuida a camada 'MODEL' ) e não exibe-os ( responsabilidade da camada 'VIEW' )
 
 - _Descrição do "Padrão MVC"
  - Camada de Apresentação ( **Model** )
  - Camada Lógica de Negócio ( **View** )
  - Camada de Persistência ( **Controller** )

 ### _Metáfora de Gravação de Dados_ ###

 - _Usuário_
   - Ações na interface são enviadas ao 'Controller' 

 - _Controller_
   - O controlador analisa a ação e manipula o modelo
 
 - _Model_ 
   - A camada notifica a camada visual sobre a mudança de estado 

 - _Visualização_
   - A visualização é atualizada para o usuário

 > **"Um estilo de arquitetura é um padrão de organização do sistema" --Garlan e Shaw( 2003 )**

 [**Referência de Material : Arquitetura de Software** ]( https://learn.microsoft.com/pt-br/azure/architecture/guide/architecture-styles/ )

 [**Referência de Material : Padrão MVC** ](https://learn.microsoft.com/pt-br/aspnet/core/mvc/overview?view=aspnetcore-10.0)