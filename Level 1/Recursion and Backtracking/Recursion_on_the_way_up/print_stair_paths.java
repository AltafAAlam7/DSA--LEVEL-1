import java.util.Scanner;

// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A number n
// Output Format
// Print paths (one path in each line) in order hinted by Sample output
public class print_stair_paths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String ans = "";
        printStairPaths(n,ans);
        scn.close();
    }

    public static void printStairPaths(int n, String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return ;
        }
        if(n<0)
            return;
        printStairPaths(n-1, ans+"1");
        printStairPaths(n-2, ans+"2");
        printStairPaths(n-3, ans+"3");
    }
}
