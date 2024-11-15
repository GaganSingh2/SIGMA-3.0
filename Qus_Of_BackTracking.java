import java.util.Scanner;

public class Qus_Of_BackTracking {
    //Q1)
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

    //Q2)-----
    final static char[][] letter = {{},{},{'a','b','c'},{'d','e','f'},
                                   {'g','h','i'},{'j','k','l'},{'m','n','o'},
                                   {'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public static void keyPadCom(String str){
        //Base Case
        int len = str.length();
        if (len==0 || str=="1") {

            System.out.println("Combination is Empty.");
            return;
        }
        recursion(0, len,new StringBuilder(), str);

    }
    public static void recursion(int i, int len, StringBuilder sb, String str){
        if (i==len) {
            System.out.println(sb.toString());
        }
        else{
            char[] word = letter[Character.getNumericValue(str.charAt(i))];
            for(int j=0; j<word.length; j++){
                recursion(i+1, len, new StringBuilder(sb).append(word[j]), str);
            }
        }
    }

    //Q3)--------
    final static int N = 8;

    public static void printSolutionKT(int sol[][]){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int x, int y, int sol[][]){
        return (x>=0 && x<N && y>=0 && y<N && sol[x][y]==-1);
    }

    public static boolean solveKTUtil(int x, int y, int movei,int sol[][],int xMove[],int yMove[]){
        int k,next_x,next_y;
        if (movei==N*N) {
            return true;
        }
        for(k=0; k<8; k++){
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (isSafe(next_x,next_y,sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei+1, sol, xMove, yMove)) {
                    return true;
                }
                else{
                    sol[next_x][next_y]=-1; //BackTracking
                }
            }
        }
        return false;
    }

    public static boolean solveKT(){
        int sol[][] = new int[N][N];
        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                sol[x][y] = -1;
            }
        }
        int xMove[] = {-2,-1,1,2,2,1,-1,-2};
        int yMove[] = {1,2,2,1,-1,-2,-2,-1};

        //As the Knight starts from cell(0,0)
        sol[0][0] = 0;

        if (!solveKTUtil(0,0,1,sol,xMove,yMove)) {
            System.out.println("Solution does not exist.");
            return false;
        }
        else{
            printSolutionKT(sol);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1)Rat in a Maze 
        // System.out.println("Enter the number of Row: ");
        // int row = sc.nextInt();
        // System.out.println("Enter the number of Column: ");
        // int col = sc.nextInt();
        // int maze[][] = new int[row][col];
        // System.out.println("Enter the bit in 0 and 1: ");//0 for blocked path and 1 for avilable path
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         maze[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("Before Traversed Matrix: ");
        // printSolution(maze);
        // System.out.println("After Traveresed Matrix: ");
        // solveMaze(maze);

        //Q2)Keypad Combination:Given a string containing digit from 2-9 inclusive,print all possible letter combination that the number could represent.you can print the answer in any order.(NOTE:-1 does not map to any letter.)
        // System.out.println("Enter the number: ");
        // String str = sc.nextLine();
        // System.out.println("Combination of KeyPad: ");
        // keyPadCom(str);


        //Q3)Knights Tour:Given a N*N board with the knight placed on the first block of an empty board.Moving according to the rules of chess, knights must visit each square exactly once.Print the  order of each cell in which they are visited.
        System.out.println("Result: ");
        solveKT();

        //Time Complexity: 
    }
}

