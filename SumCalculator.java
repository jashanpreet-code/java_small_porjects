
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Input first number
        try (Scanner scanner = new Scanner(System.in)) {
            // Input first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            // Input second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            // Calculate sum5
            int sum = num1 + num2;
            
            // Output the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        }
    }
}
