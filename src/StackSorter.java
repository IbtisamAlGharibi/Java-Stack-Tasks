import java.util.Stack;

public class StackSorter {
    static Stack<Integer> original = new Stack<>();
    static Stack<Integer> temporary = new Stack<>();
    public static void main(String[] args){

        original.push(5);
        original.push(1);
        original.push(4);
        original.push(2);

        System.out.println("Before sorting:");
        displayStack(original, "Original");

        sortStack(original);

        System.out.println("After sortStack:");
        displayStack(original, "Original");

        sortStackRecursive(original);
        System.out.println("After sortStackRecursive:");
        displayStack(original, "Original");

        insertInSortedOrder(original, 3);

        System.out.println("After insertInSortedOrder");
        displayStack(original, "Original");


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
            temporary.push(temp);
        }

        while (!temporary.isEmpty()) {
            stack.push(temporary.pop());
        }
    }

    public static void insertInSortedOrder(Stack<Integer> stack, int value){
        while (!stack.isEmpty() && stack.peek() > value) {
            temporary.push(stack.pop());
        }
        stack.push(value);

        while (!temporary.isEmpty()) {
            stack.push(temporary.pop());
        }
    }

    public static void displayStack(Stack<Integer> stack, String name){
        System.out.println("Original stack:" + original);
        System.out.println("Temporary stack:" + temporary);
    }
}
