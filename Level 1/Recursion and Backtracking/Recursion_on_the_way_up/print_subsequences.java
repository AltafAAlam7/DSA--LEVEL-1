import java.util.Scanner;

// 1. You are given a string str.
// 2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A string str
// Output Format
// Subsequences of str in order hinted by Sample output
public class print_subsequences{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String ans="";
        printSS(str, ans);
        scn.close();
    }

    public static void printSS(String str, String ans) {

        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        printSS(ros, ans+ch);
        printSS(ros, ans);
    }
}
