public class TaskTwo{
// I used a while loop to print even numbers from 1 to 30.
// The index starts at 2 because that’s the first even number,
// and the loop keeps running as long as the index is 30 or less.
// After each print, I increase the index by 2 so it always stays even.
    public static void main(String[] args){
         int index = 2;
         while(index <= 30){
             System.out.print(index + " ");
             index+=2;
         }
    }
}
