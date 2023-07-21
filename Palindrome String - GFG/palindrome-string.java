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
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
       int i=0;int j=S.length()-1;
        while(i<j){
            if(S.charAt(i)!=S.charAt(j)){
                return 0;
            }
            else{
                i++;
                j--;
            }
        }
        return 1;
    }
};
/*
or
String rev="";
        int ans=0;
        
        for(int i=S.length()-1;i>=0;i--){
            rev+=S.charAt(i);
        }
        if(S.equals(rev)){
            ans=1;
        }
        return ans;
        }
        */