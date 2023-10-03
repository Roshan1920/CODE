//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends


class Solution
{
    String colName (long n)
    {

        StringBuilder sb = new StringBuilder();
        while(n>0)
        {
            long i = (n-1)%26;
            sb.append((char)(i+'A'));
            n = (n-1)/26;
        }
        return sb.reverse().toString();
    }
}
            