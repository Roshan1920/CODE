package BitMan;

public class clearBit {
    public static void main(String args[])
    {
        System.out.println("jai maa saraswati");
/* Q. Clear 3rd bit (pos 2) of a number 0101
 * Ans_1. 1<<2 i.e 0001<<2
 *      = 0100(bit mask)
 *   2. ~0100(NOT) =1011
 *      1011 AND 0101
 *     = 0001
 */
  int n =5;
  int pos = 2;
  int Bitmask = 1<<pos;
  int notBitmask =  ~(Bitmask);


  int newNumber = notBitmask & n;
  System.out.println(newNumber);
    }
}
