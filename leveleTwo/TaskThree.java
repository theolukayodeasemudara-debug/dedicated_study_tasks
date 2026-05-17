public class TaskThree{
// I used a while loop to count backwards from 50 to 1.
// The index starts at 50, and the loop keeps running as long as
// the index is greater than or equal to 1.
// After each print, the index decreases by 1 so it moves backwards.
    public static void main(String[] args){
         int index = 50;
         while(index >= 1){
             System.out.print(index + " ");
             index--;
         }
    }
}
