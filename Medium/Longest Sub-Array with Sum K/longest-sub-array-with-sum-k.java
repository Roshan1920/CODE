//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends



class Solution{
    
    public static int lenOfLongSubarr (int arr[], int n, int k) {
        //Complete the function
         HashMap<Integer,Integer>mp = new HashMap<>();
        int prefix = 0;
        int max = 0;
        for(int i =0;i<n;i++){
            prefix+=arr[i];
            if(prefix==k){
                max = Math.max(max,i+1);
            }
    //If  prefix sum = k, it means the subarray starting from the beginning 
    //has a sum equal to k, so the maximum length is updated accordingly.
                int rem = prefix-k;
                if(mp.containsKey(rem)){
                    max = Math.max(max,(i-mp.get(rem)));
                }
    // If  difference between current prefix sum and k (rem) exists in the hashmap, it means there is a subarray4
    // whose sum is k. 
    //The length of this subarray is calculated, and if it's greater than the previous maximum,
    //the maximum length is updated.
                if(!(mp.containsKey(prefix))) {
                    mp.put(prefix, i);
                }
        }
    //The current prefix sum is added to the hashmap only if it's not already present. 
    //This ensures that the earliest occurrence of a prefix sum is stored, helping to find the longest subarray.
        return max;
    }
    
    
}

