package atividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        pessoa.setNome( nome );

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        pessoa.setIdade( idade );
        sc.nextLine();

        System.out.print("Informe seu gênero: ");
        String genero = sc.nextLine();
        pessoa.setGenero( genero );

        System.out.print("-------------------------\n");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.print("Sexo: " + pessoa.getGenero());
    }
}

