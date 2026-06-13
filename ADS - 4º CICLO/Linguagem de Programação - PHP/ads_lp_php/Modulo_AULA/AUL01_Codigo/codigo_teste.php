<?php echo "CÓDIGO EM PHP"; ?>

<?= "TESTE DE EXECUÇÃO"; ?>

<script language="php">
    "TESTE DE EXECUÇÃO 2";
</script>

<?php
    /*
        =========================================================
        CENÁRIO: SCRIPT SOMENTE EM PHP

        Este arquivo contém exclusivamente lógica de processamento.
        Não há marcação HTML embutida.

        Mecanismo de execução:
        1. O navegador envia a requisição ao servidor.
        2. O servidor identifica o arquivo como .php.
        3. O interpretador PHP executa toda a lógica.
        4. O retorno pode ser:
        - JSON (API)
        - Redirecionamento
        - Texto puro
        - HTML gerado dinamicamente

        Aplicação típica:
        - APIs REST
        - Processamento de formulários
        - Manipulação de banco de dados
        - Controladores (arquitetura MVC)

        Vantagem:
        Alta separação entre lógica e apresentação.

        Observação:
        O código PHP nunca é enviado ao cliente,
        apenas o resultado processado.
        =========================================================
    */
?>