//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java
//Using Binary Search
class Solution {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        if (n > m)
        {
            return kthElement(arr2, arr1, m, n, k);
        }
        int low = Math.max(0, k - m); // Set the lower bound of the binary search range
        int high = Math.min(k, n); // Set the upper bound of the binary search range
        
        while (low <= high) 
        {
            int mid1 = (low + high) >> 1; // Calculate the mid-point of the search range
            int mid2 = k - mid1; // Calculate the complementary mid position
            
            int l1 = mid1 == 0 ? Integer.MIN_VALUE : arr1[mid1 - 1]; // Get the left element in the first array
            int l2 = mid2 == 0 ? Integer.MIN_VALUE : arr2[mid2 - 1]; // Get the left element in the second array
            int r1 = mid1 == n ? Integer.MAX_VALUE : arr1[mid1]; // Get the right element in the first array
            int r2 = mid2 == m ? Integer.MAX_VALUE : arr2[mid2]; // Get the right element in the second array
            
            if (l1 <= r2 && l2 <= r1)
            {
                return Math.max(l1, l2); 
                // Found the kth element
            } else if (l1 > r2) 
            {
                high = mid1 - 1;
                // Adjust the search range to the left
            } else
            {
                low = mid1 + 1; 
                // Adjust the search range to the right
            }
        }
        
        return -1; // kth element not found
    }
}
/*
Input-
arr1 = [2, 3, 6, 7, 9]
arr2 = [1, 4, 8, 10]

n = 5 (arr1 lemgth)
m = 4 
k = 5
Steps
1: Since n (5) !>m (4), we continue with the given arrays.

2: The search range  initialized with 
low = max(0, 5 - 4) = 1 
high = min(5, 4) = 4

3: The binary search loop starts with low = 1 and high = 4.

4: Inside the loop:

cut1 = (1 + 4) >> 1 = 2 (mid-point of the search range).
cut2 = 5 - 2 = 3 (complementary mid position).
Step 5: The algorithm compares the elements around the mid positions:

l1 = arr1[mid1 - 1] = arr1[2 - 1] = 3
l2 = arr2[nid2 - 1] = arr2[3 - 1] = 8
r1 = arr1[mid1] = arr1[2] = 6
r2 = arr2[mid2] = arr2[3] = 10

Step 6: Here, l1 (3) <= r2 (10) and l2 (8) <=r1 (6),so the condition is satisfied.

The maximum of l1 and l2 is 8, which is the 5th element in the merged sorted arrays.

Step 7: The algorithm returns 8, which is the k-th element.

 5th element in the merged sorted arrays [2, 3, 6, 7, 9, 1, 4, 8, 10] is 8. */