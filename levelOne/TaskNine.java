public class TaskNine{
    public static void main(String[] args){
        // I used a loop to go through numbers from 1 to 50.
        // Inside the loop, I added a condition to check numbers
        // that are divisible by both 2 and 5 using the modulus operator (%).
        // Only numbers that satisfy both conditions are printed.
        for(int index = 1; index <= 50; index++){
            if(index % 2 == 0 && index % 5 == 0){
                System.out.print(index + " ");
            }
        }
    }
}
