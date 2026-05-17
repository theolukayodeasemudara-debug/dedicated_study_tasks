// Reverse a number using loops.
// get number from the user
// initialize a variable temp_reversed
// use modulo to get the remainder

public class TaskTwo{
    public static void main(String[] args){
        
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.println("enter your digits: ");
        int number = inputCollector.nextInt();
        
        int reversed = 0;
        while(number > 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number/10;
        }
            System.out.println(reversed);
    }
}
