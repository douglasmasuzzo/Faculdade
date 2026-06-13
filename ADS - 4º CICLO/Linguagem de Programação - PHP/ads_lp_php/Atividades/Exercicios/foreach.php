<?php
// Inicializa o array associativo de filmes na sessão
session_start();

if (!isset($_SESSION['filmes'])) {
    $_SESSION['filmes'] = [];
}

// Ação: Adicionar filme via POST (chamada AJAX do JS)
if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['acao'])) {

    if ($_POST['acao'] === 'adicionar') {
        $titulo = trim($_POST['titulo'] ?? '');
        $genero = trim($_POST['genero'] ?? '');

        if ($titulo !== '' && $genero !== '') {
            // Array associativo com chaves 'titulo' e 'genero'
            $_SESSION['filmes'][] = [
                'titulo' => htmlspecialchars($titulo),
                'genero' => htmlspecialchars($genero)
            ];
            echo json_encode(['status' => 'ok', 'total' => count($_SESSION['filmes'])]);
        } else {
            echo json_encode(['status' => 'erro', 'mensagem' => 'Preencha todos os campos.']);
        }
        exit;
    }

    if ($_POST['acao'] === 'encerrar') {
        // Contabiliza usando foreach e retorna HTML da tabela
        $filmes = $_SESSION['filmes'];
        $total  = 0;
        $linhas = '';

        foreach ($filmes as $index => $filme) {
            $num     = $index + 1;
            $titulo  = $filme['titulo'];
            $genero  = $filme['genero'];
            $total++;
            $linhas .= "
            <tr>
                <td class='text-center fw-semibold text-warning'>{$num}</td>
                <td>{$titulo}</td>
                <td><span class='badge bg-secondary px-3 py-2'>{$genero}</span></td>
            </tr>";
        }

        $html = "
        <div class='alert alert-success d-flex align-items-center gap-2 mb-3' role='alert'>
            <i class='bi bi-check-circle-fill fs-5'></i>
            <span>Sessão encerrada! <strong>{$total} filme(s)</strong> cadastrado(s) no total.</span>
        </div>
        <div class='table-responsive'>
            <table class='table table-dark table-hover align-middle rounded-3 overflow-hidden'>
                <thead class='table-warning text-dark'>
                    <tr>
                        <th class='text-center' style='width:60px'>#</th>
                        <th><i class='bi bi-camera-reels me-1'></i> Título</th>
                        <th><i class='bi bi-tag me-1'></i> Gênero</th>
                    </tr>
                </thead>
                <tbody>{$linhas}</tbody>
            </table>
        </div>";

        // Limpa a sessão após encerrar
        $_SESSION['filmes'] = [];
        echo json_encode(['status' => 'ok', 'html' => $html, 'total' => $total]);
        exit;
    }

    if ($_POST['acao'] === 'excluir') {
        $index = isset($_POST['index']) ? (int) $_POST['index'] : -1;

        if ($index >= 0 && isset($_SESSION['filmes'][$index])) {
            $titulo = $_SESSION['filmes'][$index]['titulo'];
            // Remove o elemento e reindexa o array
            array_splice($_SESSION['filmes'], $index, 1);
            $total = count($_SESSION['filmes']);
            echo json_encode([
                'status' => 'ok',
                'titulo' => $titulo,
                'total'  => $total
            ]);
        } else {
            echo json_encode(['status' => 'erro', 'mensagem' => 'Índice inválido.']);
        }
        exit;
    }

    if ($_POST['acao'] === 'visualizar') {
        // Exibe os filmes já adicionados sem encerrar
        $filmes = $_SESSION['filmes'];

        if (empty($filmes)) {
            echo json_encode(['status' => 'vazio']);
            exit;
        }

        $linhas = '';
        foreach ($filmes as $index => $filme) {
            $num    = $index + 1;
            $titulo = $filme['titulo'];
            $genero = $filme['genero'];
            $linhas .= "
            <tr id='linha-{$index}'>
                <td class='text-center fw-semibold text-warning'>{$num}</td>
                <td>{$titulo}</td>
                <td><span class='badge bg-secondary px-3 py-2'>{$genero}</span></td>
                <td class='text-center'>
                    <button
                        class='btn btn-sm btn-outline-danger py-1 px-2'
                        onclick='abrirModalExcluir({$index}, \"{$titulo}\")'
                        title='Excluir este filme'
                    >
                        <i class='bi bi-trash3-fill'></i>
                    </button>
                </td>
            </tr>";
        }

        $total = count($filmes);
        $html  = "
        <div class='alert alert-info d-flex align-items-center gap-2 mb-3' role='alert'>
            <i class='bi bi-eye-fill fs-5'></i>
            <span>Exibindo <strong>{$total} filme(s)</strong> adicionado(s) até agora.</span>
        </div>
        <div class='table-responsive'>
            <table class='table table-dark table-hover align-middle rounded-3 overflow-hidden'>
                <thead class='table-info text-dark'>
                    <tr>
                        <th class='text-center' style='width:60px'>#</th>
                        <th><i class='bi bi-camera-reels me-1'></i> Título</th>
                        <th><i class='bi bi-tag me-1'></i> Gênero</th>
                        <th class='text-center' style='width:80px'><i class='bi bi-gear me-1'></i></th>
                    </tr>
                </thead>
                <tbody id='corpoTabela'>{$linhas}</tbody>
            </table>
        </div>";

        echo json_encode(['status' => 'ok', 'html' => $html]);
        exit;
    }
}
?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Meus Filmes Favoritos</title>

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css" rel="stylesheet">
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=DM+Sans:wght@400;500;600&display=swap" rel="stylesheet">

    <style>
        :root {
            --cinema-gold:   #f5c518;
            --cinema-dark:   #0d0d0d;
            --cinema-panel:  #141414;
            --cinema-card:   #1c1c1c;
            --cinema-border: #2e2e2e;
            --cinema-text:   #e8e8e8;
        }

        body {
            background-color: var(--cinema-dark);
            color: var(--cinema-text);
            font-family: 'DM Sans', sans-serif;
            min-height: 100vh;
            background-image:
                radial-gradient(ellipse 80% 60% at 50% -20%, rgba(245,197,24,.12) 0%, transparent 70%);
        }

        /* ── Header ── */
        .cinema-header {
            background: linear-gradient(135deg, #1a1a1a 0%, #111 100%);
            border-bottom: 2px solid var(--cinema-gold);
            padding: 2rem 0 1.5rem;
        }

        .cinema-header h1 {
            font-family: 'Bebas Neue', sans-serif;
            font-size: clamp(2.4rem, 6vw, 3.8rem);
            letter-spacing: 3px;
            color: var(--cinema-gold);
            text-shadow: 0 0 40px rgba(245,197,24,.35);
            margin: 0;
        }

        .cinema-header p {
            color: #888;
            font-size: .9rem;
            margin-top: .3rem;
        }

        /* ── Card ── */
        .cinema-card {
            background: var(--cinema-card);
            border: 1px solid var(--cinema-border);
            border-radius: 16px;
            box-shadow: 0 8px 40px rgba(0,0,0,.6);
        }

        /* ── Inputs ── */
        .form-label {
            font-weight: 600;
            color: var(--cinema-gold);
            font-size: .85rem;
            letter-spacing: .5px;
            text-transform: uppercase;
        }

        .form-control, .form-select {
            background: #252525;
            border: 1px solid var(--cinema-border);
            color: var(--cinema-text);
            border-radius: 8px;
            padding: .65rem 1rem;
            transition: border-color .25s, box-shadow .25s;
        }

        .form-control:focus, .form-select:focus {
            background: #2a2a2a;
            border-color: var(--cinema-gold);
            box-shadow: 0 0 0 3px rgba(245,197,24,.18);
            color: var(--cinema-text);
        }

        .form-control::placeholder { color: #555; }

        /* ── Buttons ── */
        .btn-gold {
            background: var(--cinema-gold);
            color: #000;
            font-weight: 700;
            border: none;
            border-radius: 8px;
            transition: transform .15s, box-shadow .2s;
        }
        .btn-gold:hover {
            background: #ffd000;
            transform: translateY(-2px);
            box-shadow: 0 6px 20px rgba(245,197,24,.4);
        }
        .btn-gold:active { transform: translateY(0); }

        .btn-outline-light {
            border-color: #444;
            color: #aaa;
            border-radius: 8px;
            transition: all .2s;
        }
        .btn-outline-light:hover {
            background: #2a2a2a;
            border-color: #888;
            color: #fff;
        }

        /* ── Contador de filmes ── */
        .counter-badge {
            background: rgba(245,197,24,.15);
            border: 1px solid rgba(245,197,24,.35);
            color: var(--cinema-gold);
            border-radius: 50px;
            padding: .3rem .9rem;
            font-size: .82rem;
            font-weight: 600;
        }

        /* ── Área de resultado ── */
        #resultado {
            animation: fadeIn .4s ease;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(10px); }
            to   { opacity: 1; transform: translateY(0); }
        }

        /* ── Toast ── */
        .toast-container { z-index: 1100; }

        /* ── Animação de remoção de linha ── */
        @keyframes fadeOutRow {
            from { opacity: 1; transform: translateX(0); background: transparent; }
            to   { opacity: 0; transform: translateX(40px); background: rgba(220,53,69,.15); }
        }
        .removing {
            animation: fadeOutRow .35s ease forwards;
        }

        /* ── Modal de exclusão ── */
        .modal-content {
            background: var(--cinema-card);
            border: 1px solid var(--cinema-border);
            border-radius: 16px;
        }
        .modal-header {
            border-bottom: 1px solid var(--cinema-border);
        }
        .modal-footer {
            border-top: 1px solid var(--cinema-border);
        }
        .modal-title { color: var(--cinema-gold); font-family: 'Bebas Neue', sans-serif; letter-spacing: 1px; font-size: 1.4rem; }
        #nomeFilmeModal { color: var(--cinema-gold); font-weight: 700; }

        /* ── Separador ── */
        .divider {
            border-top: 1px solid var(--cinema-border);
            margin: 1.5rem 0;
        }

        /* ── Pill de gênero sugerido ── */
        .genre-pill {
            cursor: pointer;
            font-size: .78rem;
            padding: .25rem .7rem;
            border-radius: 50px;
            background: #252525;
            border: 1px solid #3a3a3a;
            color: #aaa;
            transition: all .2s;
            user-select: none;
        }
        .genre-pill:hover {
            background: rgba(245,197,24,.15);
            border-color: var(--cinema-gold);
            color: var(--cinema-gold);
        }
    </style>
</head>
<body>

    <!-- ══ HEADER ══ -->
    <header class="cinema-header text-center">
        <div class="container">
            <div class="d-flex align-items-center justify-content-center gap-3">
                <i class="bi bi-film fs-2 text-warning"></i>
                <h1>Meus Filmes Favoritos</h1>
                <i class="bi bi-film fs-2 text-warning"></i>
            </div>
            <p>Cadastre seus filmes e explore sua coleção pessoal</p>
        </div>
    </header>

    <!-- ══ MAIN ══ -->
    <main class="container py-5">
        <div class="row justify-content-center g-4">

            <!-- ── Formulário ── -->
            <div class="col-lg-5">
                <div class="cinema-card p-4 h-100">
                    <div class="d-flex justify-content-between align-items-center mb-4">
                        <h5 class="mb-0 fw-bold">
                            <i class="bi bi-plus-circle-fill text-warning me-2"></i>Adicionar Filme
                        </h5>
                        <span class="counter-badge">
                            <i class="bi bi-collection me-1"></i>
                            <span id="contador">0</span> filme(s)
                        </span>
                    </div>

                    <!-- Input: Título -->
                    <div class="mb-3">
                        <label for="titulo" class="form-label">
                            <i class="bi bi-camera-reels me-1"></i>Título do Filme
                        </label>
                        <input
                            type="text"
                            class="form-control"
                            id="titulo"
                            placeholder="Ex: Interestelar, O Poderoso Chefão…"
                            autocomplete="off"
                        >
                        <div class="invalid-feedback">Por favor, informe o título.</div>
                    </div>

                    <!-- Input: Gênero -->
                    <div class="mb-2">
                        <label for="genero" class="form-label">
                            <i class="bi bi-tag me-1"></i>Gênero
                        </label>
                        <input
                            type="text"
                            class="form-control"
                            id="genero"
                            placeholder="Ex: Ficção Científica, Drama…"
                            autocomplete="off"
                        >
                        <div class="invalid-feedback">Por favor, informe o gênero.</div>
                    </div>

                    <!-- Pills de gênero rápido -->
                    <div class="d-flex flex-wrap gap-2 mb-4 mt-2">
                        <?php
                        $generos = ['Ação','Comédia','Drama','Terror','Romance','Ficção Científica','Animação','Suspense'];
                        foreach ($generos as $g) {
                            echo "<span class='genre-pill' onclick=\"document.getElementById('genero').value='{$g}'\">{$g}</span>";
                        }
                        ?>
                    </div>

                    <div class="divider"></div>

                    <!-- Botões -->
                    <div class="d-grid gap-2">
                        <button class="btn btn-gold py-2" onclick="adicionarFilme()">
                            <i class="bi bi-plus-lg me-2"></i>Adicionar
                        </button>
                        <div class="row g-2">
                            <div class="col-6">
                                <button class="btn btn-outline-light w-100 py-2" onclick="visualizarFilmes()">
                                    <i class="bi bi-eye me-1"></i>Visualizar
                                </button>
                            </div>
                            <div class="col-6">
                                <button class="btn btn-outline-danger w-100 py-2" onclick="encerrarSessao()">
                                    <i class="bi bi-stop-circle me-1"></i>Encerrar
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- ── Resultado ── -->
            <div class="col-lg-7">
                <div class="cinema-card p-4 h-100">
                    <h5 class="mb-4 fw-bold">
                        <i class="bi bi-collection-play-fill text-warning me-2"></i>Minha Coleção
                    </h5>

                    <!-- Estado inicial -->
                    <div id="estadoVazio" class="text-center py-5">
                        <i class="bi bi-camera-reels text-secondary" style="font-size:4rem;opacity:.35"></i>
                        <p class="text-secondary mt-3 mb-0">Nenhum filme adicionado ainda.</p>
                        <p class="text-secondary" style="font-size:.85rem">Use o formulário ao lado para começar.</p>
                    </div>

                    <!-- Conteúdo dinâmico -->
                    <div id="resultado" style="display:none;"></div>
                </div>
            </div>

        </div><!-- /row -->
    </main>

    <!-- ══ MODAL DE EXCLUSÃO ══ -->
    <div class="modal fade" id="modalExcluir" tabindex="-1" aria-labelledby="modalExcluirLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="modalExcluirLabel">
                        <i class="bi bi-trash3-fill text-danger me-2"></i>Confirmar Exclusão
                    </h5>
                    <button type="button" class="btn-close btn-close-white" data-bs-dismiss="modal" aria-label="Fechar"></button>
                </div>
                <div class="modal-body py-4 text-center">
                    <i class="bi bi-exclamation-triangle-fill text-warning" style="font-size:2.8rem"></i>
                    <p class="mt-3 mb-1" style="color:#aaa">Você está prestes a remover o filme:</p>
                    <p class="fs-5 mb-0" id="nomeFilmeModal">—</p>
                    <p class="text-secondary mt-2" style="font-size:.85rem">Esta ação não poderá ser desfeita.</p>
                </div>
                <div class="modal-footer justify-content-center gap-3">
                    <button type="button" class="btn btn-outline-light px-4" data-bs-dismiss="modal">
                        <i class="bi bi-x-lg me-1"></i>Cancelar
                    </button>
                    <button type="button" class="btn btn-danger px-4" id="btnConfirmarExclusao">
                        <i class="bi bi-trash3-fill me-1"></i>Excluir
                    </button>
                </div>
            </div>
        </div>
    </div>

    <!-- ══ TOAST ══ -->
    <div class="toast-container position-fixed bottom-0 end-0 p-3">
        <div id="toastMsg" class="toast align-items-center border-0 text-white" role="alert" aria-live="assertive" aria-atomic="true">
            <div class="d-flex">
                <div class="toast-body fw-semibold" id="toastTexto"></div>
                <button type="button" class="btn-close btn-close-white me-2 m-auto" data-bs-dismiss="toast" aria-label="Fechar"></button>
            </div>
        </div>
    </div>

    <!-- Bootstrap 5 JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

    <script>
    // ── Estado local (JS) ──────────────────────────────────────────────────────
    let totalFilmes = 0; // espelha o contador do PHP/sessão
    let _excluirIndex = -1; // índice pendente de exclusão no modal

    // ── Helpers de UI ─────────────────────────────────────────────────────────
    function exibirToast(mensagem, tipo = 'success') {
        const toastEl  = document.getElementById('toastMsg');
        const toastTxt = document.getElementById('toastTexto');
        toastEl.className = `toast align-items-center border-0 text-white bg-${tipo}`;
        toastTxt.innerHTML = mensagem;
        bootstrap.Toast.getOrCreateInstance(toastEl, { delay: 3000 }).show();
    }

    function mostrarResultado(html) {
        const estadoVazio = document.getElementById('estadoVazio');
        const resultado   = document.getElementById('resultado');
        estadoVazio.style.display = 'none';
        resultado.style.display   = 'block';
        resultado.innerHTML       = html;
    }

    function resetarFormulario() {
        document.getElementById('titulo').value = '';
        document.getElementById('genero').value = '';
        document.getElementById('titulo').classList.remove('is-invalid');
        document.getElementById('genero').classList.remove('is-invalid');
    }

    function atualizarContador(total) {
        totalFilmes = total;
        document.getElementById('contador').textContent = total;
    }

    function validarCampos() {
        const titulo = document.getElementById('titulo');
        const genero = document.getElementById('genero');
        let valido = true;

        if (!titulo.value.trim()) {
            titulo.classList.add('is-invalid');
            valido = false;
        } else {
            titulo.classList.remove('is-invalid');
        }

        if (!genero.value.trim()) {
            genero.classList.add('is-invalid');
            valido = false;
        } else {
            genero.classList.remove('is-invalid');
        }

        return valido;
    }

    // ── AJAX helper ───────────────────────────────────────────────────────────
    async function postAcao(dados) {
        const body = new URLSearchParams(dados);
        const resp = await fetch(window.location.href, { method: 'POST', body });
        return resp.json();
    }

    // ── Ações ─────────────────────────────────────────────────────────────────

    /** Adiciona um filme ao array associativo PHP (sessão) */
    async function adicionarFilme() {
        if (!validarCampos()) return;

        const titulo = document.getElementById('titulo').value.trim();
        const genero = document.getElementById('genero').value.trim();

        try {
            const data = await postAcao({ acao: 'adicionar', titulo, genero });
            if (data.status === 'ok') {
                atualizarContador(data.total);
                exibirToast(`<i class="bi bi-check-circle me-1"></i> "<strong>${titulo}</strong>" adicionado!`, 'success');
                resetarFormulario();
                document.getElementById('titulo').focus();
            } else {
                exibirToast(data.mensagem ?? 'Erro ao adicionar.', 'danger');
            }
        } catch (e) {
            exibirToast('Falha na comunicação com o servidor.', 'danger');
        }
    }

    /** Visualiza os filmes já cadastrados (foreach PHP) sem encerrar */
    async function visualizarFilmes() {
        if (totalFilmes === 0) {
            exibirToast('<i class="bi bi-info-circle me-1"></i> Nenhum filme adicionado ainda.', 'warning');
            return;
        }
        try {
            const data = await postAcao({ acao: 'visualizar' });
            if (data.status === 'ok') {
                mostrarResultado(data.html);
            } else {
                exibirToast('<i class="bi bi-info-circle me-1"></i> Nenhum filme para exibir.', 'warning');
            }
        } catch (e) {
            exibirToast('Falha na comunicação com o servidor.', 'danger');
        }
    }

    /** Encerra a sessão: contabiliza com foreach e exibe relatório final */
    async function encerrarSessao() {
        if (totalFilmes === 0) {
            exibirToast('<i class="bi bi-exclamation-circle me-1"></i> Adicione ao menos um filme antes de encerrar.', 'warning');
            return;
        }

        // Confirmação via modal Bootstrap
        if (!confirm(`Encerrar a sessão com ${totalFilmes} filme(s) cadastrado(s)?`)) return;

        try {
            const data = await postAcao({ acao: 'encerrar' });
            if (data.status === 'ok') {
                mostrarResultado(data.html);
                atualizarContador(0);
                exibirToast(`<i class="bi bi-stop-circle me-1"></i> Sessão encerrada — ${data.total} filme(s) contabilizado(s).`, 'success');
            }
        } catch (e) {
            exibirToast('Falha na comunicação com o servidor.', 'danger');
        }
    }

    /** Abre o Modal Bootstrap de confirmação, guardando o índice do filme */
    function abrirModalExcluir(index, titulo) {
        _excluirIndex = index;
        document.getElementById('nomeFilmeModal').textContent = titulo;
        bootstrap.Modal.getOrCreateInstance(document.getElementById('modalExcluir')).show();
    }

    /** Executado ao clicar em "Excluir" dentro do Modal — chama o PHP */
    async function confirmarExclusao() {
        if (_excluirIndex < 0) return;

        // Fecha o modal antes da requisição
        bootstrap.Modal.getInstance(document.getElementById('modalExcluir')).hide();

        // Anima a linha antes de removê-la do DOM
        const linha = document.getElementById(`linha-${_excluirIndex}`);
        if (linha) {
            linha.classList.add('removing');
            await new Promise(r => setTimeout(r, 360)); // aguarda animação
        }

        try {
            const data = await postAcao({ acao: 'excluir', index: _excluirIndex });
            if (data.status === 'ok') {
                atualizarContador(data.total);
                exibirToast(
                    `<i class="bi bi-trash3-fill me-1"></i> "<strong>${data.titulo}</strong>" removido da coleção.`,
                    'danger'
                );
                // Recarrega a tabela para corrigir índices e numeração
                if (data.total > 0) {
                    await visualizarFilmes();
                } else {
                    // Sem filmes restantes: volta ao estado vazio
                    document.getElementById('resultado').style.display   = 'none';
                    document.getElementById('estadoVazio').style.display = 'block';
                }
            } else {
                exibirToast(data.mensagem ?? 'Erro ao excluir.', 'danger');
            }
        } catch (e) {
            exibirToast('Falha na comunicação com o servidor.', 'danger');
        }

        _excluirIndex = -1;
    }

    // Liga o botão do modal à função de exclusão
    document.getElementById('btnConfirmarExclusao').addEventListener('click', confirmarExclusao);

    // ── Enter nos inputs ───────────────────────────────────────────────────────
    document.getElementById('titulo').addEventListener('keydown', e => { if (e.key === 'Enter') document.getElementById('genero').focus(); });
    document.getElementById('genero').addEventListener('keydown', e => { if (e.key === 'Enter') adicionarFilme(); });
    </script>
</body>
</html>

## Integrar a uma API de filmes (omdbapi = http://www.omdbapi.com/) 