// Find the smallest number from 5 user inputs.

public class TaskTen{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.println("enter a base number");
        int lowestNum = inputCollector.nextInt();
        
        int index = 1;
        while(index <= 5){
            System.out.println("enter number");
            int number = inputCollector.nextInt();
            if(number < lowestNum){
                lowestNum = number;
            }
            index++;
        }
            System.out.println("the smallest of the numbers you entered is: " + lowestNum);
    }
}
