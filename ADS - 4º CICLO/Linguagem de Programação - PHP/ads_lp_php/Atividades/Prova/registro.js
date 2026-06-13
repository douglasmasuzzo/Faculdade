/**
 * registro.js - Responsável pela validação front-end antes do envio ao PHP.
 */
document.addEventListener('DOMContentLoaded', () => {
    // Seleção dos elementos do DOM para manipulação
    const form = document.getElementById('formFilme');
    const tituloInput = document.getElementById('titulo');
    const generoInput = document.getElementById('genero');
    const erroTitulo = document.getElementById('erro-titulo');
    const erroGenero = document.getElementById('erro-genero');

    // Intercepta o evento de 'submit' do formulário
    form.addEventListener('submit', (event) => {
        // Identifica o botão clicado através do atributo 'name'
        const botaoClicado = event.submitter ? event.submitter.name : null;

        // Lógica de encerramento: processa o array antes de enviar ao PHP
        if (botaoClicado === 'negacao') {
            
            let mensagem = "Todos os filmes na sua lista:\n";
            let encontrou = false;

            listaFilmesJS.forEach((filme, index) => {
                console.log(`[Índice ${index}] Título: ${filme.titulo} | Gênero: ${filme.genero}`);
                mensagem += `- ${filme.titulo} (${filme.genero})\n`;
                encontrou = true;
            });

            if (encontrou) {
                alert(mensagem);
            } else {
                console.log("Nenhum filme em posição ímpar para exibir.");
            }
            return; // Permite que o formulário siga para o PHP destruir a sessão
        }

        let hasError = false;

        // Validação do campo Título: mostra o erro se estiver vazio
        if (tituloInput.value.trim() === "") {
            erroTitulo.style.display = 'block';
            hasError = true;
        } else {
            erroTitulo.style.display = 'none';
        }

        // Validação do campo Gênero: mostra o erro se estiver vazio
        if (generoInput.value.trim() === "") {
            erroGenero.style.display = 'block';
            hasError = true;
        } else {
            erroGenero.style.display = 'none';
        }

        // Se houver erro, cancela o envio do formulário para o PHP
        if (hasError) {
            event.preventDefault(); // Impede o envio do formulário
        }
    });
});