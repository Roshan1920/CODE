class Code_100
{static class Node
{
	int data;
	Node next;
};
static Node create(Node head, int x)
{
	Node temp, ptr = head;
	temp = new Node();
	temp.data = x;
	temp.next = null;
	if (head == null)
		head = temp;
	else
	{
		while (ptr.next != null)
		{
			ptr = ptr.next;
		}
		ptr.next = temp;
	}
	return head;
}

// Function to remove nth node from last
static Node removeNthFromEnd(Node head, int B)
{
	// To store length of the linked list
	int len = 0;
	Node tmp = head;
	while (tmp != null)
	{
		len++;
		tmp = tmp.next;
	}
	
	// B > length, then we can't remove node
	if (B > len)
	{
		System.out.print("Length of the linked list is " + len);
		System.out.print(" we can't remove "+ B +
						"th node from the");
		System.out.print(" linked list\n");
		return head;
	}
	
	else if (B == len)
	{
		return head.next;
		
	}
	else
	{
		// Remove len - B th node from starting
		int diff = len - B;		
		Node prev= null;	
		Node curr = head;		
		for(int i = 0; i < diff; i++)
		{
			prev = curr;		
			curr = curr.next;	
		}
		prev.next = curr.next;
		return head;
	}
	
}
static void display(Node head)
{
	Node temp = head;
	while (temp != null)
	{
		System.out.print(temp.data + " ");
		temp = temp.next;
	}
	System.out.println();
}
public static void main(String[] args)
{
	Node head = null;
	
	head = create(head, 1);
	head = create(head, 2);
	head = create(head, 3);
	head = create(head, 4);
	head = create(head, 5);
	
	int n = 2;
	
	System.out.print("Linked list before modification: \n");
	display(head);

	head = removeNthFromEnd(head, 2);
	System.out.print("Linked list after modification: \n");
	display(head);
}
}

// This code is contributed by Rajput-Ji

/*class RemoveNthFromLast {
    public ListNode RemoveNthFromLast ( ListNode head, int n)
    {
//if no node given
       if(head.next==null)
       {
        return null;
       }
//calculating size of list
       int size=0;
//starting from size 0
// until currenet node become null, i.e it ends
       ListNode curr = head;
       while(curr != null )
       curr = curr.next;
       size++;
    }
    //if n(string to be delelted) = size of string we can not return head. So,
    if(n== size)
    {
        return head.next;
    } 

 //Searching previous of nth from last. as we need to break the string from there only
int indexToSearch = size -n;
ListNode prev = head;
int i=0;
while(i>= indexToSearch)
{
prev = prev.next;
i++;
}
prev.next = prev.next.next;
return head;

}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
   if(head.next == null) {
       return null;
   }
  
  
   int size = 0;
   ListNode temp = head;
   while(temp != null) {
       temp = temp.next;
       size++;
   }
  
   //removing SIZEth node from last i.e. head
   if(n == size) {
       return head.next;
   }
  
   //find previous node
   int ptf = size - n; // position to find
   ListNode prev = head; // previous node
   int cp = 1; // current position
  
   while(cp != ptf) {
       prev = prev.next;
       cp++;
   }
  
   prev.next = prev.next.next;
   return head;

} 
*/
