import java.util.Scanner;

public class EXE005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados: ");
        int alunos = sc.nextInt();
        sc.nextLine();  // Limpar buffer

        String nomes[] = new String[alunos];
        double nota1[] = new double[alunos];
        double nota2[] = new double[alunos];

        for (int i = 0; i < alunos; i++) {
            System.out.printf("Digite o nome do %dº aluno(a): ", i + 1);
            nomes[i] = sc.nextLine();

            System.out.printf("Digite a nota do 1º semestre de %s: ", nomes[i]);
            nota1[i] = sc.nextDouble();

            System.out.printf("Digite a nota do 2º semestre de %s: ", nomes[i]);
            nota2[i] = sc.nextDouble();

            sc.nextLine();
        }

        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < alunos; i++) {
            double media = (nota1[i] + nota2[i]) / 2.0;
            if (media >= 6.0) {
                System.out.println("- " + nomes[i]);
            }
        }

        sc.close();
    }
}
