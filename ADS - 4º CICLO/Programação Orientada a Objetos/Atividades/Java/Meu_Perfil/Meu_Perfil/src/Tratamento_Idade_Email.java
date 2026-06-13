import java.util.Scanner;

public class Tratamento_Idade_Email {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME SEU NOME: ");
        String nome = sc.nextLine();

        System.out.println("INFORME SUA IDADE: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha após nextInt()

        System.out.println("INFORME SEU EMAIL: ");
        String email = sc.nextLine();
        
        try {
            Validar_User.Validar(idade, email);    
            System.out.println("USUÁRIO VALIDADO COM SUCESSO!");
            System.out.println("NOME: " + nome );
            System.out.println("IDADE: " + idade );
            System.out.println("EMAIL: " + email );
        } catch (Idade_Invalida_Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        } catch (Email_Invalido_Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        } 
        
        sc.close(); 
    }
}
