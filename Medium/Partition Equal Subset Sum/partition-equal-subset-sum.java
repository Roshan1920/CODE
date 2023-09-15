//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0;
        for(int i = 0;i < N; i++)
            sum += arr[i];
        int target = sum / 2;
        if(sum % 2 != 0)
            return 0;
        int dp[][] = new int[N+1][sum + 1];
        return solve(arr,dp,target,0) == true ? 1 : 0;
    }
    public static boolean solve(int[] arr, int[][] dp , int target , int idx)
    {
        if(target < 0)
            return false;
        if(idx == arr.length)
        {
            if(target == 0)
                return true;
            else
                return false;
        }
        return solve(arr , dp , target - arr[idx] , idx + 1) || solve(arr , dp , target, idx + 1);
    }
}