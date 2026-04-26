import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args){
        Stack<Integer> remainders = new Stack<>();
        double num1 = 2.1;
        double num2 = 3.2;
        double num3 = 4.5;
        double num4 = 5.3;
        double num5 = 8.2;

    }

    public static String decimalToBinary(int decimal){
        Stack<Integer> stack = new Stack<>();
        String binary = "";

        while (decimal > 0){
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }
        while (!stack.isEmpty()){
            binary += stack.pop();
        }

        return binary;

    }

    public static void displayConversionProcess(int decimal){
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0){
            int remainder = decimal %2;
            int quotient = decimal / 2;

        }
    }

}
