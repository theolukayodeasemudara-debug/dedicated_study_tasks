// Create a number guessing game.

public class TaskTwo {

    public static void main(String[] args) {

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        java.util.Random random = new java.util.Random();

        int secretNumber = random.nextInt(10) + 1;
        int guess = 0;

        while (guess != secretNumber) {

        System.out.print("Guess a number between 1 and 10: ");
        guess = inputCollector.nextInt();

        if (guess > secretNumber) {
            System.out.println("Too high");
        }

        else if (guess < secretNumber) {
            System.out.println("Too low");
        }

        else {
            System.out.println("Correct!");
        }
        }
    }
}
