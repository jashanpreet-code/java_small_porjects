import java.util.Scanner;

public class temprature_converter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input temprature: ");
        double temp = input.nextDouble();
        System.out.print("Enter (C or F) for converting temprature: ");
        String s;
        s = input.next().toUpperCase();
        Double result = (s.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
        if(s.equals("F")){
            System.out.printf("%.2f C converted to %.2f F: ",temp,result);
        }
        else{
            System.out.printf("%.2f F converted to %.2f C: ",temp,result);
        }
        input.close();
        
    }
}
