import java.util.Random;
import java.util.Scanner;

public class dice_roll {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("How many times to roll a dice: ");
        int roll = input.nextInt();
        int user_total = 0;
        int dice_total = 0;
        for(int i = 0; i < roll; i++){
            int d = ran.nextInt(1,7);
            System.out.println("YOUR DICE: ");
            dice(d);
            System.out.println("dice number: \t"+d);
            user_total += d;
            System.out.println("user score "+ user_total );
        }
        for(int i = 0; i < roll; i++){
            int d = ran.nextInt(1,7);
            System.out.println("SYSTEM DICE: ");
            dice(d);
            System.out.println("dice number: \t"+d);
            dice_total += d;
            System.out.println("dice total: "+ dice_total);
        }
        System.out.println("user score "+ user_total );
        System.out.println("dice total: "+ dice_total);
    }

    static void dice(int num){
        String dice1 = """
                    -------
                   |       |
                   |   *   |
                   |       |
                    -------
                """;
        String dice2 = """
                    -------
                   |*      |
                   |       |
                   |      *|
                    -------
                """;
        String dice3 = """
                    -------
                   |*      |
                   |   *   |
                   |      *|
                    -------
                """;
        String dice4 = """
                    -------
                   |*     *|
                   |       |
                   |*     *|
                    -------
                """;
        String dice5 = """
                    -------
                   |*     *|
                   |   *   |
                   |*     *|
                    -------
                """;
        String dice6 = """
                    -------
                   |*     *|
                   |*     *|
                   |*     *|
                    -------
                """;

        switch(num){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("invalid number");
        }
    }
}
