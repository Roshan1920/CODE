//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String arr[] = in.readLine().trim().split("\\s+");
            List<String> dict = new ArrayList<String>();
            for(int i = 0;i < n;i++)
                dict.add(arr[i]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            List<String> ans = new ArrayList<String>();
            ans = ob.wordBreak(n, dict, s);
            if(ans.size() == 0)
                System.out.println("Empty");
            else{
                List<String> sol = ans.stream().sorted().collect(Collectors.toList());
                for(int i = 0;i < sol.size();i++)
                    System.out.print("("+sol.get(i)+")");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java
//Using DFS
class Solution
{   
    static List<String> ans;
    static List<String> wordBreak(int n, List<String> dict, String s)
    {
        // code here
        ans=new ArrayList<>();
        HashSet<String> set=new HashSet<>();// set to efficiently check if a word exists in the dictionary.
        for(String val:dict)set.add(val);
         //wordBreakHelper is to update idx, the current word, and the same set and list parameters. 
        wordBreakHelper(0,"",s,set,new ArrayList<>());
        return ans;
    }
    
   
    static void wordBreakHelper(int idx,String word,String s,HashSet<String> set,ArrayList<String> list)
    {
        if(idx==s.length())
        {
           if(word.equals(""))
           {
               StringBuilder sb=new StringBuilder();
               for(String val:list)sb.append(val+" ");
               sb.deleteCharAt(sb.length()-1);
               ans.add(sb.toString());
           }
           return;
        }
        
        char ch=s.charAt(idx);
        word+=ch;
        if(set.contains(word))
        {
          list.add(word);
          wordBreakHelper(idx+1,"",s,set,list);
          list.remove(list.size()-1);
        }
        wordBreakHelper(idx+1,word,s,set,list);
    }
}