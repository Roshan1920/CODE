//2 pointer approach
import java.util.Arrays;

public class MoveNeg {
    public static void main(String argss[])
{
    int [] arr = {1,2,-3,4,-1,-6,8};
    int L=0, R= arr.length-1;

    while(L<R)// jab tak left bada ho right se chalate rehna hai
    {
      while(arr[L]<0)L++; //jab tak left negative hai
      while(arr[R]>0)R--;//jab tak right positive hai

      if(L >= R )break; // jab left right ke equal ho jayega band kar do

    // aur agar left negative nahi hai aur right positive nahi hai, to swap karo
      int temp = arr[L];
      arr[L] =arr[R];
      arr[R] = temp;
    }
    System.out.println(Arrays.toString(arr));
}
}
