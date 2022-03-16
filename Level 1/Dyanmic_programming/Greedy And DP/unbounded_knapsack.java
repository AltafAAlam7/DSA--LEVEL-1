import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] values = new int[n];
        for(int i=0;i<n;i++)
            values[i] = scn.nextInt();

        int[] wts = new int[n];
        for(int i=0;i<n;i++)
            wts[i] = scn.nextInt();

        int cap = scn.nextInt();

        System.out.println(unbounded_knapsack(values,wts,cap));
    }
    public static int unbounded_knapsack(int[] values, int[] wts, int cap){

        int[] dp = new int[cap+1];

        for(int i=1;i<dp.length;i++){
            for(int j=0;j<values.length;j++){

                int wt = wts[j];
                if(i>= wt)
                    dp[i] = Math.max(dp[i],dp[i-wt] + values[j]);
            }
        }

        return dp[cap];

    }
}