package BitMan;
import java.util.Scanner;
public class OddEven {

    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc .nextInt();

        if((num & 1) ==0)
        {
            System.out.println("Even Number Detected"); 
        }else{
            System.out.println("Odd number detected");
        }
       
    }
    
}
