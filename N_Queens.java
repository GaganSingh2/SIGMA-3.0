import java.util.Scanner;

public class N_Queens {
    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal left UP
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal Right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("-------Chess Board--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void n_Queens(char board[][], int row) {
        // Base case
        if (row == board.length) {
            // printBoard(board); //(Q1)find & print all ways to solve the n-queens problem
            count++; //(Q2)count the ways to solve the n-queens problem
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                n_Queens(board, row + 1);
                board[row][j] = 'X';
            }
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q)FInd the all ways to place the N-Queens on Chess Board
        System.out.print("Enter the Number of Queen: ");
        int N = sc.nextInt();
        char board[][] = new char[N][N];
        // Initialization
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 'X';
            }
        }
        n_Queens(board, 0);

        //Q)Count the all ways to place the N-Queens on Chess Board'
        System.out.println("Total ways to solve "+N+" Queens: "+count);
    }
}
