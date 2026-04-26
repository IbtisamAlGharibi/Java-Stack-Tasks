import java.util.Stack;

public class ParenthesesValidator {
    public static void main(String[] args){
        Stack<String>  characters = new Stack<>();
        characters.push("<>");
        characters.push("[]");
        characters.push("{}");
        characters.push("()");
        characters.push("//");

        for (int i = 0 ; i<characters.size();i++){
            boolean check = isBalanced(characters.get(i));
            System.out.println(check);
        }

    }

    public static Boolean isBalanced(String str){
        Stack<Character>  stack = new Stack<>();

        for (int i =0; i<stack.size();i++){

           if (str.charAt(i)== '<' && str.charAt(i+1)== '>'|| str.charAt(i)== '(' && str.charAt(i+1)== ')'
                   || str.charAt(i)== '[' && str.charAt(i+1)== ']' || str.charAt(i)== '{' && str.charAt(i+1)== '}'
                   || str.charAt(i)== '/' && str.charAt(i+1)== '/'){
               stack.push(str.charAt(i));
               stack.push(str.charAt(i+1));
               System.out.println("True");
           }
           return true;

        }
        return false;
    }

}


