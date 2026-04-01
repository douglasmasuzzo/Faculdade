import java.util.Scanner;

public class exePratica04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = 10;
        int num = 1;
        while ( i > 0 ){
            System.out.println(i);
            i-= num;
        }
    }
}