//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends

class Solution
{
    public static void rearrange(Node odd)
    {
        Stack<Integer> s =new Stack<>();
        Node currNode=odd;
        while(currNode !=null && currNode.next!=null){
            s.push(currNode.next.data);
            currNode.next=currNode.next.next;
            
            if(currNode.next==null){
                break;
            }
            
            else{
            currNode=currNode.next;
                
            }
            
        }
        
        while (!s.isEmpty()){
            currNode.next=new Node(s.pop());
            currNode=currNode.next;
        }
    }
}