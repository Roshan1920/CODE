//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends



class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
     int i=0,j=0;
        if(s1.charAt(i)=='0'){
            while(i<s1.length()){
                if(s1.charAt(i)=='0') i++;
                else break;
            }
        }
        if(s2.charAt(j)=='0'){
            while(j<s1.length()){
                if(s1.charAt(j)=='0') j++;
                else break;
            }
        }
        
        if(i==s1.length() || j==s2.length()) {
        return "0"; 
        }
        s1=s1.substring(i,s1.length());
        s2=s2.substring(j,s2.length());
        
        BigInteger a=new BigInteger(s1);
        BigInteger b=new BigInteger(s2);
        BigInteger c=a.multiply(b);
        
        String ans=String.valueOf(c);
        
        return ans;
    }
}