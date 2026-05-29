public class TaskNine{
    public static void main(String[] args){

        int index = 1;
        do{
            if(index % 2 == 0 && index % 5 == 0){
                System.out.println(index + " ");
            }
                index++;
        } while(index <= 50);
    }
}
