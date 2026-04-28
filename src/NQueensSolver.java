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
        //solveNQueens(4);
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

        while (true) {
            boolean found = false;
            for (; col < n; col++) {
                Position p = new Position(row, col);
                if (isSafe(p, queens)) {
                    queens.push(p);
                    System.out.println("Push: (" + row + "," + col + ")");

                    found = true;
                    break;
                }
            }
        }
    }

    private static boolean isSafe(Position pos, Stack<Position> queens) {
        for (Position q : queens) {
            if (q.col == pos.col) return false;
            if (Math.abs(q.row - pos.row) == Math.abs(q.col - pos.col)) return false;
        }
        return true;
    }
}