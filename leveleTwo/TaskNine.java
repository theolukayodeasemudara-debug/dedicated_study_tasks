// Find the largest number from 5 user inputs.

public class TaskNine{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        int index = 1;
        int largestNum = 0;
        while(index <= 5){
            System.out.println("enter number");
            int number = inputCollector.nextInt();
            if(number > largestNum){
                largestNum = number;
            }
            index++;
        }
            System.out.println("the largest of the numbers you entered is: " + largestNum);
    }
}
