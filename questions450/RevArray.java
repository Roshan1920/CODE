//Using single array
//Without use of reccursion
public class RevArray
{

static void reverse(int arr[])
{
int i= 0;
int j=arr.length-1;
while(i<j)
{
    int t= arr[i];
    arr[i] = arr[j];
    arr[j]= t;
    i++;
    j--;
    //instead of using j we can give referance of i only
    //int  t = arr[i]
    //arr[i] = arr[n-1-i];
    //arr[n-1-i] = t;
    //i++
}
}

public static void main(String args [])
{
int arr[] = {1,2,3,4,5};
for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+ " ");
}

System.out.println();

reverse(arr);
for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+ " ");
}
}
}