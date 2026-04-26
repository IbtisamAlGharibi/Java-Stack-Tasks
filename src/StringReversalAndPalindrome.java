import java.util.Stack;

public class StringReversalAndPalindrome {
    public static void main(String[] args){
        Stack<Character> characters = new Stack<>();
        String str1 = "mom";
        String str2= "dad";
        String str3 = "brother";
        String str4 = "sister";
        String str5 = "aunt";


        System.out.println( reverseString(str1)+" "+"Is palindrom?" + isPalindrome(str1));
        System.out.println( reverseString(str2)+ " "+ "Is palindrom?" + isPalindrome(str2));
        System.out.println( reverseString(str3)+" "+"Is palindrom?" + isPalindrome(str3));
        System.out.println( reverseString(str4)+ " "+ "Is palindrom?" + isPalindrome(str4));
        System.out.println( reverseString(str5)+ " "+ "Is palindrom?" + isPalindrome(str5));



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

        return true;
    }
}
