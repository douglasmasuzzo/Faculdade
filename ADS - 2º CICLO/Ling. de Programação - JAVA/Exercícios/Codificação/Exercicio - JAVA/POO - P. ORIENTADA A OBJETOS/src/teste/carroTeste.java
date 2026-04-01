package teste;

public class carroTeste {
    public static void main(String[] args){

        carro sedan = new carro();
        sedan.nome = "Versa";
        sedan.marca = "Nissan";
        sedan.ano = 2023;
        sedan.velocidade = 80.0;

        sedan.acelerar(10);
        System.out.println("VELOCIDADE: " + sedan.velocidade + " KM/H");
        sedan.frear(55);
        System.out.print("VELOCIDADE " + sedan.velocidade + " KM/H");

    }
}
