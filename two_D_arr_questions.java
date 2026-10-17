import java.util.Random;
import java.util.Scanner;

public class two_D_arr_questions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
            // Array of questions
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who developed the theory of relativity?",
            "What is the largest ocean on Earth?",
            "Which element has the chemical symbol 'O'?"
        };

        // 2D array of answer options
        String[][] options = {
            {"Paris", "London", "Berlin", "Madrid"},
            {"Earth", "Mars", "Jupiter", "Venus"},
            {"Isaac Newton", "Albert Einstein", "Galileo Galilei", "Nikola Tesla"},
            {"Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean"},
            {"Oxygen", "Gold", "Iron", "Hydrogen"}
        };

        // Array of correct answer indices (0-based)
        int[] correctAnswers = {0, 1, 1, 2, 0};
        System.out.println("Entered in the game now answer the Questions in these options: ");
        int Score = 0;
        int guess = 0;
        int times = 0;
        // System.out.println(questions.length);

        // int ques = ran.nextInt(0,4);
       for(int i = 0; i < questions.length; i++){
            System.out.print(questions[i]+"\n");

            for(String k: options[i]){
                System.out.print(k+"\n");
            }
            System.out.print("\n");
            System.out.println("Enter the guessing answer index: ");
            guess = input.nextInt();
            if(guess == correctAnswers[i]){
                System.out.println("Correct answer");
                Score++;
            }
            else{
                System.out.println("False answer");
            }
            System.out.println("Score = "+Score);
       }

        input.close();
    }
}
