import java.util.Scanner;
public class matrix_maker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the coulmns number of matrix: ");
        int col = input.nextInt();
        System.out.println("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.println("Enter the number the symbol: ");
        String sym = input.next();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf(sym ," ");
            }
            System.out.println();
        }
        input.close();
    }
}
