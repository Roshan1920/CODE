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
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends

//Approach_1 -Find all prefix and suffix and compare 
/*eg- abab  Prefix - a ab aba abab || Sufix- b ab bab abab
here ab and abab are 2 string with same pre and sufix, but abab is also the whole string, so answer is ab
*/

//App2  Using KMP string matching algo
/*
1.Take lps of string_length[0,0,0,0..n-1]
2. take a pointer j at n=0 and i at n =1
3. check  if(i!=j) i++, 
and if i=j, then increase i++, j++, and also mark 1 on lps at the postn of i
Again if i=j mark the index of j by +1 i.e 2.And at the end,return the value which is at end of lps.
*/

class Solution {
    int lps(String s) {
        // code here
        int A[]= new int[s.length()];
        int j=0;
        int i=1;
        while(i<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                A[i]=j+1;
                i++;
                j++;
            }
            else{
                if(j==0)
                {
                    i++;
                }
                else
                {
                  j=A[j-1];
                }
            }
            
        }
        return A[s.length()-1];
        
    }
}