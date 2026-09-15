import java.util.Scanner;

public record KG_toLB() {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double weight;
        // double newWeight;
        int converstion;
        System.out.print("enter the wigth: ");
        weight = input.nextDouble();
        System.out.print("enter 1 for KG to LB and 0 for LB to KG: ");
        converstion = input.nextInt();
        if(converstion == 1){
            System.out.printf("The %.2fKg converted to %.2fLb",weight,weight *2.20462 );
        }
        else if (converstion == 0){
            System.out.printf("The %.2fLb converted to %.2fKg",weight,weight * 0.453592);
        }
        else{
            System.out.print("That is not a vaild opration");
        }
        input.close();
    }
}
