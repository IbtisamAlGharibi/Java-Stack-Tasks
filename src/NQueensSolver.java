import java.util.Stack;

public class NQueensSolver {
    static class Position {
        int row;
        int col;

        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    public static void main(String[] args){

    }

    public static void solveNQueens(int n) {
        if (n == 0) {
            System.out.println("No board");
            return;
        }

        Stack<Position> queens = new Stack<>();
        int row = 0;
        int col = 0;
        int count = 0;
    }

    private static boolean isSafe(Position pos, Stack<Position> queens) {

    }

}

