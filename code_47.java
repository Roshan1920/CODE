class MinArray
{
  public static int findMinimum(int[] arr) {
 
    int minimum = arr[0];
 
    for (int i = 1; i < arr.length; i++) {
 
if (arr[i] < minimum) {
    minimum = arr[i];
  }
}
return minimum;
} 

public static void main(String args[]) {

int[] arr = { 5, 1, 2, 9};

System.out.print("Array : ");
for(int i = 0; i < arr.length; i++)
  System.out.print(arr[i] + " ");
System.out.println();

int min = findMinimum(arr);
System.out.println("Minimum in the give array: " + min);

}
}
