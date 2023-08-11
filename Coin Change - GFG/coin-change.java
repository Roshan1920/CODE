//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends




class Solution {
    public long memoize(int coins[], int N, long dp[][], int ind, int sum, int amt) {
        if (amt == sum) {
            return 1;
        }
        if (amt > sum || ind == N) {
            return 0;
        }
        if (dp[ind][amt] != -1) {
            return dp[ind][amt];
        }
        long tk = memoize(coins, N, dp, ind, sum, amt + coins[ind]);
        long ntk = memoize(coins, N, dp, ind + 1, sum, amt);
        long total = tk + ntk;
        dp[ind][amt] = total;
        return total;
    }

    public long count(int coins[], int N, int sum) {
        long dp[][] = new long[N+1][sum + 1];
        for (long[] a : dp) {
            Arrays.fill(a, -1);
        }
        long ans = memoize(coins, N, dp, 0, sum, 0);
        return ans;
    }
}