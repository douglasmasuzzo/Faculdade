FUL01-Storage.js
 
/* Iniciando com localStorage */
// Fazer por partes e testar.
 
// Inserir
    localStorage.setItem("priNome", "Mari");
// Testar
 
// Recuperar valor existente
    let nome = localStorage.getItem("priNome");
        console.log(nome);
// Testar
 
// Recuperar valor Inexistente
    let ultNome = localStorage.getItem("sobrNome");
        console.log(ultNome);
 
// Perceba que não gerou erro. Retornou "NUll". Podemos testar e tratar a situação
    if (ultNome === null){
        alert("Sobrenome não encontrado");
    }
 
/* Remover item existente */
    localStorage.removeItem("priNome");
 
// Verificar tipo de dado armazenado
    localStorage.setItem("a", "1");
    localStorage.setItem("b", 2 );
        console.log(typeof localStorage.getItem("A"));
        console.log(typeof localStorage.getItem("B"));
// Testar
// Verificar que inseriu
 
// Fechar sessão e reabrir. Verificar que os dados continuam.
//  Próximo passo.
 
// Remover tudo
    localStorage.clear();
 