<?php
    session_start();

    if ( !isset( $_SESSION[ 'filmes' ] ) ){
        $_SESSION[ 'filmes' ] = [];
    }

    $acao = $_POST[ 'acao' ] ?? 'Sem ação';

    if ( $_SERVER[ 'REQUEST_METHOD' ] == 'POST' ){
            
        if ( $acao == 'adicionar' ){
           $titulo = isset($_POST['titulo']) ? trim($_POST['titulo']) : "";
           $genero = isset($_POST['genero']) ? trim($_POST['genero']) : ""; 

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
            width: 450px;
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
            box-sizing: border-box;
        }

        input:focus {
            border-color: #007bff;
            outline: none;
        }

        .buttons {
            display: flex;
            justify-content: space-between;
            gap: 10px;
        }

        button {
            flex: 1;
            padding: 10px 15px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-weight: bold;
            transition: background 0.3s;
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
            border-left: 5px solid #007bff;
        }

        .empty {
            text-align: center;
            color: #777;
        }

        .footer-info {
            text-align: center;
            font-size: 11px;
            color: #999;
            margin-top: 20px;
        }
    </style>

    <script>
        function enviarAcao( tipo ){
            const form = document.getElementById('formFilme');
            const titulo = document.getElementById('titulo').value.trim();
            const genero = document.getElementById('genero').value.trim();
            
            document.getElementById('acao').value = tipo;

            if ( tipo === 'adicionar' ){
                if ( titulo === "" || genero === "" ){
                    alert( "ERRO: Por favor, preencha o Título e o Gênero antes de adicionar!" );
                    return;
                }
            }

            form.submit();
        }
    </script>

</head>
<body>

    <div class="container">
        <div class="card">
            <h2>Catálogo de Filmes</h2>
            <form method="POST" id="formFilme" action="catalogo_filmes.php?t=<?php echo time(); ?>">
                <label for="titulo">Título do Filme:</label>
                <input type="text" name="titulo" id="titulo">

                <label for="genero">Gênero:</label>
                <input type="text" name="genero" id="genero">

                <input type="hidden" name="acao" id="acao">

                <div class="buttons">
                    <button type="button" class="btn-add" onclick="enviarAcao( 'adicionar' )">Adicionar</button>
                    <button type="button" class="btn-end" onclick="enviarAcao('encerrar')">Encerrar e Visualizar</button>
                </div>
            </form>
        </div>

        <?php
            if ( $acao == 'encerrar' ){
                echo "<hr>";
                echo "<h3>Lista de Filmes Registrados:</h3>";

                if ( !empty( $_SESSION[ 'filmes' ] ) ){
                    echo "<ul>";
                        foreach( $_SESSION[ 'filmes' ] as $filme ){
                            echo "<li><b>TÍTULO: </b>" . htmlspecialchars( $filme[ 'titulo' ] ) . " <br> <b>GÊNERO: </b>" . htmlspecialchars( $filme[ 'genero' ] ) . "</li>"; 
                        }
                    echo "</ul>";
                    
                    $_SESSION[ 'filmes' ] = [];
                    echo "<p class='empty'><i>A sessão foi reiniciada.</i></p>";
                } else {
                    echo "<p class='empty'>Nenhum filme registrado nesta sessão.</p>";
                }
            }
        ?>

        <div class="footer-info">
            Página atualizada em: <?php echo date('H:i:s'); ?> (Timestamp: <?php echo time(); ?>)
        </div>
    </div>
</body>
</html>