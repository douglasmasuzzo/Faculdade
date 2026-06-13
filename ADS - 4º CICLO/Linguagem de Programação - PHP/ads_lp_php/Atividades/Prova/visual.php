<?php
/**
 * Inicia a sessão no topo do arquivo. 
 * Isso é obrigatório antes de qualquer saída HTML para que os cookies de sessão funcionem.
 */
session_start(); 

// --- BLOCO DE PROCESSAMENTO (MOVIDO PARA O TOPO) ---
// Inicializa o array de filmes na sessão se ele não existir
if (!isset($_SESSION['filmes'])) {
    $_SESSION['filmes'] = [];
}

$mensagemSucesso = "";
$mensagemErro = "";

// Processamento do envio do formulário (Lado do Servidor)
if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['acao']) && $_POST['acao'] === 'adicionar') {
    $titulo = trim($_POST['titulo']); 
    $genero = trim($_POST['genero']);

    if (!empty($titulo) && !empty($genero)) {
        $isDuplicado = false;

        // Verifica duplicidade
        foreach ($_SESSION['filmes'] as $filmeExistente) {
            if (strcasecmp($filmeExistente['titulo'], $titulo) === 0) {
                $isDuplicado = true;
                break;
            }
        }

        if ($isDuplicado) {
            $mensagemErro = "Erro: Este filme já está na sua lista!";
        } else {
            // Adiciona o filme ANTES de renderizar o JS no head
            $_SESSION['filmes'][] = ['titulo' => $titulo, 'genero' => $genero];
            $mensagemSucesso = "Filme Adicionado com Sucesso!";
        }
    }
} else if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['negacao']) && $_POST['negacao'] === 'encerrar') {
    // Destrói os dados no servidor
    session_destroy();
    $_SESSION = []; 
    $mensagemSucesso = "Sessão Encerrada";
}
// --- FIM DO BLOCO DE PROCESSAMENTO ---
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>CINEMÃO</title>
    <link rel="stylesheet" href="bonito.css?v=<?php echo time(); ?>" >
    <script>
        /**
         * Convertemos o array da sessão PHP para uma constante JavaScript global.
         */
        const listaFilmesJS = <?php echo json_encode($_SESSION['filmes'] ?? []); ?>;
    </script>
    <!-- O atributo 'defer' garante que o script execute apenas após o HTML ser processado -->
    <script src="registro.js?v=<?php echo time(); ?>" defer></script>
</head>
<body>
    <h1>Bem-vindo ao CINEMÃO</h1>
    
    <h2>Meus filmes favoritos</h2>

    <!-- O formulário utiliza o método POST para não expor os dados na URL.
         O ID 'formFilme' é utilizado pelo registro.js para validação via JavaScript. -->
    <form id="formFilme" action="visual.php" method="post">

    <label>Titulo do filme</label><br>
    <div class="filme">
        <input type="text" id="titulo" name="titulo" placeholder="Digite o título do filme">
        <span id="erro-titulo" class="error-message">POR FAVOR, PREENCHA O TÍTULO.</span>
    </div>

    <label>Genero do filme</label><br>
    <div class="filme">
        <input type="text" id="genero" name="genero" placeholder="Digite o gênero do filme">
        <span id="erro-genero" class="error-message">POR FAVOR, PREENCHA O GÊNERO.</span>
    </div>

    <button type = "submit" name="acao" value="adicionar">Adicionar</button>
    <button type = "submit" name="negacao" value = "encerrar">Encerrar Sessão</button>

    </form>

    <?php
    // Exibe mensagens de feedback processadas no topo
    if ($mensagemErro) echo "<h3 style='color: #e50914;'>$mensagemErro</h3>";
    if ($mensagemSucesso) echo "<h3 style='color: #4CAF50;'>$mensagemSucesso</h3>";

    /**
     * Listagem dos Filmes
     */
    if (!empty($_SESSION['filmes'])) {
        echo "<h2>Filmes na sua lista:</h2>";
        foreach ($_SESSION['filmes'] as $index => $filme) {
            echo "<div class='item-filme'>";
            echo "<p><strong>" . ($index + 1) . "º Título:</strong> " . htmlspecialchars($filme['titulo']) . "</p>";
            echo "<p><strong>Gênero:</strong> " . htmlspecialchars($filme['genero']) . "</p>";
            echo "</div>";
        }
    }

    ?>

</body>
</html>