//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

//
class Solution {
    public static int maxSubStr(String str) {
       int c=0;
       int x=0; // counter of zeros
       int y=0; // counter of ones
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='0')
               x++;
           else
               y++;
           if(x==y)//equal number of 0s and 1s
               c++;
       }
        
       if(x!=y){
           return -1;
       }
       return c;
    }

}

/*
S = "0100110101"
Output: 4
x=1 3 4 5
y=1 3 4 5
x = y = 5 , so count = +1
*/

//{ Driver Code Starts.

class GFG {
	public static void main(String[] args) throws IOException
	{
	    var sc = new FastReader();
	    int test = sc.nextInt();
	    while(test-->0){
    		String s = sc.nextString();
    		System.out.println(Solution.maxSubStr(s));
	    }
	}
    
    public static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		private void read() throws IOException
		{
			st = new StringTokenizer(br.readLine());
		}

		public String nextString() throws IOException
		{
			while(!st.hasMoreTokens())
				read();
			return st.nextToken();
		}

		public int nextInt() throws IOException
		{
			return Integer.parseInt(nextString());
		}

		public long nextLong() throws IOException
		{
			return Long.parseLong(nextString());
		}
	}
}
// } Driver Code Ends