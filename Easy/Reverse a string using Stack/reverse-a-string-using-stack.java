//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends



class Solution {
    
    public String reverse(String S)
    {
        String newString = "";
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i < S.length(); i++) 
        {
            stack.push(S.substring(i, i+1));
        }
        
        
        for(int i = 0; i < S.length(); i++) 
        {
            newString += stack.pop();
        }
        
        return newString;
    }

}