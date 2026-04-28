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

                        if (op == '+') operandStack.push(a + b);
                        if (op == '-') operandStack.push(a - b);
                        if (op == '*') operandStack.push(a * b);
                        if (op == '/') operandStack.push(a / b);
                        if (op == '%') operandStack.push(a % b);
                        if (op == '^') operandStack.push(Math.pow(a, b));

                    }
                    operatorStack.pop();
                }else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' || ch == '^') {
                    while (!operatorStack.isEmpty() &&
                            operatorStack.peek() != '(' &&
                            precedence(operatorStack.peek()) <= precedence(ch)) {
                        double b = operandStack.pop();
                        double a = operandStack.pop();
                        char op = operatorStack.pop();

                        if (op == '+') operandStack.push(a + b);
                        if (op == '-') operandStack.push(a - b);
                        if (op == '*') operandStack.push(a * b);
                        if (op == '/') operandStack.push(a / b);
                        if (op == '%') operandStack.push(a % b);
                        if (op == '^') operandStack.push(Math.pow(a, b));

                    }
                    operatorStack.push(ch);
                }
            }
        }
        if (!number.isEmpty()) {
            operandStack.push(Double.parseDouble(number));
        }
        while (!operatorStack.isEmpty()) {
            double b = operandStack.pop();
            double a = operandStack.pop();
            char op = operatorStack.pop();

            if (op == '+') operandStack.push(a + b);
            if (op == '-') operandStack.push(a - b);
            if (op == '*') operandStack.push(a * b);
            if (op == '/') operandStack.push(a / b);
            if (op == '%') operandStack.push(a % b);
            if (op == '^') operandStack.push(Math.pow(a, b));
        }
        System.out.println(operandStack.pop());
    }

    public static void applyOperation(double a, double b, char operator){
        b = operandStack.pop();
        a = operandStack.pop();
        operator = operatorStack.pop();

        double result = 0;

        if (operator == '+') result = a + b;
        if (operator == '-') result = a - b;
        if (operator == '*') result = a * b;
        if (operator == '/') result = a / b;
        if (operator == '%') result = a % b;
        if (operator == '^') result = Math.pow(a, b);

        operandStack.push(result);
    }
}
