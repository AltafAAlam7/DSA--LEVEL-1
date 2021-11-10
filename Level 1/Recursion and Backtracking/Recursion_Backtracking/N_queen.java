import java.util.Scanner;

// N Queens
// Easy  Prev   Next
// 1. You are given a number n, the size of a chess board.
// 2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
// Note - Queens kill at distance in all 8 directions
// 3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A number n
// Output Format
// Safe configurations of queens as suggested in sample output
public class N_queen {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
        scn.close();
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        
       if(row==chess.length)
       {
           System.out.println(qsf+".");
           return;
       }
       for(int col =0;col<chess.length;col++)
       {
        if(IsSafer(chess, row, col)==true)
        {
            chess[row][col]=1;
            printNQueens(chess, qsf+row+"-"+col +", ", row+1);
            chess[row][col]=0;
        }
       }
       
    
    }
    public static boolean IsSafer(int[][] chess,int row ,int col)
    {
        //column
        for(int i=row-1,j=col;i>=0;i--)
        {
            if(chess[i][j]==1)
                return false;
        }
        // left digonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(chess[i][j]==1)
                return false;
        }
        // right digonal
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++)
        {
            if(chess[i][j]==1)
                return false;
        }

        return true;
    }
}
