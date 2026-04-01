import java.util.Scanner;

public class EXE006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int X = sc.nextInt();
        String pessoas[][] = new String [X][2];

        for ( int i = 0; i < X; i++ ) {
            System.out.print("Digite a altura da pessoa: ");
            pessoas[i][0] = sc.next();

            System.out.print("Informe o seu gênero: ");
            pessoas[i][1] = sc.next();
        }

        double maior = Double.parseDouble(pessoas[0][0]);
        double menor = Double.parseDouble(pessoas[0][0]);
        double alturaMulheres = 0;
        int contMulheres = 0;
        int contHomens = 0;

        for ( int i = 0; i < X; i++ ) {
            double altura = Double.parseDouble(pessoas[i][0]);
            String genero = pessoas[i][1];

            if ( altura > maior ) {
                maior = altura;
            } else if ( altura < menor ) {
                menor = altura;
            }

            if ( genero.equals("F") || genero.equals("f") ){
                alturaMulheres+= altura;
                contMulheres++;
            } else if ( genero.equals("M") || genero.equals("m") ) {
                contHomens++;
            }
        }

        System.out.printf("Maior altura: %.2f%n", maior);
        System.out.printf("Menor altura: %.2f%n", menor);

        if ( contMulheres > 0 ) {
            double  mediaMulheres = alturaMulheres / contMulheres;
            System.out.println("Média de altura de Mulheres: " + mediaMulheres);
        } else {
            System.out.print("Nenhuma mulhere cadastrada");
        }

        System.out.print("Número de Homens: " + contHomens);
        sc.close();
    }
}
