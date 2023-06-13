//{ Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}




// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

//App- 
//1.Find Middle
//2. Reverse the 2nd half
//3. Put a pointer at start of both halves.
//4. Traverse both the pointers simultaneously and check if the elements are equal.
// 
class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        Node fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //We are at the midle point now,and slow is pointing to it.
        //So from the element next to slow, we will be reversing the list.
        if(fast!=null){
            slow=slow.next;
        }
        slow=reverseList(slow);
        fast=head;

         //Until slow is not null,check if fast and slow are giving same values or not, also keep iterating them.
        while(slow!=null){
           if(fast.data!=slow.data)
                return false;
        
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
    
    public Node reverseList(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
        return head;
    }

    
}

