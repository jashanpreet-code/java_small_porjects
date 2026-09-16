import java.util.Random;
import java.util.Scanner;

public class rock_paper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int score = 0;
        System.out.println("how many time use want to play: ");
        String want_to_play_again = "yes";
        do{
            String[] operator = {"rock","paper","sisser"};
            String op = operator[ran.nextInt(3)];
            System.out.println("enter user more 'rock,paper,sisser'");
            String user = input.nextLine().toLowerCase();
            if(!user.equals("rock") && !user.equals("paper") && !user.equals("sisser")){
                System.out.println("write something valid in the conditions");
                continue;
            }
            if(op.equals(user)){
                System.out.println("tie");
            }
            else if(user.equals("rock") && op.equals("sisser")){
                System.out.println("user = "+ user);
                System.out.println("op = "+ op);
                System.out.println("you win 1 point");
                score++;
            }
            else if(user.equals("paper") && op.equals("rock")){
                System.out.println("user = "+ user);
                System.out.println("op = "+ op);
                System.out.println("you win 1 point");
                score++;
            }
            else if(user.equals("sisser") && op.equals("paper")){
                System.out.println("user = "+ user);
                System.out.println("op = "+ op);
                System.out.println("you win 1 point");
                score++;
            }
            else{
                System.out.println("You Lose");
            }
            System.out.println("if want to play again enter yes if not enter no");
            want_to_play_again = input.nextLine();
        }
        while(want_to_play_again.equals("yes"));
    }
}
