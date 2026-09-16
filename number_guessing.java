import java.util.Random;
import java.util.Scanner;

public class number_guessing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rn = new Random();
        int number = rn.nextInt(0,100);
        int attempte = 0;
        int guesed_number = 0;
        System.out.println("Enter the level (HARD // MEDIUM // EASY):");
        String level = input.nextLine().toLowerCase();
        if(level.equalsIgnoreCase("hard")){
            attempte = 5;
            game(attempte,guesed_number,number);
        }
        else if (level.equalsIgnoreCase("medium")){
            attempte = 10;
             game(attempte,guesed_number,number);
        }
        else if (level.equalsIgnoreCase("easy")){
            attempte = 15;
             game(attempte,guesed_number,number);
        }
        else{
            System.out.println("Enter the level (HARD // MEDIUM // EASY):");
        }
    }
    static void game(int attempte, int guesed_number, int number){
        Scanner in = new Scanner(System.in);
         while(attempte > 0){
            System.out.println("Attempts we have: "+attempte);
            System.out.println("you have to enter the number for guessing the number");
            guesed_number = in.nextInt();
            if(guesed_number == number){
                System.out.println("you entered the correct guess as number :"+ guesed_number);
                break;
            }
            else if(guesed_number > number){
                System.out.println("The number is too high");
                attempte--;
            }
            else if(guesed_number < number){
                System.out.println("The number is too low");
                attempte--;
            }
            else{
                System.out.println("The number entered for guessing is out of range");
                attempte--;
            }
        }
    }
}

