import java.util.ArrayList;
import java.util.Scanner;

public class Quiz{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME SEU NOME: ");
        String nome = sc.nextLine();

        Usuario user = new Usuario( nome );
        ArrayList< Pergunta > perguntas = new ArrayList<>();

        perguntas.add(new Pergunta("Capital do Brasil?", "Brasília"));
        perguntas.add(new Pergunta("2 + 2?", "4"));
        perguntas.add(new Pergunta("Cor do céu em dia claro?", "Azul"));
        perguntas.add(new Pergunta("Java é compilada? (sim/nao)", "sim"));
        perguntas.add(new Pergunta("5 * 3?", "15"));
        perguntas.add(new Pergunta("Água ferve a quantos graus?", "100"));
        perguntas.add(new Pergunta("Maior planeta?", "Júpiter"));
        perguntas.add(new Pergunta("Cor do sangue?", "Vermelho"));
        perguntas.add(new Pergunta("HTML é programação? (sim/nao)", "nao"));
        perguntas.add(new Pergunta("Ano atual?", "2026"));

        for ( Pergunta pergunta : perguntas ){
            System.out.println("\n" + pergunta.getEnunciado() );
            String resposta = sc.nextLine();
            pergunta.setResposta( resposta );

            Boolean acerto = resposta.equalsIgnoreCase( pergunta.getResposta() );
            user.RegistrarRepsosta(acerto);
        } 

        System.out.println("\n===== RESULTADO =====");
        System.out.println("USUÁRIO: " + user.getNome());
        System.out.println("ACERTOS: " + user.getAcertos());
        System.out.println("QUESTÕES: " + user.getTotalQuestoes());
        System.out.println("TAXA DE APROVEITAMENTO: " + user.CalcularAproveitamento() + "%");

        sc.close();
    }

}
