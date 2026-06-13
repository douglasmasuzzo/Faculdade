<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula01 - Construção de Códigos com PHP</title>
</head>
<body>
    <p> CÓDIGO EM HTML </p>
    <?php
        echo "Execução do código em PHP";

        /*
            =========================================================
            CENÁRIO: PHP COM HTML EMBUTIDO (PHP PREDOMINANTE)

            Neste modelo, o arquivo contém majoritariamente lógica PHP,
            com blocos HTML inseridos conforme necessidade.

            Mecanismo:
            - O PHP controla o fluxo da aplicação.
            - Estruturas como IF, WHILE e FOREACH
            determinam quando e como o HTML será exibido.
            - O HTML depende diretamente das decisões da lógica.

            Características:
            - Forte dinamismo.
            - Mistura entre lógica e apresentação.
            - Pode gerar dificuldade de manutenção
            se não houver organização adequada.

            Aplicação comum:
            - Sistemas procedurais tradicionais.
            - Páginas dinâmicas simples.

            Atenção:
            Excesso de lógica misturada com HTML
            pode comprometer legibilidade e escalabilidade.
            =========================================================
        */
    ?>
</body>
</html>