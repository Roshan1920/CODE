public class MoveNegative2 {
    public static void main(String args[])
    {
    int arr[] ={1,2,-3,-5,6,-7}; 
    int n = arr.length;
    tempArr(arr, n);
    for(int i: arr)
    {
        System.out.print(i+" ");
    }
    }
     

    static void tempArr(int[] arr, int n)
    {
       int  tempArr[] = new int[n];
       int j = 0;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]>=0)
        {
            tempArr[j++] = arr[i];
        }
       }
       if(j==n|| j==0)
       return;

       for(int i =0;i< arr.length;i++)
       {
        if(arr[i]< 0)
        {
            tempArr[j++] = arr[i];
        }
       }
       for(int i=0;i< tempArr.length;i++)
       {
         arr[i] = tempArr[i];
       }
    }
}
