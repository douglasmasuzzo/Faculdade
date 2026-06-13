# JavaFinance - Monitor de Investimentos

Sistema de gerenciamento de carteira de investimentos integrado com a API HG Brasil Finance.

## Funcionalidades
- Gerenciamento de Ações e Criptomoedas.
- Consulta de preços em tempo real via API.
- Cálculo automático de rendimento e saldo da carteira.
- Tratamento de exceções personalizadas para erros financeiros e de saldo.

## Tecnologias e Conceitos de POO
- **Abstração:** Classe `AtivoFinanceiro` define a estrutura base.
- **Herança:** `Acao` e `MoedaCripto` especializam o comportamento dos ativos.
- **Composição:** `Carteira` gerencia uma lista dinâmica de objetos `AtivoFinanceiro`.
- **Encapsulamento:** Uso de modificadores de acesso e getters/setters.
- **Coleções:** Uso de `ArrayList` para manipulação dinâmica dos ativos.
- **Exceções:** Classes `FinanceException` e `SaldoInsuficienteException` para controle de fluxo robusto.

## Como Executar
1. Compile os arquivos:
   ```bash
   javac -d bin src/br/com/sp/fatec/javafinance/**/*.java src/br/com/sp/fatec/javafinance/Main.java
   ```
2. Execute a aplicação:
   ```bash
   java -cp bin br.com.sp.fatec.javafinance.Main
   ```

*Nota: É necessário uma chave da API HG Brasil para consulta em tempo real. Uma chave padrão de demonstração está configurada no código.*
