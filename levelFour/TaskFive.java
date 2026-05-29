// Find the sum of digits in a number
public class TaskFive{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.println("enter a number");
        int number = inputCollector.nextInt();
        
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            number = number/10;
            sum += digit;
        }
        System.out.println(sum);
    }
}
