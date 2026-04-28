import java.util.Stack;

public class InfixExpressionEvaluator {
    static Stack<Double> operandStack = new Stack<Double>();
    static  Stack<Character> operatorStack = new Stack<>();



    public static void main(String[] args){
        String expression1 = "3+5*(2-1)";
        String expression2 = "10+2*6";
        String expression3 = "100*(2+12)/14";

        System.out.println("Expression 1: " + expression1);
        evaluate(expression1);

        System.out.println("Expression 2: " + expression2);
        evaluate(expression2);

        System.out.println("Expression 3: " + expression3);
        evaluate(expression3);

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
        System.out.println(operandStack);
        System.out.println(operatorStack);
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
        System.out.println(operandStack);
        System.out.println(operatorStack);
    }

    public static void  getPrecedence(char operator){
        precedence(operator);
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' || ch == '^';
    }
    public static boolean isNumber(char ch) {
        return Character.isDigit(ch) || ch == '.';
    }

}
