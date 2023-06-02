//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    } 
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
	static void printList(Node node, PrintWriter out) 
	{ 
		while (node != null) 
		{ 
			out.print(node.data + " "); 
			node = node.next; 
		} 
		out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution ob = new Solution();
            Node ans = ob.divide(n, head);
            printList(ans, out); 
            t--;
        }
        out.flush();
    } 
} 
// } Driver Code Ends


//User function Template for Java

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

// class Solution{
//     Node divide(int N, Node head){
//         // code here
        
        
        
//         //Using Even and Odd pointer we will first,
//         Node even=null;
//         Node e=null;
//         Node odd= null;
//         Node o= null;
        
//         while(head){
//             if(head.data%2==0){
//                 if(even==null){
//                 even=head;
//                 e=head;
//                 }
//             }
//             else{
//                 e.next=head;
//                 e= e.next;
//             }
//         }
//         else{
//             if(odd==null)
//             {
//                 odd= head;
//                 o =o.next;
//             }
//         }
//         head= head.next;
//     }
//       if(e) e.next=odd;
//       if(o) o.next=null;
//       if(even) return even;
//       return odd;

//     }
// }/
class Solution{
    
  Node divide(int N, Node head)
  {
        Node even=new Node(0);
        Node temp1=even;
        Node odd=new Node(0);
        Node temp2=odd;
        while(head!=null)
        {
            if(head.data%2==0){
                even.next=head;
                even=head;
            }
            else
            {
                odd.next=head;
                odd=head;
            }
            head=head.next;
        }
        odd.next=null;
        even.next=temp2.next;
        return temp1.next;
        }
    }
