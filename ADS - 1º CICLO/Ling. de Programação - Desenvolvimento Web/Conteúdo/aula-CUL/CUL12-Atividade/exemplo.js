function mostrarTabuada() {

    // Cria referência aos elementos da página
        var inNumero = document.getElementById("inNumero");
        var outTabauda = document.getElementById("outTabuada");

    // Converte conteúdo do campo inNumero
        var numero = Number(inNumero.value);

    // Valida o número
        if(isNaN(numero == 0) || isNaN(numer0)) {
            alert("Informe um número válido...");
            inNumero.focus();
            return;
        }
    
    // Cria uma variável do tipo String, que irá concatenar a resposta
        var resposta = "";

    // Cria um Laço de Repetição
        for(var i = 1; i <= 10; i++) {
            
            // A variável resposta vai acumular os novos conteúdos
            resposta = resposta + numero + "x" + i + "=" + numero * i + "\n"; 
        }

    // O conteúdo da tag "pre" é alerado para exibir a tabuada do numero
        outTabuada.textContent = resposta;
}
    // Criar referência ao botão e após associa function ao evento click
        var btMonster = document.getElementById("btMonster");
            btMonster.addEventListener("click", mostrarTabuada);