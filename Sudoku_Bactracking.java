public class Sudoku_Bactracking {

    public static void printBoard(int sudoku[][]){
        for(int i=0; i<sudoku.length; i++){
            for(int j=0; j<sudoku.length; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int sudoku[][],int row, int col, int digit){
        //Column
        for(int i=0; i<sudoku.length; i++){
            if (sudoku[i][col]==digit) {
                return false;
            }
        }

        //Row 
        for(int j=0; j<sudoku.length; j++){
            if (sudoku[row][j]==digit) {
                return false;
            }
        }

        //Grid 
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if (sudoku[i][j]==digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //Base Case
        if (row==9) {
            return true;
        }

        int nextRow = row, nextCol = col+1;
        if ((col+1)==9) {
            nextRow = row+1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        //recursion
        for(int digit=1; digit<=9; digit++){
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){ //solution exist
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Q)Write a function complete a Sudoku Board
        System.out.println("Before Filling Sudoku: ");
        int sudoku[][] =
        {{3 ,0 ,6, 5, 0, 8, 4, 0, 0},
        {5, 2 ,0, 0 ,0, 0, 0 ,0, 0},
        {0, 8, 7, 0 ,0 ,0, 0, 3, 1 },
        {0, 0, 3, 0 ,1, 0, 0, 8, 0},
        {9, 0 ,0, 8 ,6 ,3, 0, 0, 5},
        {0, 5 ,0, 0 ,9 ,0, 6 ,0, 0},
        {1, 3, 0, 0 ,0 ,0 ,2, 5, 0},
        {0, 0, 0, 0 ,0, 0, 0, 7, 4},
        {0, 0 ,5 ,2, 0 ,6 ,3 ,0, 0}};
                        //    {{0,0,8,0,0,0,0,0,0},
                        //    {4,9,0,1,5,7,0,0,2},
                        //    {0,0,3,0,0,4,1,9,0},
                        //    {1,8,5,0,6,0,0,2,0},
                        //    {0,0,0,0,2,0,0,6,0},
                        //    {9,6,0,4,0,5,3,0,0},
                        //    {0,3,0,0,7,2,0,0,4},
                        //    {0,4,9,0,3,0,0,5,7},
                        //    {8,2,7,0,0,9,0,1,3}};
        printBoard(sudoku);
        System.out.println();
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution is Exist.");
            printBoard(sudoku);
        }
        else{
            System.out.println("Solution does not exist.");
        }
    }
}
