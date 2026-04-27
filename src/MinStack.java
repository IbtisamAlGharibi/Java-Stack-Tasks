import java.util.Stack;

public class MinStack {
    static Stack<Integer> mainStack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args){
        push(1);
        push(2);
        push(3);
        push(4);

        pop();
        pop();

        getMin();
        display();


    }

    public static void push(int value){
        mainStack.push(value);
        if (minStack.isEmpty() ||  value <= minStack.peek()){
            minStack.push(value);
        }
        System.out.println("min stack: " + minStack);
        System.out.println("Main stack: " + mainStack);
    }

    public static void pop(){
        int fromMain = mainStack.pop();
        if (fromMain == minStack.peek()){
            minStack.pop();
            System.out.println("min stack: " + minStack);
            System.out.println("Main stack: " + mainStack);
        }
    }

    public static Integer getMin(){
        return minStack.peek();
    }

    public static void display(){
        System.out.println(mainStack);
        System.out.println(minStack);
    }
}
