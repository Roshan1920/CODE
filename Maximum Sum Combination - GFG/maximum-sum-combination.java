//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            List<Integer> ans = obj.maxCombinations(n, k, a, b);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    static List<Integer> maxCombinations(int n, int k, int a[], int b[]) {
        // code here
        ArrayList<Integer>arr=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        k=n-k;
        for(int i=n-1;i>=k;i--)
        pq.add(a[n-1]+b[i]);
        
        for(int i=n-2;i>=k;i--){
            int sum=0;
            for(int j=n-1;j>=k;j--){
                sum=a[i]+b[j];
                if(sum>pq.peek()){
                    pq.poll();
                    pq.add(sum);
                }
                else
                break;
            }
        }
        
        while(!pq.isEmpty())
        arr.add(0,pq.poll());
        
        return arr;
    }
}