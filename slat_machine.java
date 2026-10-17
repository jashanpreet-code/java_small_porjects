import java.util.Random;
import java.util.Scanner;

public class slat_machine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int balance = 1000;
        int bet;
        String play_again;
    
        System.out.println("Sloute Mahine started: ");
        System.out.println("Amount we have: " +balance);
        System.out.println("Enter the bet amount: ");
      
        while(balance > 0){
            System.out.printf("enter the amount of bet from balance "+ balance + "\n");
            bet = input.nextInt();
            input.nextLine();
            if(bet < 0){
                System.out.println("the bet can not be negative:");
            }
            else if(bet > balance){
                System.out.println("The amount is not available");
            }
            else{
                String[] result = roll_up();
                // System.out.println(result[0] + result[1] + result[2]);
                int payo = payout(result,bet);
                System.out.println("the return of payo is = "+payo);
                if(payo > 0){
                    if(payo == bet){
                        balance -= bet;
                    }
                    else if(payo > bet){
                        balance += bet;
                    }
                    System.out.println("The  is off " + bet + " and we won = " + payo); 
                    System.out.println("Now the balance is = "+balance);
                }
                System.out.print("If you want to play again type 'YES' if not type 'NO': ");
                play_again = input.nextLine();
                if(!(play_again.equalsIgnoreCase("yes"))){
                    break;
                }
                System.out.println("Your final amount is " + balance);
            }
            // System.out.println(" \n@ # $ % & *");
    }
    }

    static String[] roll_up(){
          Random random = new Random();
          String[] articles = {"@","#","$","%","&","*"};
          String[] outer = new String[articles.length];
          for(int i = 0; i < outer.length; i++){
            outer[i] = articles[random.nextInt(articles.length)];
          }
          System.out.println(outer[0] + "\t" + outer[1] +"\t"+ outer[2]);
          return outer;
    }

    static int payout(String[] result,int res){
        if(result[0].equals(result[1]) && result[1].equals(result[2])){
            return switch (result[0]){
                case "@" -> res * 20;
                case "#" -> res * 30;
                case "$" -> res * 40;
                case "%" -> res * 50;
                case "&" -> res * 60;
                case "*" -> res * 70;
                default -> 0;
            };
        }
        else if(result[0].equals(result[1])){
            return switch (result[2]){
                case "@" -> res * 2;
                case "#" -> res * 3;
                case "$" -> res * 4;
                case "%" -> res * 5;
                case "&" -> res * 6;
                case "*" -> res * 7;
                default -> 0;
            };
        }
        else if(result[1].equals(result[2])){
            return switch (result[2]){
                case "@" -> res * 2;
                case "#" -> res * 3;
                case "$" -> res * 4;
                case "%" -> res * 5;
                case "&" -> res * 6;
                case "*" -> res * 7;
                default -> 0;
            };
        }
        return res;
    }
}
