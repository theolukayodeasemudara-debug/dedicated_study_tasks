// Keep asking the user for a password until they enter the correct one
public class TaskSix{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
         int index = 1;
         int password = 4419;
         while(true){
            System.out.println("enter correct password: ");
            int number = inputCollector.nextInt();
            if(number != password){
                System.out.println("password  missmatch");                
            } else{
                System.out.println("password  correct"); 
                break;
            }
            
         }
    }
}
