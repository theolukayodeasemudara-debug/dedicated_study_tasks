public class TaskSix{
    public static void main(String[] args){
        // I used a loop to add all numbers from 0 to 100 together.
        // The variable "sum" starts at 0, and each number from the loop
        // is added to it step by step until the loop reaches 100.
        int sum = 0;
        for(int index = 0; index <= 100; index++){
            sum += index;
        }
        System.out.println(sum);
    }
}
