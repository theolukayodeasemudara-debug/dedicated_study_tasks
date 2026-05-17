// Print a right triangle pattern

public class TaskTwo{
    public static void main(String[] args){
        for(int index = 1; index <= 10; index++){
            for(int row = index; row >= 1; row--){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
