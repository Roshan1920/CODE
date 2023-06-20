//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		if(!s.isEmpty())
		{
		    int x = s.pop();
		    sort(s);
		    insert(s,x);
		}
		return s;
	}

	public void insert(Stack<Integer> s,int x)
	{
	    if(s.isEmpty() || s.peek()<=x)
	    {
	        s.push(x);
	    }
	    else
	    {
	        int a = s.pop();
	        insert(s,x);
	        s.push(a);
	    }
	}
}











/* For-11 2 32 3 41
pop the top element 41 and store it in the variable x.
We recursively call the sort function on the remaining elements [11, 2, 32,3]
The same process is repeated for the smaller stack [11, 2, 32, 3].
3 poped  and stored in x.
in 11, 2, 32
 popped 32 and stored in x.
11, 2
popped 2 and stored in x.
11
The stack has only one element,11, so it is already sorted.
*/





/*
The insert function is called to insert x (2) into the sorted stack [11].
Since 11 > 2, we pop 11 and recursively call the insert function on the remaining stack [2].
The stack [2] has only one element, so it is already sorted.
We push 11 back onto the stack.
The insert function is called to insert x (32) into the sorted stack [11, 2].
Since 32 is greater than 2, we push 32 onto the stack.
The stack [11, 2, 32] is now sorted.
The insert function is called to insert x (3) into the sorted stack [11, 2, 32].
Since 3 is less than 32, we pop 32 and recursively call the insert function on the remaining stack [11, 2].
The stack [11, 2] has only two elements, so it is already sorted.
We push 32 back onto the stack.
The stack [11, 2, 32, 3] is now sorted.
The insert function is called to insert x (41) into the sorted stack [11, 2, 32, 3].
Since 41 is greater than 3, we push 41 onto the stack.
The stack [11, 2, 32, 3, 41] is now sorted.
The insert function is called to insert x (11) into the sorted stack [2, 3, 32, 41].
Since 11 is less than 41, we pop 41 and recursively call the insert function on the remaining stack [2, 3, 32].
The stack [2, 3, 32] is already sorted.
We push 41 back onto the stack.
The stack [2, 3, 32, 11, 41] is now sorted.
The sorted stack [2, 3, 32, 11, 41] is returned as the output.
Output:
Stack: 41 32 11 3 2

Therefore, the code correctly sorts the given stack in descending order, as expected.






*/