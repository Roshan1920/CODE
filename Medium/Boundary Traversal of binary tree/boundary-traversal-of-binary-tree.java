//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            
            ArrayList <Integer> res = T.boundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends

/*
Take root element
GO right and its right and its right, until right nullifies,in that case go for left element.
Go left and left of left and so on ,until left nullifies, in that case go for the right element.
Here, make sure to not include leaf nodes, we will include it using in order traversal later on.
*/


class Solution
{
    public Boolean isLeaf(Node node){
        return (node.right == null) && (node.left == null);
    }
    
    public void leftside(Node root, ArrayList<Integer>ans){
        
        root = root.left;
        
        while(root != null){
            if(!isLeaf(root))ans.add(root.data);
            if(root.left != null)root = root.left;
            else root = root.right;
        }
    }
    
    public void leafnode(Node root, ArrayList<Integer>ans){
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        if(root.left != null)leafnode(root.left,ans);
        if(root.right != null)leafnode(root.right,ans);
    }
    
    public void right(Node node, ArrayList<Integer> ans){
        node = node.right;
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        while(node != null){
            if(isLeaf(node) == false)temp.add(node.data);
            if(node.right != null)node = node.right;
            else node = node.left;
        }
        
        for(int i =temp.size()-1; i>= 0; i--){
            ans.add(temp.get(i));
        }
    }

    
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> ans = new ArrayList<>();
	    
	    if(node == null){
	        return ans;
	    }
	    
        if(!isLeaf(node))ans.add(node.data);
        leftside(node,ans);
        leafnode(node,ans);
        right(node,ans);
        
        return ans;
	}
}