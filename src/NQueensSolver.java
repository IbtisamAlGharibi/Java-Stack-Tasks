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

        System.out.println("N=3:");
        solveNQueens(3);

        System.out.println("N=4:");
        displayAllSolutions(4);
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
            if (found) {
                if (row == n - 1) {
                    count++;
                    System.out.println("Solution " + count);

                    Position last = queens.pop();
                    row = last.row;
                    col = last.col + 1;
                } else {
                    row++;
                    col = 0;
                }else {
                    if (queens.isEmpty()) break;

                    Position last = queens.pop();
                    row = last.row;
                    col = last.col + 1;
                }
            }
            System.out.println("Total Solutions: " + count);
        }
    }

    private static boolean isSafe(Position pos, Stack<Position> queens) {
        for (Position q : queens) {
            if (q.col == pos.col) return false;
            if (Math.abs(q.row - pos.row) == Math.abs(q.col - pos.col)) return false;
        }
        return true;
    }

    public static void displayBoard(Stack<Position> queens, int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        for (Position p : queens){
            board[p.row][p.col] = 'Q';}

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void displayAllSolutions(int n) {
        solveNQueens(n);
    }

}