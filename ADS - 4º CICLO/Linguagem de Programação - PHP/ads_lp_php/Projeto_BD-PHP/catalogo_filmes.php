<?php
    session_start();

    if ( !isset( $_SESSION[ 'filmes' ] ) ){
        $_SESSION[ 'filmes' ] = [];
    }

    $acao = $_POST[ 'acao' ] ?? 'Sem ação';

    if ( $_SERVER[ 'REQUEST_METHOD' ] == 'POST' ){
            
        if ( $acao == 'adicionar' ){
           $titulo = $_POST[ 'titulo' ] ? $_POST[ 'titulo'] : "Filme sem título";
           $genero = $_POST[ 'genero' ] ? $_POST[ 'genero' ] : "Filme sem gênero"; 

            if ( !empty( $titulo ) && !empty( $genero ) ){
                $_SESSION[ 'filmes' ][] = [
                    'titulo' => $titulo,
                    'genero' => $genero
                ];
            }
        }
    }
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Catálogo de Filmes</title> 

    <style>
        body{
            font-family: Arial, sans-serif;
            background-color: #f4f6f9;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 400px;
            margin: 60px auto;
        }

        .card {
            background: #fff;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        }

        h2, h3 {
            text-align: center;
            color: #333;
        }

        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }

        input {
            width: 100%;
            padding: 10px;
            border-radius: 6px;
            border: 1px solid #ccc;
            margin-bottom: 15px;
            font-size: 14px;
        }

        input:focus {
            border-color: #007bff;
            outline: none;
        }

        .buttons {
            display: flex;
            justify-content: space-between;
        }

        button {
            padding: 10px 15px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-weight: bold;
        }

        .btn-add {
            background-color: #007bff;
            color: white;
        }

        .btn-add:hover {
            background-color: #0056b3;
        }

        .btn-end {
            background-color: #28a745;
            color: white;
        }

        .btn-end:hover {
            background-color: #1e7e34;
        }

        ul {
            list-style: none;
            padding: 0;
            margin-top: 20px;
        }

        li {
            background: #ffffff;
            padding: 12px;
            border-radius: 6px;
            margin-bottom: 10px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.08);
        }

        .empty {
            text-align: center;
            color: #777;
        }
    </style>

    <script>
        function enviarAcao( tipo ){
            const form = document.getElementById('formFilme');
            document.getElementById('acao').value = tipo;

            if ( tipo === 'encerrar' ){
                document.getElementById( 'titulo' ).required = false;
                document.getElementById( 'genero' ).required = false;
            }

            form.submit();
        }
    </script>

</head>
<body>

    <div class="container">
        <div class="card">
            <h2>Catálogo de Filmes</h2>
            <form method="POST" id="formFilme">
                <label>Título do Filme:</label><br>
                <input type="text" name="titulo" id="titulo" required><br><br>

                <label>Gênero:</label>
                <input type="text" name="genero" id="genero" required><br><br>

                <input type="hidden" name="acao" id="acao">

                <div class="buttons">
                    <button type="button" classe="btn-add" onclick="enviarAcao( 'adicionar' )">Adicionar</button>

                    <button type="button" classe="btn-end" onclick="enviarAcao('encerrar')">Encerrar e Visualizar</button>
                </div>
            </form>
        </div>
            <hr>
         <h3>Lista de Filmes:</h3>

        <?php
            
            if ( $acao == 'encerrar' ){
                echo "<h3>Lista de Filmes Registrados:</h3>";

                if ( !empty( $_SESSION[ 'filmes' ] ) ){
                    echo "<ul>";

                        foreach( $_SESSION[ 'filmes' ] as $filme ){
                            echo "<li><b>TÍTULO: </b>" . htmlspecialchars( $filme[ 'titulo' ] ) . " | <b>GÊNERO: </b>" . htmlspecialchars( $filme[ 'genero' ] ) . "</li>"; 
                        }

                    echo "</ul>";
                } else {
                    echo "<p>Nenhum filme registrado</p>";
                }
            }
        ?>
    </div>
</body>
</html>