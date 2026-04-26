import java.util.Stack;

public class TowerOfHanoiSolver {
    static Stack<String> A = new Stack<>();
    static Stack<String> B = new Stack<>();
    static Stack<String> C = new Stack<>();
    public static void main(String[] args){

    }

    public static void initializePegs(int numDisks){
        for (int i = numDisks; i>=1; i--){
            A.push(String.valueOf(i));
        }
    }

    public static void moveDisk(char fromPeg, char toPeg){

    }
}
