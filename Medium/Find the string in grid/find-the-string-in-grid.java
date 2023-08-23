//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends

class Solution
{
    int x[] = {-1,-1,-1,0,0,1,1,1};
    int y[] = {-1,0,1,-1,1,-1,0,1};
    
    public int[][] searchWord(char[][] grid, String word)
    {
        List<int[]> list = new ArrayList<>();
        int m = grid.length, n = grid[0].length, len = word.length();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<8;k++)
                {
                    if(i+(len-1)*x[k]>=0 && i+(len-1)*x[k]<m && j+(len-1)*y[k]>=0 && j+(len-1)*y[k]<n && check(i,j,grid,word,0,x[k],y[k]))
                    {
                        int[] arr = new int[2];
                        arr[0] = i;
                        arr[1] = j;
                        list.add(arr);
                        break;
                    }
                }
            }
        }
        
        int size = list.size();
        int[][] ans = new int[size][2];
        for(int i=0;i<size;i++)
        {
            ans[i][0] = list.get(i)[0];
            ans[i][1] = list.get(i)[1];
        }
        return ans;
    }
    
    private boolean check(int i, int j, char[][] grid, String word, int k, int idx, int idy)
    {
        if(k == word.length())
            return true;
        if(grid[i][j] != word.charAt(k))
            return false;
        return check(i+idx,j+idy,grid,word,k+1,idx,idy);
    }
}