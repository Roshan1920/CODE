//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       for(int i=0;i<A.length-2;i++)
       //We need atleast 2 numbers for finding the remaing sum value, 
       //so the last 2 numbers cant be the remaining third number
       {
           int remSum =X- A[i];
           //the remaining sum will be total - A[i]
           boolean ans = twoSum(remSum,i+1,A.length-1,A);
        
           if(ans) return true;
       }
       return false;
    }
    static boolean twoSum(int remSum,int start, int end, int[] A)
    
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=start;i<=end;i++)
        {
            map.put(A[i],i);
        }
        for(int i= start;i<=end;i++)
        {
            int r= remSum- A[i];
            //the 2nd and third number should not be on same index
            if(map.containsKey(r) && map.get(r)!=i) return true;
        }
        return false;
    }
}
