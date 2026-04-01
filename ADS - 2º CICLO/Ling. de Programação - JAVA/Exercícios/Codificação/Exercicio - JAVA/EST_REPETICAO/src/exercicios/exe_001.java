package exercicios;

import java.util.Scanner;

public class exe_001 {
    public static void main(String[] args){
        Scanner verificar = new Scanner (System.in);

        System.out.print("Digite a senha: ");
            int entrada = verificar.nextInt();
            int senha = 2002;

        if ( entrada != senha ) {
            System.out.print("Senha Incorreta! tente novamente.");
        } else {
            System.out.print("Senha Correta. Acesso Liberado.");
        }

        verificar.close();
    }
}
