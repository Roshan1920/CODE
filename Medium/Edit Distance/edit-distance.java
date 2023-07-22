//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

//Using DP
//

class Solution {
    public int editDistance(String s, String t) {
        
        int m =s.length();
        int n= t.length();
        
        int dp[][] = new int[m+1][n+1];
        //creating a dp matrix of size m+1,n+1
        //fill the index no at row and column
        for(int i =0;i<=m;i++)
        {
            dp[i][0] = i;
        }
        for(int j =0;j<=n;j++)
        {
            dp[0][j] = j;
        }
        //Now we wil checck elements of s abd t
        //so check if s and t ka lements equal ho to diagonal element kp add kar do
        //else upar ,left and upar ka left corner(diagonal) usme jo v mimimum hoga usme 1 add kar do
        
        for(int i =1;i<=m;i++)
        {
            for(int j =1;j<=n;j++)
            {
                if(s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
            }
        }
        return dp[m][n];
    }
}