//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends



class Solution {
    // Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n) {
        // Initialize a position variable to keep track of the bit position.
        int position = 1;
        
        // Check each bit of the integer from right to left.
        while (n > 0) {
            // If the least significant bit is 1, return the current position.
            if ((n & 1) == 1) {
                return position;
            }
            
            // Right shift the number to check the next bit.
            n >>= 1;
            
            position++;
        }
        
        // If no set bit is found, return 0.
        return 0;
    }
    

}