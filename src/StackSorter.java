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
    }
}
