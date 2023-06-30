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
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int e = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            int[] A = new int[2*e];
            int[] B = new int[2*e];
            
            for(int i=0; i<2*e; i++)
            {
                A[i] = Integer.parseInt(S1[i]);
                B[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.checkMirrorTree(n,e,A,B));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B)
    {
      HashMap <Integer, Stack<Integer>> hm= new HashMap<>();
       
       for(int i=0; i<2*e; i+=2){
           if(hm.containsKey(A[i])){
               hm.get(A[i]).push(A[i+1]);
           }
           else{
               Stack <Integer> st= new Stack <>();
               st.push(A[i+1]);
               hm.put(A[i], st);
           }
       }
    
       for(int i=0; i<2*e; i+=2){
           if(hm.get(B[i]).peek()!=B[i+1]) 
           return 0;
           
           else{
               hm.get(B[i]).pop();
           }
    }
    return 1;  
    }
};


// Ek stack m pehle wale tree ka child nodes ko store karne ka eg - (1 -> [2, 3])
// Fir pehle tree ke nodes ko stck se pop karke dusre tree ke lements se mtch karne ka.
//Agar same hai to wo mirror hai nhi to nhi.