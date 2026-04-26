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
        if (isValidMove(fromPeg,toPeg)){
            Integer disk = -1;
            if ( fromPeg == 'A' && !A.isEmpty()){
                disk = Integer.valueOf(A.pop());
            }else if (fromPeg == 'B' && !B.isEmpty()){
                disk = Integer.parseInt(B.pop());

            } else if (fromPeg == 'C' && !C.isEmpty()) {
                disk = Integer.parseInt(C.pop());
        }

    }

    public static boolean isValidMove(char fromPeg, char toPeg){
        int disk1 = -1;
        int disk2 = -1;

        if (fromPeg == 'A' && !A.isEmpty()){
            disk1 = Integer.parseInt(A.peek());

        }else if (fromPeg == 'B' && !B.isEmpty()){
            disk1 = Integer.parseInt(B.peek());

        } else if (fromPeg == 'C' && !C.isEmpty()) {
            disk1 = Integer.parseInt(C.peek());
        }

        if (toPeg == 'A' && !A.isEmpty()){
            disk2 = Integer.parseInt(A.peek());

        }else if (toPeg == 'B' && !B.isEmpty()){
            disk2 = Integer.parseInt(B.peek());

        } else if (toPeg == 'C' && !C.isEmpty()) {
            disk2 = Integer.parseInt(C.peek());
        }
        if (disk1 == -1) return false;
        if (disk2 == -1) return false;
        return  disk1 < disk2;
    }

    static void solveHanoi(int n, char from, char to, char aux){
        if (n == 1){
            moveDisk(from,to);
            return;

        }

    }

    public static void displayPegs(){
        System.out.println("A" + A);
        System.out.println("B" + B);
        System.out.println("C" + C);
    }
}
