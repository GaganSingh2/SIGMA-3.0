import java.util.Scanner;

public class Qus_Of_BackTracking {
    public static void printSolution(int sol[][]){
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol.length; j++){
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][],int x,int y){
        return (x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1);
    }

    public static boolean solveMazeUtil(int maze[][],int x,int y,int sol[][]){
        //Base Case
        if (x==maze.length-1 && y==maze.length-1 && maze[x][y]==1) {
            sol[x][y]=1;
            return true;
        }

        //check if maze[x][y] is valid
        if (isSafe(maze,x,y)==true) {
            if (sol[x][y]==1) {
                return false;
            }
            sol[x][y]=1;
            if (solveMazeUtil(maze, x+1, y, sol)) {
                return true;
            }
            if (solveMazeUtil(maze, x, y+1, sol)) {
                return true;
            }
            sol[x][y]=0;
            return false;
        }
        return false;
    }

    public static boolean solveMaze(int maze[][]){
        int N=maze.length;
        int sol[][] = new int[N][N];
        if (solveMazeUtil(maze, 0, 0, sol)==false) {
            System.out.println("Solution doesn't exist");
            return false;
        }
        printSolution(sol);
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Rat in a Maze 
        System.out.println("Enter the number of Row: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of Column: ");
        int col = sc.nextInt();
        int maze[][] = new int[row][col];
        System.out.println("Enter the bit in 0 and 1: ");//0 for blocked path and 1 for avilable path
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                maze[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before Traversed Matrix: ");
        printSolution(maze);
        System.out.println("After Traveresed Matrix: ");
        solveMaze(maze);
    }
}
