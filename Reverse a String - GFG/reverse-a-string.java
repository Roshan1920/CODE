//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    public static String reverseWord(String str)
    {
        char ch[]=str.toCharArray();
        int len=str.length();
        for(int i=0;i<len/2;i++){
            char ch1=ch[i];
            ch[i]=ch[len-i-1];
            ch[len-i-1]=ch1;
        }
        return new String(ch);
        
    }
}