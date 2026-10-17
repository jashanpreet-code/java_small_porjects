import java.util.Scanner;

public class timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = n; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("ypur time is over");
    }
}
