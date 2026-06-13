package br.com.sp.fatec.javafinance;

import br.com.sp.fatec.javafinance.model.*;
import br.com.sp.fatec.javafinance.service.HGBrasilService;
import br.com.sp.fatec.javafinance.exception.FinanceException;
import br.com.sp.fatec.javafinance.exception.SaldoInsuficienteException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Sugerimos obter sua própria chave em https://hgbrasil.com/
        // O valor padrão "7243c224" é apenas um placeholder.
        String apiKey = "7243c224"; 
        HGBrasilService financeService = new HGBrasilService(apiKey);
        
        System.out.println("--- Bem-vindo ao JavaFinance ---");
        System.out.print("Informe seu saldo inicial (R$): ");
        double saldoInicial = scanner.nextDouble();
        Carteira carteira = new Carteira(saldoInicial);

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Comprar Ação");
            System.out.println("2. Comprar Criptomoeda");
            System.out.println("3. Ver Carteira (Tempo Real)");
            System.out.println("4. Depositar Saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        comprarAtivo(scanner, carteira, true);
                        break;
                    case 2:
                        comprarAtivo(scanner, carteira, false);
                        break;
                    case 3:
                        mostrarCarteira(carteira, financeService);
                        break;
                    case 4:
                        System.out.print("Valor do depósito: ");
                        carteira.depositar(scanner.nextDouble());
                        break;
                    case 5:
                        running = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static void comprarAtivo(Scanner scanner, Carteira carteira, boolean isAcao) throws SaldoInsuficienteException {
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Código (Ex: PETR4 ou BTC): ");
        String codigo = scanner.next();
        System.out.print("Quantidade: ");
        double qtd = scanner.nextDouble();
        System.out.print("Valor de Compra Unitário (R$): ");
        double valor = scanner.nextDouble();

        AtivoFinanceiro ativo = isAcao ? new Acao(nome, codigo, qtd, valor) : new MoedaCripto(nome, codigo, qtd, valor);
        carteira.adicionarAtivo(ativo);
        System.out.println(ativo.getTipo() + " adicionada com sucesso!");
    }

    private static void mostrarCarteira(Carteira carteira, HGBrasilService service) {
        System.out.println("\n--- Sua Carteira ---");
        double totalAtual = 0;
        for (AtivoFinanceiro a : carteira.getAtivos()) {
            try {
                double precoAtual = service.getPrecoAtual(a.getCodigo());
                // Se a API não retornar preço (ex: chave inválida), simulamos com o valor de compra para não quebrar.
                if (precoAtual == 0.0) precoAtual = a.getValorCompra(); 
                
                double rendimento = a.calcularRendimento(precoAtual);
                totalAtual += (precoAtual * a.getQuantidade());

                System.out.printf("[%s] %s (%s) | Qtd: %.2f | Rendimento: R$ %.2f%n", 
                    a.getTipo(), a.getNome(), a.getCodigo(), a.getQuantidade(), rendimento);
            } catch (FinanceException e) {
                System.out.println("Falha ao atualizar " + a.getCodigo() + ": " + e.getMessage());
            }
        }
        System.out.printf("Saldo Disponível: R$ %.2f%n", carteira.getSaldoDisponivel());
        System.out.printf("Valor Total em Ativos: R$ %.2f%n", totalAtual);
    }
}
