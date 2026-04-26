import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args){
        Stack<Integer> remainders = new Stack<>();
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;
        int num4 = 5;
        int num5 = 8;

        System.out.println("decimal To Binary" +" "+ decimalToBinary(num1) +" "+ "display Conversion Process:"); displayConversionProcess(num1);
        System.out.println("decimal To Binary" +" "+ decimalToBinary(num2) +" "+ "display Conversion Process:"); displayConversionProcess(num2);
        System.out.println("decimal To Binary" +" "+ decimalToBinary(num3) +" "+ "display Conversion Process:"); displayConversionProcess(num3);
        System.out.println("decimal To Binary" +" "+ decimalToBinary(num4) +" "+ "display Conversion Process:"); displayConversionProcess(num4);
        System.out.println("decimal To Binary" +" "+ decimalToBinary(num5) +" "+ "display Conversion Process:"); displayConversionProcess(num5);


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
            int remainder = decimal % 2;
            int quotient = decimal / 2;

            stack.push(remainder);

            System.out.println("quotient"+" "+ quotient +" "+ " remainder " + remainder +" "+ " stack: " + stack);
            decimal = quotient;



        }
    }

}
