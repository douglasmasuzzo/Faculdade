public class EXE003{
    public static void main(String[] args){

        try{
            int vet[] = new int[5];
            vet[10] = 15;
        } catch ( ArrayIndexOutOfBoundsException ex ) {
            System.out.print("Não é possível armazenaar valor fora do índice");
        }
    }
}