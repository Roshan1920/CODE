//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node reverse(Node head) 
    { 
        //code here.
        Node prev = new Node(head.data);//1
        head = head.next;//2
        while(head != null) {
            // 123 , h=2
            Node temp = head.next;
            //temp = 3
            head.next = prev;
            //head.next=1
            prev = head;
            //2
            head = temp;
            //head=3
            
            //321
        }
        return prev;
    }
    public static Node addOne(Node head) 
    { 
        if(head == null){
            return head;
        }
        if(head.next == null) {
            head.data += 1;
            return head;
        }
        Node rev = reverse(head);
        Node temp = rev;
        while(rev != null) 
        {
            if(rev.data < 9) {
                rev.data += 1;
                return reverse(temp);
            }
            rev.data = 0;
            rev = rev.next;
        }
        Node nhead = new Node(1);
        nhead.next = temp;
        
        return nhead;
    }

    }

