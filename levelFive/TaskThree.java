public class TaskThree{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        System.out.print("create a password: ");
        int password = inputCollector.nextInt();
        System.out.println("password created successfully!!!");
        
        System.out.println("kindly re-enter your password to confirm your account.");
        int count = 0;
        while(true){
            int passwordRetry = inputCollector.nextInt();
            if(passwordRetry == password){
                System.out.println("password confirmed successfully.");
                break;
            }
            else{
            
                count+=1;
                System.out.println("password incorrect, (%d) no of tries".formatted(count));
                
                if(count == 3){
                    System.out.println("Exceeded no of tries -> (%d), app shutdown!!!!".formatted(count));
                    break;
                }
            }
        }
    }
}
