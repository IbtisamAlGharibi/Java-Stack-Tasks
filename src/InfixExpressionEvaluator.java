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

    }
}
