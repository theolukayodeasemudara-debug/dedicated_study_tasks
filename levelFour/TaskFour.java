// Count the digits in a number
public class TaskFour{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.println("enter a number");
        int number = inputCollector.nextInt();
        
        int count = 0;
        while(number > 0){
            int digit = number % 10;
            count++;
            number = number/10;
        }
        System.out.println(count);
    }
}
