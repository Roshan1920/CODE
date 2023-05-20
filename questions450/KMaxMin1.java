import java.util.*;
public class KMaxMin1 {
    public static void main(String[] args)
    {
        int[] arr = {6,2,3,4,1,9};
        int k=3;
        Arrays.sort(arr);//1,2,3,4,6,9
        System.out.println(arr[k-1]);
    }
}
