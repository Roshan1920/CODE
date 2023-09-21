//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code 


class Solution
{
    public int FindMaxSum(int arr[], int n)
    { 
        int sum1=0;
        int sum2=0;
        
        for(int i=0;i<n;i++)
        {
           int temp = sum1;
           sum1 = Math.max(sum2+arr[i],sum1);
           sum2=temp;
        }
        
        return sum1 ;
    }
}