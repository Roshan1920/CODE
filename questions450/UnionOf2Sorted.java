import java.util.*;
public class UnionOf2Sorted {
 public static void main(String args[]) 
 {
   int arr1[] = {1,1,2,3,3};
   int arr2[] ={2,3,3,4,5};
   int left=0, right=0;
   
   List<Integer> result = new ArrayList<>();
   //we used list as we dont know how many numbers will be in union

   while (left<arr1.length|| right<arr2.length){

    //SKIP DUPLICATE

    while(left>0 && left<arr1.length && arr1[left] == arr1[left-1])
    { left++;  }

    while(right>0 && right<arr2.length && arr2[right] == arr2[right-1])
    { right++;  }

    //ONE ARRAY EXHAUSTS

    if(left >= arr1.length)
    {
       result.add(arr2[right]);
       right++;
       continue;
    }
    if(right <=arr2.length)
    {
       result.add(arr2[left]);
       left++;
       continue;
    }

    //COMPARISON
    if(arr1[left]<arr2[right])
    {
        result.add(arr1[left]);
        left++;
    }
    else if(arr2[left]<arr1[right])
    {
        result.add(arr2[right]);
        right++;
    }
    else{ result.add(arr1[left]);
    left++;
    right++;
}

   }
   System.out.println(result);
 }  
}
