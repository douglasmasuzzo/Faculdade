import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteALuno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Informe o nome do aluno: ");
        String nome = sc.nextLine();
        aluno.setNome( nome );
        System.out.print("Quantas notas deseja inserir? ");
        int quant = sc.nextInt();

        List<Double> notas = new ArrayList<>();
        for ( int i = 1; i <= quant; i++ ){
            System.out.print("Digite a " + i + "º nota: ");
            double nota = sc.nextDouble();
            notas.add( nota );
        }
        aluno.setNotas( notas );

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Notas: " + aluno.getNotas());
        System.out.printf("Média das notas: %.2f\n", aluno.calcularMedia());
        sc.close();
    }
}
