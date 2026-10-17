import java.util.Scanner;
public class bancking {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        
        double amount = 10;
        int choice;
        boolean run = true;
        while(run){
            System.out.println("enter the choice from these as numbers; ");
            System.out.println("(1) Show Balance: ");
            System.out.println("(2) Diposite: ");
            System.out.println("(3) withdraw: ");
            System.out.println("(4) Exit: ");
            choice = input.nextInt();

            switch (choice){
                case 1 -> show_balance(amount);
                case 2 -> amount += Diposite();
                case 3 ->amount -= withdraw(amount);
                case 4 -> run = false;
                default -> System.out.println("invalid index");
            }
        }
    }

    static void show_balance(double amount){
        System.out.printf("show balance: ");
        System.out.println(amount+"\n");
    }

    static double Diposite(){
        System.out.println("Enter Diposite Amount: ");
        int dip = input.nextInt();
        if(dip < 0){
            System.out.println("The amount can not be negative:");
            return 0;
        }
        return dip;
    }

    static double withdraw(double amount){
        System.out.println("Enter withdraw Amount: ");
        int draw = input.nextInt();
        if(amount < draw){
            System.out.println("no enought funds");
            return 0;
        }
        else if(draw < 0){
            System.out.println("can't withdraw negative amount");
            return 0;
        }
        else{
        return draw;
        }
    }
}
