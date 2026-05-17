// Build a simple ATM menu system using loops

public class TaskFour{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        String atmMenu = """
        
            1. Check balance        4.Withdraw money
            2. Make Deposits        5.Intercom services
            3. Change password      6.Manage account  
        """;
        System.out.println(atmMenu);
        
        
        while(true){
            
            System.out.print("enter menu option: ");
            int option = inputCollector.nextInt();
            
            switch(option){
                case 1:{
                        System.out.println("check you balance");
                        option = inputCollector.nextInt();
                        if(option == 0){
                            System.out.println(atmMenu);
                        }
                }
            }
            
        }

    }
}
