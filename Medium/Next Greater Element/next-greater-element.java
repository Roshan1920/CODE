//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] nextGreater=new long[n];
        Stack<Long> s=new Stack<>();
        
// iterates over the elements of the input array in reverse order, 
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=arr[i])
            {
                s.pop();
            }
//Agar Bada hai current element top elemesnt se to fir yeh next greater hone se raha, to pop out karo
            if(s.isEmpty())
            {
                nextGreater[i]=-1;
            }
//Khali hai to return kar do -1
            else{
                nextGreater[i]=s.peek();
            }
            s.push(arr[i]);
// Nhi to top element ko assign kar do nextGreater aur reutrn kar do every time.
        }
        return nextGreater;
    } 
}