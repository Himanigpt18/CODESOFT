import java.util.Random;
import java.util.Scanner;

public class numgame {
    public static void main(String[] args) {
         Random rand = new Random();
         Scanner sc = new Scanner(System.in);
         int randomNumber = rand.nextInt(100) + 1;
         //given T trial
         int T = 5;
         int i = 0;

         System.out.println("A number is chosen"+"between 1 to 100"+"guess the number"+"with 5 trials.");
        // iterate over T trials
        
        int iteration = 0; 
        for ( i = 1; i < T; i++) {
            
        System.out.println("please enter your guess number (1_100):");
        
        int guess = sc.nextInt();
        iteration++;

        if (guess == randomNumber) {
            System.out.println("Congrats! you win!");
            System.out.println("it took you" + " " + iteration + " " + "tires");
            break;
        }
        else if(randomNumber > guess && i != T-1){
            System.out.println("lose! number is higher, so guess again");
        }
        else if(randomNumber < guess && i != T-1){
            System.out.println("lose! number is lower, so guess again");
        }
    
        }

        if(i==T){
            System.out.println( "you have exhausted "+ T + "  trials.");
            System.out.println("the number was :" + randomNumber);
        }

        sc.close();
    }
}
