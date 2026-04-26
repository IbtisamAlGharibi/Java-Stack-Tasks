import java.util.Stack;

public class TowerOfHanoiSolver {
    static Stack<String> A = new Stack<>();
    static Stack<String> B = new Stack<>();
    static Stack<String> C = new Stack<>();
    static int count =0;
    public static void main(String[] args){

    }

    public static void initializePegs(int numDisks){
        for (int i = numDisks; i>=1; i--){
            A.push(String.valueOf(i));
        }
    }

    public static void moveDisk(char fromPeg, char toPeg){

    }

    public static void isValidMove(char fromPeg, char toPeg){
        int disk1 = -1;
        int disk2 = -1;

    }
}
