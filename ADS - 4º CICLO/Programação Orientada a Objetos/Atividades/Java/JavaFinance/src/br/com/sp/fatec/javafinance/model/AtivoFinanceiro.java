package br.com.sp.fatec.javafinance.model;

public abstract class AtivoFinanceiro {
    private String nome;
    private String codigo;
    private double quantidade;
    private double valorCompra;

    public AtivoFinanceiro(String nome, String codigo, double quantidade, double valorCompra) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valorCompra = valorCompra;
    }

    public abstract double calcularRendimento(double valorAtual);

    public abstract String getTipo();

    // Getters and Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public double getQuantidade() { return quantidade; }
    public void setQuantidade(double quantidade) { this.quantidade = quantidade; }

    public double getValorCompra() { return valorCompra; }
    public void setValorCompra(double valorCompra) { this.valorCompra = valorCompra; }

    public double getTotalInvestido() {
        return quantidade * valorCompra;
    }
}
