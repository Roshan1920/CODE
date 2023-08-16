//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.findCatalan(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

//Catalan Number- c0=1 ,c1=1, c2 - c0*c1 + c1*c0, c3 = c0*c2 +c1*c1 + c2*c0, c4 = c0*c3+c1*c2+c2*c1+c3*c0

class Solution {
    

    public static long mod(long n){
        return n % 1000000007;
    }
    public static int findCatalan(int n) {
        
        long[] dp = new long[n+1];
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2; i<=n;i++){
            for(int j =0; j<i; j++){
                dp[i]=mod(dp[i])  +  mod(dp[j]*dp[i-j-1]);
                dp[i] = mod(dp[i]);
            }
        }
        return (int)dp[n];
    }
}
        
        