public class TaskOne {
    public static void main(String[] args) {

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        int factorial = 1;

        for (int count = 1; count <= number; count++) {
            factorial = factorial * count;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
