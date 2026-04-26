import java.util.Stack;

public class StringReversalAndPalindrome {
    public static void main(String[] args){
        Stack<Character> characters = new Stack<>();
        String str1 = "mom";
        String str2= "dad";
        String str3 = "brother";
        String str4 = "sister";
        String str5 = "aunt";

    }
    public static String  reverseString(String input){
        if (input == null)
            return null;

        Stack<Character> stack = new Stack<>();
        String reversed = "";

        for (int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }

        while (!stack.isEmpty()){
            reversed += stack.pop();
        }
        return reversed;
    }

    public static boolean isPalindrome(String input){
        if (input == null)
            return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) != stack.pop()){
                return false;
            }
        }



    }
}
