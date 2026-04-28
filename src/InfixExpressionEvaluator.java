import java.util.Stack;

public class InfixExpressionEvaluator {
    static Stack<Double> operandStack = new Stack<Double>();
    static  Stack<Character> operatorStack = new Stack<>();

    public static void main(String[] args){

    }
    public static int precedence(char op){
        if (op == '^') return 1;
        if (op == '*' || op == '/' || op == '%') return 2;
        if (op == '+' || op == '-') return 3;
        return 0;
    }

    public static void evaluate(String expression){
        String number = "";
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch) || ch == '.') {
                number += ch;
            } else {

                if (!number.isEmpty()) {
                    operandStack.push(Double.parseDouble(number));
                    number = "";
                }
                if (ch == '(') {
                    operatorStack.push(ch);
                }
                else if (ch == ')') {
                    while (operatorStack.peek() != '(') {
                        double b = operandStack.pop();
                        double a = operandStack.pop();
                        char op = operatorStack.pop();

                    }

                }
            }
        }
    }
}
