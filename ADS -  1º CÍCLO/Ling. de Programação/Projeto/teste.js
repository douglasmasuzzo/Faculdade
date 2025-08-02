function verificadorVelocidade() {
    let velPermitida = parseFloat(document.getElementById('velPermitida').value);
        let velCondutor = parseFloat(document.getElementById
            ('velCondutor').value);
                let resultado = document.getElementById('resultado');

  if (isNaN(velPermitida) || isNaN(velCondutor)) {
        resultado.textContent = "Insira valores numéricos";
            resultado.style.color = "black"; // cor p/ valores inválidos
                return;
  }

  if (velPermitida <= 0 || velCondutor <= 0) {
        resultado.textContent = "Velocidades devem ser maiores que zero";
            resultado.style.color = "red";
                return;
  }

  let excessoPercentual = Math.round(((velCondutor - velPermitida) / velPermitida) * 100);

    if (velCondutor <= velPermitida) {
            resultado.textContent = "Sem Multa";
            resultado.style.color = "white";
                } else if (excessoPercentual <= 20) {
                    resultado.textContent = "Multa Leve: 3 pontos na CNH";
                    resultado.style.color = "#FFD700";
                        } else if (excessoPercentual <= 50) {
                            resultado.textContent = "Multa Média: 4 pontos na CNH";
                            resultado.style.color = "orange";
                               } else {
                                    resultado.textContent = "Multa Grave: 5 pontos na CNH e Suspensão da Habilitação";
                                    resultado.style.color = "red";

}
}