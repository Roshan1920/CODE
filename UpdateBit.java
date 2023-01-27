package BitMan;
import java.util.*;
public class UpdateBit {
    // Gives option between set and clear operations
    public static void main(String args[])
    {  
        System.out.println("Type 0 or 1");
         Scanner sc = new Scanner(System.in);
         int oper = sc.nextInt();
        int n = 7;
        int pos = 2;
        
        /*Cases- 
         1. Update 0 to 1-- use set operation
         2. Update 1 to 0 - use get operation
         */
        

      int bitMask = 1<<pos;
      if(oper == 1) {
          //set
          int newNumber = bitMask | n;
          System.out.println(newNumber);
      } else {
       //clear
       int newBitMask = ~(bitMask);
       int newNumber = newBitMask & n;
       System.out.println(newNumber);
      }

}
         
        
}
