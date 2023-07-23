//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


class Sol
{
    int countRev (String s)
    {
        int countO=0;
        int countC=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                countO++;
            }else{
                if(countO>0){
                    countO--;
                }else{
                    countO++;
                    countC++;
                }
            }
        }
        if(countO%2!=0){
            return -1;
        }
        return ((countO/2)+(countC));
    }
}