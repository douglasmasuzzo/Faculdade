package teste;

public class produtoTeste{
    public static void main(String[] args){

        Produto X = new Produto();
        X.nome = "Caneta Azul";
        X.marca = "FabreCastel";
        X.valor = 1.50f;

        Produto Y = new Produto("Caneta Azul", "FabreCastel");
        Y.valor = 1.50f;

        Produto Z = new Produto("Borracha", "Mercur", 1.50f);

        System.out.println("NOME: " + X.nome + " | " + "MARCA: " + X.marca + " | " + "VALOR: " + X.valor);
        System.out.println("NOME: " + Y.nome + " | " + "MARCA: " + Y.marca + " | " + "VALOR: " + Y.valor);
        System.out.println("NOME: " + Z.nome + " | " + "MARCA: " + Z.marca + " | " + "VALOR: " + Z.valor);
    }
}