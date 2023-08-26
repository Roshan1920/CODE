//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


class Solution {
    public int longestkSubstr(String str, int k) {
        int mx =-1;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        while(j < str.length()){
            char ch = str.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);

            if(map.size() < k){
                j++;
            }else if(map.size()==k){
                mx = Math.max(mx,j-i+1);
                j++;
            }else if(map.size() > k){
                while(map.size() > k ){
                    char c = str.charAt(i);
                    map.put(c,map.get(c)-1);
                    if(map.get(c)==0){
                        map.remove(c);
                    }
                    i++;
                }
                j++;
            }
        }
        return mx;
        
        
    }
}