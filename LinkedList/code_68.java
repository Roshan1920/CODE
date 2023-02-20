// Java program to demonstrate a Queue

import java.util.LinkedList;
import java.util.Queue;

public class code_68{

	public static void main(String[] args)
	{
		Queue<Integer> q= new LinkedList<>();

		for (int i = 0; i < 6; i++)
			q.add(i);
		System.out.println("Elements of queue "	+ q);

		int removedele = q.remove();
		System.out.println("Removed element-"+ removedele);

		System.out.println(q);

		int head = q.peek();
		System.out.println("Head  queue-"+ head);

		
		int size = q.size();
		System.out.println("Size of queue-"+ size);
	}
}
