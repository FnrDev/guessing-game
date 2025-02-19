import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computerAge = 25; // The age that needs to be guessed
        int userGuess;

        do {
            System.out.print("Guess the computer's age: ");
            userGuess = scanner.nextInt();

            if (userGuess > computerAge) {
                System.out.println("Too high! Try a lower number.");
            } else if (userGuess < computerAge) {
                System.out.println("Too low! Try a higher number.");
            }
        } while (userGuess != computerAge);

        System.out.println("Congratulations! You guessed the correct age!");
        scanner.close();
    }
}