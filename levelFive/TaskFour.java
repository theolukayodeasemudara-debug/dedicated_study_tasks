// Build a simple ATM menu system using loops

public class TaskFour{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        String atmMenu = """
        
            1. Cash Withdrawal          7. Airtime / Mobile Recharge
            2. Balance Inquiry          8. Change PIN
            3. Funds Transfer           9. Account Services
            4. Cash Deposit            10. Language Selection
            5. Cardless Withdrawal     11. Exit 
            6. Bill Payments
        """;
        
        int userPin = 4419;
        int count = 1;
        
        while(true){
                
            System.out.print("enter your 4 digit pin: ");
            int pin = inputCollector.nextInt();
            
            if(pin == userPin){
                System.out.println(atmMenu);
                break;
            } else{
                System.out.println("pin is incorrect. enter correct pin");
                continue;
            }
            
            }
        // }

        

        
       
        
        
        while(true){
            
            System.out.print("enter menu option: ");
            int option = inputCollector.nextInt();
            
            switch(option){
                case 1:{
                        System.out.printf("""
                        
                        Cash Withdrawal
                        
                        1. Savings Account
                        2. Current Account
                        3. Credit Account
                        
                        0 to go back.
                        
                        """);
                        option = inputCollector.nextInt();
                        if(option == 0){
                            System.out.println(atmMenu);
                        }
                        break;
                }
                
                case 2:{
                        System.out.printf("""
                        
                        Balance inquiry
                        
                        1. Current Balance
                        2. Available Balance
                        3. Loan Balance
                        4. Credit Card Balance
                        
                        0 to go back.
                        
                        """);
                        
                        option = inputCollector.nextInt();
                        if(option == 0){
                            System.out.println(atmMenu);
                        }
                        break;
                }
                
                case 11:{
                    System.out.println("take your card, process ended.");
                    return;
                    
                }
                
                default: System.out.println("invalid entry");
                
                
            }
            
        }

    }
}
