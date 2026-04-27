import java.util.Stack;

public class QueueUsingTwoStacks {
    static Stack<String > inputStack = new Stack<>();
    static Stack<String > outputStack = new Stack<>();
    public static void main(String[] args){

    }

    public static void enqueue(String element){
        inputStack.push(element);
    }

    public static void dequeue(){
        if (outputStack.isEmpty()){
            outputStack.push(inputStack.pop());
            String frontElement = outputStack.pop();
            System.out.println(frontElement);
        }
        System.out.println(outputStack);
        System.out.println(inputStack);

    }

    public static void  peek(){
        String frontElement = outputStack.peek();
        System.out.println(frontElement);
    }

    public static boolean isEmpty(){
        return inputStack.isEmpty() && outputStack.isEmpty();
    }


}

