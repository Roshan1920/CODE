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
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {

        int inclusive = arr[0];
        int exclusive = 0;

        for (int i = 1; i < n; i++) {
            int prevInclusive = inclusive;

            inclusive = Math.max(exclusive + arr[i], inclusive);
            exclusive = Math.max(prevInclusive, exclusive);
        
// The new value of inclusive is the sum of curr house val and the previous exclusive value
//(as you cannot rob adjacent houses).
//The new value of exclusive is the maximum of the previous inclusive and exclusive values.
        }
        return Math.max(inclusive, exclusive);
        
    }
}