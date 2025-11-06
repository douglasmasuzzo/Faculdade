function calcularSeno() {
    const X = parseFloat(document.getElementById("value").value);
    const resultado = Math.sin(X);
    exibirResultado( `Sen(${X}) = ${resultado}`);
}

function calcularCosseno() {
    const X = parseFloat(document.getElementById('value').value);
    const resultado = Math.cos(X);
    exibirResultado( `Cos(${X}) = ${resultado}` );
}

function calcularExponencial() {
    const X = parseFloat(document.getElementById('value').value);
    const resultado = Math.exp(X);
    exibirResultado(`e^${X} = ${resultado}`); 
}

function calcularLn() {
    const X = parseFloat(document.getElementById('value').value);

    if (X <= 0) {
        exibirResultado(`Ln(${X}) não é definido para valores menores que zero`);
        return;
    }

    const resultado = Math.log(X);
    exibirResultado(`Ln(${X}) = ${resultado}`);
}

function calcularRaiz() {
    const valor =  parseFloat(document.getElementById('raizValor').value);
    const indice = parseFloat(document.getElementById('raizIndice').value);

    if (indice === 0) {
        exibirResultado('Índice não pode ser zero')
        return;
    } 
    
    if ( valor < 0 && indice % 2 == 0 ){
        exibirResultado("Raiz de número negativo não existe");
        return;
    }

    let X = valor / indice;
    for (let i = 0; i < 20; i++) {
        X = (( indice - 1 ) * X + valor / Math.pow( X , indice - 1 )) / indice;
    }

    exibirResultado(`Aproximação de √(${indice})(${valor}) = ${X}`);
}

function calcularPolinomioTaylor() {
    const X = parseFloat(document.getElementById('taylorValor').value);
    const N = parseInt(document.getElementById('taylorTermos').value);
    let resultado = 0;

    if ( N <= 0 ) {
        exibirResultado("O número deve ser maior que zero");
        return;
    }

    for (let i = 0; i <= N; i++) {
        resultado += Math.pow(X, i) / fatorial(i);
    }

    exibirResultado(`Aproximação de E^${X} com ${N} termos = ${resultado}`);
}

function fatorial(number) {
    if (number === 0 || number === 1) {
        return 1;
    }

    let resultado = 1;
    for (let i = 2; i <= number; i++) {
        resultado *= i;
    }
    return resultado;
}

function exibirResultado(texto){
    document.getElementById('resultado').innerText = texto;
}
