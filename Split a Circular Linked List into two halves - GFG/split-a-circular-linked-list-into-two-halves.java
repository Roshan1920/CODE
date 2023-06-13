//{ Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}


public class circular_LinkedList
{
    Node head, head1, head2;  // head of lisl
	//Node last = null;
	Node last = null;
  
    /* Linked list Node*/
   
                    
    /* Utility functions */
 
    /* Inserts a new Node at front of the list. */
     public void addToTheLast(Node node) 
	 {
		
		  if (head == null) 
		  {
			head = node;
			
		  } else 
		  {
			   Node temp = head;
			   while (temp.next != null)
			   temp = temp.next;

		       temp.next = node;
		  }
	 }
  /* Function to print linked list */
    void printList(Node node)
    {
        Node temp = node;
        if(node != null)
        {
			do{
           System.out.print(temp.data+" ");
           temp = temp.next;
			}while (temp != node);
        }  
        System.out.println();
    }
	
	void circular()
	{
		    last = head;
			while (last.next != null)
				last = last.next;
			last.next = head;
			//System.out.println(last);
	}
	
	 
 
     /* Drier program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			circular_LinkedList llist = new circular_LinkedList();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
			
			
		     }
			 /*Node x = head;
			 while(x!=null)
			 {
				 System.out.print(x.data+" ");
				 x = x.next;
			 }*/
			llist.circular();
          //int k=sc.nextInt();
         gfg g = new gfg();
         llist.head1=null;
         llist.head2=null;
		 g.splitList(llist);
		 llist.printList(llist.head1);
		 llist.printList(llist.head2);
		
		
        t--;
    }
}
}
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class gfg
{
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
             //DO NOT REMOVE THESE 3 LINES
             Node head=list.head;
             Node head1=null;
             Node head2=null;
             
             //Modify these head1 and head2 here, head is the starting point of our original linked list.    
             Node slow=list.head;
             Node fast=list.head;
             
              while(fast.next!=list.head && fast.next.next!=list.head){
                    slow=slow.next;
                    fast=fast.next.next;
              }
              head1=list.head;
              head2=slow.next;
              
              if(fast.next!=head1){
                  fast=fast.next;
              }
                slow.next=head1;
                fast.next=head2;

             
             //DO NOT REMOVE THESE 2 LINES
             list.head1=head1;
             list.head2=head2;
	 }
}