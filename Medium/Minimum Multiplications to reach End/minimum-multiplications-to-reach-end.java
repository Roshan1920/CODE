//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends



class Solution {
    int minimumMultiplications(int[] a, int start, int end) {
        int n=a.length;
        int ans[] = new int[100001];
        Arrays.fill(ans, -1);
        int mod = 100000;
        Queue<Integer> q = new LinkedList<>();
        q.add(start % mod);
        ans[start] = 0;
        while (!q.isEmpty()) {
            int top = q.peek();
            q.remove();
            if (top == end) {
                return ans[end];
            }
            for (int i = 0; i < n; i++) {
                int pushed = top * a[i];
                pushed = pushed % mod;
                if (ans[pushed] == -1) {
                    ans[pushed] = ans[top] + 1;
                    q.add(pushed);
                }
            }
        }
        return -1;
    }
}