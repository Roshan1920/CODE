class code_69
{

	static class Node
	{
		int data;
		Node next;
	};
	static void fun1(Node head)
	{
		if (head == null)
		{
			return;
		}

		fun1(head.next);
		System.out.print(head.data + " ");
	}
	static void fun2(Node start)
	{
		if (start == null)
		{
			return;
		}
		System.out.print(start.data + " ");

		if (start.next != null)
		{
			fun2(start.next.next);
		}
		System.out.print(start.data + " ");
	}
	static Node push(Node head_ref, int new_data)
	{
		Node new_node = new Node();

		new_node.data = new_data;

		new_node.next = (head_ref);

		(head_ref) = new_node;
		return head_ref;
	}
	public static void main(String[] args)
	{
		Node head = null;

		head = push(head, 8);
		head = push(head, 6);
		head = push(head, 4);
		head = push(head, 2);
		head = push(head, 1);

		System.out.print("Output of fun1() for " +"list 1->2->4->6->8 \n");
		fun1(head);

		System.out.print("\nOutput of fun2() for " +"list 1->2->3->6->8 \n");
		fun2(head);
	}
} 
