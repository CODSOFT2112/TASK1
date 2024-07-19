package framedemo2;


	import java.util.Scanner;
	import java.util.Random;

	public class NumberGuessingGame {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int rounds = 0;
	        int totalAttempts = 0;
	        boolean playAgain;

	        do {
	            int numberToGuess = random.nextInt(100) + 1;
	            int attemptsLeft = 10;
	            boolean guessedCorrectly = false;

	            System.out.println("Guess the number between 1 and 100. You have " + attemptsLeft + " attempts.");

	            while (attemptsLeft > 0) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attemptsLeft--;

	                if (userGuess == numberToGuess) {
	                    System.out.println("Congratulations! You've guessed the correct number.");
	                    guessedCorrectly = true;
	                    break;
	                } else if (userGuess > numberToGuess) {
	                    System.out.println("Your guess is too high.");
	                } else {
	                    System.out.println("Your guess is too low.");
	                }

	                System.out.println("You have " + attemptsLeft + " attempts left.");
	            }

	            if (!guessedCorrectly) {
	                System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess);
	            }

	            totalAttempts += (10 - attemptsLeft);
	            rounds++;

	            System.out.print("Do you want to play another round? (yes/no): ");
	            playAgain = scanner.next().equalsIgnoreCase("yes");

	        } while (playAgain);

	        System.out.println("Thank you for playing! You played " + rounds + " rounds with a total of " + totalAttempts + " attempts.");

	        scanner.close();
	    }
	}

