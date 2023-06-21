//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends




//User function Template for Java
class Solution {
    static int findMaxLen(String S) {

        Stack<Integer> s = new Stack<>();
        s.push(-1);
    //intialize with -1 as base case.
        int res = 0;
        for(int i=0; i<S.length(); i++)
        {
            if(S.charAt(i)=='(')
                s.push(i);
                
//if the curr char= (, push its index onto the stack s.


            else
            {
                if(s.isEmpty()==false)
                {
                    s.pop();
                }
                if(s.isEmpty()==false)
                {
                    res = Math.max(res, i-s.peek());
                }
                else
                {
                    s.push(i);
                }
            }
        }
        
        return res;
    }
};