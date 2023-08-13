//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int nthFibonacci(int n){
        // code here
        int m = 1000000007;
        int a=0;
        int b=1;
        int ans = a+b;
        
        for(int i=2;i<=n;i++){
            ans =(a+b)%m;
            a=b;
            b=ans;
        }
        return ans;
    }
}
