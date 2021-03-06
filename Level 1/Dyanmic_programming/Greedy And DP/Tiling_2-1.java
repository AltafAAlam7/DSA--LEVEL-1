import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            if(i==2){
                dp[i]=2;
                continue;
            }
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.print(dp[n]);
    }
}