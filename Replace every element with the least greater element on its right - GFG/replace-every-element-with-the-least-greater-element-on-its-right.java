//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.findLeastGreater(n, arr);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    Node succ = null;
    public ArrayList<Integer> findLeastGreater(int len, int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Node root = null;

        for(int i=len-1;i>=0; i--){
            root = bst(root,arr[i]);
            if(succ!=null){
                ans.add(succ.data);
                succ = null;
            }else{
                ans.add(-1);
            }
        }
        
        Collections.reverse(ans);

        return ans;
    }
    
    
    public Node bst(Node root,int data){
        if(root==null){
            Node n = new Node(data);
            return n;
        }
        if(data<root.data){
            succ = root;
            root.left = bst(root.left,data);
        }else if(data>=root.data){
            root.right = bst(root.right,data);
        }

        return root;
    }
}


// class Solution {
//   public ArrayList<Integer> findLeastGreater(int len, int[] arr) {
//         ArrayList<Integer> ans = new ArrayList<>();
        
//         TreeSet<Integer> s  = new TreeSet<>();
        
//          for(int i=len-1;i>=0; i--){
//             s.add(arr[i]);
//             Integer it = s.higher(arr[i]);
            
//             if(it==null) ans.add(-1);
            
//             else ans.add(it);
//         }
        
//         Collections.reverse(ans);
        
//         return ans;
        
//     }
// }


        