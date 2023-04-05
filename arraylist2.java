import java.util.ArrayList;
 
public class arraylist2 {
 
    public static void main(String[] arg)
    {
 
        ArrayList<String> numbers   = new ArrayList<String>(4);
 
        numbers.add("10");
        numbers.add("20");
        numbers.add("30");
        numbers.add("40");
 
        
        System.out.println("Numbers ArrayList : "
                           + numbers);
 
      
        int numbers_size = numbers.size();
 
       
        System.out.println("Numbers ArrayList consists of "
                           + numbers_size + " elements");
 
      
        System.out.println(
            "Performing clear operation by using clear function");
 
        numbers.removeAll(numbers);
 
        
        int numbers_size_new = numbers.size();
        System.out.println(
            "Finally Numbers ArrayList consists of "
            + numbers_size_new + " elements");
    }
}