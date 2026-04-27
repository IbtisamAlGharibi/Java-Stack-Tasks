import java.util.Stack;

public class InfixToPostfixConverter {
    static Stack<String > operators = new Stack<>();
    public static void main(String[] args){

    }

    public static int precedence(char op){
        if (op == '^') return 1;
        if (op == '*' || op == '/' || op =='%') return 2;
        if (op == '+' || op == '-') return 3;
        return 0;
    }

    public static void infixToPostfix(String infix){
        Stack<Character> ops = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (int i =0; i< infix.length(); i++){
            char ch = infix.charAt(i);

            if (Character.isDigit(ch)) {
                output.append(ch);
            }else if (ch == '(') {
                ops.push(ch);
            }else if (ch == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    output.append(ops.pop());
                }
                ops.pop();
            }else {
                while (!ops.isEmpty() && ops.peek() != '(' &&
                        precedence(ops.peek()) >= precedence(ch)) {
                    output.append(ops.pop());
                }
                ops.push(ch);
        }

    }

}
