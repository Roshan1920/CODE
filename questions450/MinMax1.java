//Using Math Function

public class MinMax1 {
    static void minMax(int arr[])
    {
      if(arr==null || arr.length ==0) return;
      int min = arr[0];
      int max = arr[0];
      for(int i=0;i<arr.length;i++)
      {
        max = Math.max(max, arr[i]);
        min = Math.min(min, arr[i]);
      }
      System.out.println(max + " Maximum");
      System.out.println(min + " Minimum");
    }
    public static void main(String args[])
    {
      int arr[] = {1,2,3,8,5,6,7};
      minMax(arr);
      
    }
}
