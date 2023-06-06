//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long[] res=new long[n];
        //Initialize an array res of size n to store the result.
	    long product=1;
	    //product to 1, which will keep track of the product of all elements in nums.
	    int flag=0;
	    //will count the number of zeroes encountered in nums.
	    
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                flag++;
                continue;
            }
            product*=nums[i];
        }
        for(int i=0;i<n;i++){
            if(flag==1){
                if(nums[i]!=0){
                    res[i]=0;
                }
                else{
                    res[i]=product;
                }
    //Inside the loop, check if the current element nums[i] is equal to 0. If yes, increment the flag by 1 and skip to the next iteration using the continue statement.
    //If not 0, multiply it with the product variable.
            }
            else if(flag==2){
                res[i]=0;
            }
            else if(flag==0){
                res[i]=product/(long)nums[i];
            }
        }
        return res;

	} 
} 
/*
Iterate over the array nums using a for loop.

After the first loop, 3 possible cases based on the value of flag:
flag = 1,  means there is exactly one 0 in nums.
So, iterate over nums again and set res[i] to 0 if nums[i] is not 0, or set it to the value of product if nums[i] is 0.

If flag = 2, it means there are two or more zeroes in nums.
In this case, iterate over nums again and set all elements of res to 0.

If flag is 0, it means there are no zeroes in nums. In this case, iterate over nums again and set res[i] to the value of product divided by nums[i]. Note that (long) is used for typecasting to ensure that the division result is a long type.
Finally, return the res array.*/
