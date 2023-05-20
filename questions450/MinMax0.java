//Using if-else
public class MinMax0 {

    static void  minANDmax(int arr[])
    {
      if(arr==null|| arr.length==0) return ;

      int n =arr.length;

      int min= arr[0]; 
      int max= arr[0];
      for(int i =0;i<n;i++)
      {
        if(min>arr[i])
        {
           min = arr[i];
           // DO NOT  repeat this MISTAKE--  arr[i] = max;
        }
        if(max<arr[i])
        {
          max = arr[i];
        }
      }
      System.out.println(max+" Maximium");
      System.out.println(min+" Minimum");
     
    }
    public static void main(String args[])
    {
        int [] arr ={1,3,5,7};
        minANDmax( arr );
    }
}
