//Using reccurssion
import java.util.Arrays;

public class RevArray01 {
    static void reverse(int [] arr, int start, int end)
    {
       if(start > end) return;
       int temp = arr[start];
       arr[start] = arr[end];
       arr[end] = temp;
       reverse(arr,start+1,end-1);
      
    }
    public static void main(String args[])
    {
     int arr[] = {1,2,3,4,5};
     int n = arr.length;
     reverse(arr,0, n-1);
     System.out.println(Arrays.toString(arr));
    }
}
