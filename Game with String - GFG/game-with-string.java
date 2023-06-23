//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java



// User function Template for Java

class Solution{
    static int minValue(String s, int k){
        
        int[] f = new int[26];
        for(char ch : s.toCharArray())
        {
            f[ch - 'a']++;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : f){
            if(val > 0){
                pq.add(val);
            }
        }
        
        int ans = 0;
        while(k > 0 && pq.size() > 0){
            int val = pq.poll();
            val--; k--;
            if(val > 0) pq.add(val);
        }
        
        while(!pq.isEmpty()){
            ans += Math.pow(pq.peek(),2);
            pq.poll();
        }
        
        return ans;
    }
}