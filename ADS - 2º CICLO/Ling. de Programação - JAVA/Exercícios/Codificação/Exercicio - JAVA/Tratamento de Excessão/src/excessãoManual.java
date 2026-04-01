public class excessãoManual {

    public static void Validade ( int idade ) {
        if ( idade < 18 ) {
            throw new IllegalArgumentException(" O usuário é menor de idade.");
        } else {
            System.out.print("Acesso Permitido");
        }
    }

    public static void main(String[] args) {
        try {
            Validade(20);
        } catch  ( IllegalArgumentException e) {
            System.out.print("Erro:" + e.getMessage() );
        }
    }
}

// finally = instruções que devem ser executadas ao final
// API = Application Programming Interface
// Softwares que requisitam dados de usuários
