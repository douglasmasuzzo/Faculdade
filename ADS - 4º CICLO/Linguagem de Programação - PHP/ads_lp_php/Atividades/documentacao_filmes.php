<?php
/*
    # DOCUMENTAÇÃO TÉCNICA: Catálogo de Filmes #
        Esta documentação descreve o funcionamento detalhado do arquivo 'catalogo_filmes.php', 
        uma aplicação single-page (SPA-like) que utiliza PHP para persistência em sessão, 
        CSS para estilização e JavaScript para controle de fluxo do formulário.

    ## 1. Bloco PHP - Processamento de Dados (Back-end) ##
        (l. 2) session_start(): Inicializa a sessão no servidor. Essencial para que os dados do catálogo persistam entre os recarregamentos da página.
        (l. 4-6) Verificação da Sessão: Checa se a chave 'filmes' existe na superglobal $_SESSION. Caso contrário, inicializa-a como um array vazio para evitar erros de índice.
        (l. 8) Captura da Ação: Utiliza o operador de coalescência nula (??) para obter o valor de 'acao' enviado via POST. Se não houver envio, define como 'Sem ação'.
        (l. 10) Verificação de Método: Garante que o processamento de dados ocorra apenas quando o formulário for submetido via método POST.
        (l. 12) Filtro de Ação: Verifica se a intenção do usuário é 'adicionar' um novo registro.
        (l. 13-14) Operadores Ternários: Capturam 'titulo' e 'genero' do POST. Caso os campos venham vazios, definem valores padrão para evitar inconsistência no array.
        (l. 16-21) Persistência: Verifica se os campos não estão vazios e anexa um novo array associativo contendo o título e gênero ao array principal de filmes na sessão.

    ## 2. Estrutura de Estilização (CSS) ##
        (l. 28-118) Bloco Style: 
        - Define o layout responsivo e centralizado através da classe '.container' e '.card'.
        - Estiliza elementos de formulário (input, label) para melhor usabilidade (UX).
        - Implementa classes específicas para botões (btn-add, btn-end) com efeitos de 'hover' para feedback visual.
        - Formata a lista de exibição final (ul, li) com sombras e arredondamentos.

    ## 3. Lógica de Controle (JavaScript) ##
        (l. 121-131) Função enviarAcao(tipo):
        - Esta função intercepta o clique nos botões antes do envio.
        - (l. 123) Altera o valor do campo oculto (hidden input) 'acao' para 'adicionar' ou 'encerrar'.
        - (l. 125-128) Condicional de Encerramento: Se a ação for 'encerrar', remove a obrigatoriedade (required) dos campos de input via DOM, permitindo que o usuário visualize a lista sem precisar preencher um novo filme.
        - (l. 130) form.submit(): Dispara o envio programático do formulário.

    ## 4. Estrutura do Documento (HTML) ##
        (l. 136-155) Interface do Usuário:
        - Renderiza o formulário de cadastro com inputs de texto.
        - (l. 147) Hidden Input: Campo crucial que transporta a decisão da lógica JS para o PHP.
        - (l. 150-151) Botões de Tipo "button": Impedem o envio padrão do formulário, delegando o controle para a função JS.

    ## 5. Exibição de Resultados (PHP Dinâmico) ##
        (l. 160-174) Bloco de Visualização:
        - (l. 162) Condicional de Exibição: A lista só é processada e mostrada se a variável '$acao' for igual a 'encerrar'.
        - (l. 165) empty($_SESSION['filmes']): Verifica se há dados gravados antes de tentar renderizar a lista.
        - (l. 168-170) Laço Foreach: Itera sobre o array de filmes na sessão, gerando itens de lista (li) dinamicamente.
        - htmlspecialchars(): Função de segurança utilizada para sanitizar os dados de saída, prevenindo ataques de XSS (Cross-Site Scripting).
*/
?>