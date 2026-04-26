import java.util.Stack;

public class PostfixEvaluator {
    public static void main(String[] args){
        Stack<Integer> operands = new Stack<>();
        String str1 = "2 3 -";
        String str2 = "2 3 +";
        String str3 = "4 5 / 4 *";
        String str4 = "5 6 + 2 %";
        String str5 = "5 7 8 + *";

        System.out.println(evaluatePostfix(str1));
        System.out.println(evaluatePostfix(str2));
        System.out.println(evaluatePostfix(str3));
        System.out.println(evaluatePostfix(str4));
        System.out.println(evaluatePostfix(str5));


    }

    public static Integer evaluatePostfix(String expression){

        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            }else {

                int b = stack.pop();
                int a = stack.pop();

                if (token.equals("+")) stack.push(a + b);
                else if (token.equals("-")) stack.push(a - b);
                else if (token.equals("*")) stack.push(a * b);
                else if (token.equals("/")) stack.push(a / b);
                else if (token.equals("%")) stack.push(a % b);
            }
        }
        return stack.pop();


    }
}
