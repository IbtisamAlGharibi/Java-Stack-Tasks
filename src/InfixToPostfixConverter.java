import java.util.Stack;

public class InfixToPostfixConverter {
    static Stack<String > operators = new Stack<>();
    public static void main(String[] args){

    }

    public static void infixToPostfix(String infix){
        Stack<Character> ops = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (int i =0; i< infix.length(); i++){
            char ch = infix.charAt(i);
        }
    }
}
