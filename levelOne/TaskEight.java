public class TaskEight{
    public static void main(String[] args){
        // I used a loop to print all multiples of 3 between 1 and 50.
        // The index starts from 3 and keeps increasing by 3 each time,
        // so only numbers that are divisible by 3 are printed.
        for(int index = 3; index <= 50; index += 3){
            System.out.print(index + " ");
        }
    }
}
