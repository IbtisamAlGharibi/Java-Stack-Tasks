import java.util.Stack;

public class StackSorter {
    static Stack<Integer> original = new Stack<>();
    static Stack<Integer> temporary = new Stack<>();
    public static void main(String[] args){

    }

    public static void sortStack(Stack<Integer> stack){
        for (int i =0; i < stack.size();i++) {
            if (!original.isEmpty()) {
                int temp = original.pop();
                System.out.println(temp);

                while (!temporary.isEmpty() && temporary.peek() > temp){
                    original.push(temporary.pop());
                }
                temporary.push(temp);
            }
        }
        System.out.println(original);
        System.out.println(temporary);
    }

    public static void sortStackRecursive(Stack<Integer> stack){
        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!temporary.isEmpty() && temporary.peek() > temp) {
                stack.push(temporary.pop());
            }

        }
    }
}
