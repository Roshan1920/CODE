import java.util.*;

public class code_67 {
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");

		System.out.println(ll);

		ll.remove("B");
        //D,A,E,C
		ll.remove(3);
        //D,A,C
		ll.removeFirst();
        //A,C
		ll.removeLast();
        //A

		System.out.println(ll);
	}
}
