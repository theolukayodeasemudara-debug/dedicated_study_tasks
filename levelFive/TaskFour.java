// Create a basic calculator that runs continuously until the user exits.

public class TaskFour{
    
    public static double addNum(double numOne, double numTwo){
        return numOne + numTwo;
    }
    
    public static double minusNum(double numOne, double numTwo){
            return numOne - numTwo;
    }

    public static double divideNum(double numOne, double numTwo){
            return numOne / numTwo;
    }
    
    public static double multiplyNum(double numOne, double numTwo){
            return numOne * numTwo;
    }
    
    public static double operand(char operator, double numOne, double numTwo){
        if(operator == '+'){
            return addNum(numOne, numTwo);
        } else if(operator == '-'){
            return minusNum(numOne, numTwo);
        } else if(operator == '*'){
            return multiplyNum(numOne, numTwo);
        } else if(operator == '/'){
            return divideNum(numOne, numTwo);
        } else{
            System.out.println("invalid operand type!!!");
        }
        return 0;
    }

    public static void main(String[] args){
        // System.out.prdoubleln(multiplyNum(20,10));
        
        System.out.println(operand('+', 20, 22));
    }
}
