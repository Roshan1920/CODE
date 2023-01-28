package Sortiing;
import java.util.*;
public class BubbleSort {
        
    public static void PrintArray(int arr[]){
        for(int i=0;i<=arr.length;i++)
        {
           System.out.println(arr[i]+"");
        }
        System.out.println();
    }
     //bubble sort
    public static void main(String args[]) {
        int arr[] = {7, 8, 1, 3, 2};

        /*1. 7,1,3,2,8__ 2.1,3,2,7,8__ 3.1,2,3,7,8__ 4.7,1,3,2,8 
           n-1 iteratons * 
        */
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
 
    
    PrintArray(arr);
}
}