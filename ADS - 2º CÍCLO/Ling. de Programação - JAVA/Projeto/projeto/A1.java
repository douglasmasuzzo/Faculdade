package projeto;
import java.util.Scanner;
import java.util.ArrayList;

public class A1{
    public int id;
    public String name;
    public String especify;
    public double valor;

    public static ArrayList<A1> lista = new ArrayList<>();
    public static Scanner input = new Scanner ( System.in );

    public A1( int I, String N, String E , double V ){
        id = I;
        name = N;
        especify = E;
        valor = V;
    }

    @Override
    public String toString(){ 
        return "ID: " + id + "\nNOME: " + name + "\nTIPO: " + especify + "\nVALOR " + valor 
    }

    public static void Criar(){
        System.out.printn("ID: "); int I = input.nextInt(); input.nextLine();
        System.out.println("NOME: "); String N = input.nextLine();
        System.out.println("TIPO: "); String E = input.nextLine();
        System.out.prinln("VALOR: "); int V = input.nextdouble(); 

        lista.add( new A1( I, N, E, V ) );
        System.out.println("PRODUTO CRIADO!");
    }

    public static void Listar(){
        if ( lista.isEmpty() ){
            System.out.println("NENHUM PRODUTO EXIBIDO.");
        } else {
            for ( A1 p : lista ) { System.out.println( p ); }
        }
    }

    public static void Editar(){
        System.out.print("ID do produto: "); int busca = Integer.toString( input.nextInt() );

        for ( A1 p : lista ){

            if ( p.id == busca ) {
                System.out.println("Novo Nome: "); p.name = input.nextLine();
                System.out.println("Nova especificação: "); p.especify = input.nextLine();
                System.out.println("Novo valor: "); p.valor = input.nextDouble();
                System.out.println("PRODUTO ATUALIZADO!"); 
                return;   
            }
        }

        System.out.println("PRODUTO NÃO ENCONTRADO");
    }

    public static void Apagar(){
        System.out.print("ID do produto: "); int busca = input.nextInt();
        boolean removido = lista.removeIf( p -> p.id == busca );
        System.out.println( removido ? "PRODUTO REMOVIDO" : "PRODUTO NÃO ENCONTRADO");
    }

    public static void Buscar(){
        System.out.print("ID do produto: "); int busca = input.nextInt();
        
        for ( A1 p : lista ){
            if ( p.id == busca ){
                System.out.println( p ); return;
            }
        }
        System.out.println("PRODUTO NÃO ENCONTRADO");
    }

    public static void PesquisarTotal(){
        double soma = 0;

        for ( A1 p : lista ) { soma += p.valor; }
        System.out.println("VALOR TOTAL: R$" + soma );
    }

}