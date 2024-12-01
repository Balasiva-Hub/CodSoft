import java.util.Scanner;
import java.util.Random;

public class Numbergame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        
        while (playAgain) 
        {
            int maxAttempts= 6; 
            int score = 0; 
            int targetNumber = random.nextInt(100) + 1; 
            
            System.out.println("\n*****Number Guessing Game*****");
            System.out.println("\nI have Guess a number 1 and 100. Try to guess it.");
            System.out.println("\nYou have " + maxAttempts + " attempts to guess the number.");
            
            while (maxAttempts > 0) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                maxAttempts--;

                if (userGuess == targetNumber)
                {
                    System.out.println("Congratulations! You guessed the correct number!");
                    score = 10 - maxAttempts; 
                    break;
                } else if (userGuess > targetNumber) 
                {
                    System.out.println("Too high! Try again.");
                } else 
                {
                    System.out.println("Too low! Try again.");
                }
                System.out.println("\nYou have " + maxAttempts + " attempts left.");
            }
            
            if (maxAttempts == 0) 
            {
                System.out.println("\n\nSorry, you have used all attempts. The correct answer was: " + targetNumber);
            }

            System.out.println("\nYour score for this round is: " + score);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) 
            {
                playAgain = false;
                System.out.println("\nThank you for playing! your final score is:"+score);
            } else 
            {
                System.out.println("Starting a new round...");
            }
        }

        scanner.close();
    }
}