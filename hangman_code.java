import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangman_code {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        Random ran = new Random();
        int wrong_guesses = 1;
        boolean run = true;

        System.out.println("******************");
        System.out.println("Welcome to  Hangman");
        System.out.println("********************");

        try(BufferedReader in = new BufferedReader(new FileReader("data.txt"))){
            String line;
            while((line = in.readLine()) != null){
                words.add(line);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        int count = 0;
        int for_select_word = ran.nextInt(0,words.size());
        String word_for_guess = words.get(for_select_word);
        System.out.println(word_for_guess);
        ArrayList<String> for_guess = new ArrayList<>(word_for_guess.length());

        System.out.println(word_for_guess.length());
        for(char w_ : word_for_guess.toCharArray()){
            for_guess.add("_");
        }

        while(wrong_guesses <= 6){
            System.out.println("word = "+for_guess);
            System.out.print("Your guess: ");
            char user_guess = input.next().charAt(0);

            if(!for_guess.contains(Character.toString('_'))){
                System.out.println("YOU WIN");
                break;
            }
            if(word_for_guess.indexOf(user_guess) >= 0){
                //int  f = word_for_guess.indexOf(user_guess);
                for(char i = 0; i < for_guess.size(); i++){
                    if(word_for_guess.charAt(i) == user_guess){
                        for_guess.set(i,Character.toString(user_guess));
                    }
                }
                if(!for_guess.contains(Character.toString('_'))){
                    System.out.println("YOU WIN");
                    System.out.println("The word is:= "+word_for_guess);
                    System.out.println("your result is ="+for_guess);
                    break;
                }
            }

            else{
                System.out.println("Wrong guess = " +wrong_guesses+"/6");
                System.out.println(result(wrong_guesses));
                if(wrong_guesses == 6){
                    System.out.println("You lost the game");
                }
                wrong_guesses++;
            }           
        }
        input.close();
    }   
    static String result(int worng_attempt){
        return switch(worng_attempt){
                case 1 -> """
                          O
                         """;
                case 2 -> """
                           O
                           |
                          """;
                case 3 -> """
                           O
                          /|
                          """;
                case 4 -> """
                           O
                          /|\\
                          """;
                case 5 -> """
                           O
                          /|\\
                          /
                          """;
                case 6-> """
                           O
                          /|\\
                          / \\
                         """;
                default -> " ";
        };
    } 
}
