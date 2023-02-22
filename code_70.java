import java.util.LinkedList;
import java.util.Deque;

class code_70
 {
  public static void main(String[] args){
    Deque<String> digits = new LinkedList<>();

    digits.add("First");
    System.out.println("LinkedList: " + digits);

    digits.addFirst("Second");
    System.out.println("LinkedList after addFirst(): " + digits);

    digits.addLast("Third");
    System.out.println("LinkedList after addLast(): " + digits);

    digits.removeFirst();
    System.out.println("LinkedList after removeFirst(): " + digits);

    digits.removeLast();
    System.out.println("LinkedList after removeLast(): " + digits);
  }
}